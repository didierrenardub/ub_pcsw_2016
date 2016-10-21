package ar.edu.ub.pcsw2016;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CCWTournament
{
    public CCWTournament()
    {
        m_players = new ArrayList<CCWPlayer>();
        m_matches = new ArrayList<CCWMatch>();
    }
    
    public void addPlayer(CCWPlayer player)
    {
        m_players.add(player);
    }
    
    public void play()
    {
        for(int i = 0; i < m_players.size(); i++)
        {
            for(int j = i + 1; j < m_players.size(); j++)
            {
                m_matches.add(new CCWMatch(m_players.get(i), m_players.get(j)));
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
}
