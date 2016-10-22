package ar.edu.ub.pcsw2016;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CCWTournament
{
    public CCWTournament(int abilityPoints)
    {
        m_players = new ArrayList<CCWPlayer>();
        m_matches = new ArrayList<CCWMatch>();
        m_abilityPoints = abilityPoints;
    }

    public int maxAbility()
    {
        return m_abilityPoints;
    }
    
    public void addPlayer(CCWPlayer player)
    {
        if(player == null)
        {
            System.out.println("Player cannot be null");
            return;
        }
        else if(player.warrior() == null)
        {
            System.out.println("Player " + player.student().name() + " cannot participate as he has no warrior");
            return;
        }
        else if(!player.warrior().valid())
        {
            System.out.println("Player " + player.student().name() + " cannot participate as his warrior is invalid");
            return;
        }

        m_players.add(player);
    }
    
    public void play()
    {
        for(int i = 0; i < m_players.size(); i++)
        {
            for(int j = i + 1; j < m_players.size(); j++)
            {
                m_matches.add(new CCWMatch(m_players.get(i), m_players.get(j), m_abilityPoints));
            }
        }
        
        Collections.shuffle(m_matches, new Random(System.nanoTime()));
        
        for(CCWMatch m : m_matches)
        {
            m.play();
        }
        
        for(CCWPlayer p : m_players)
        {
            System.out.println(p.student().name() + ": " + p.points() + " points");
        }
    }
    
    private ArrayList<CCWPlayer> m_players;
    private ArrayList<CCWMatch> m_matches;
    private int m_abilityPoints;
}
