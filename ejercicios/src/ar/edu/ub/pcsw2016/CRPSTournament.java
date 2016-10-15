package ar.edu.ub.pcsw2016;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CRPSTournament
{
    public CRPSTournament()
    {
        m_players = new ArrayList<CRPSPlayer>();
        m_matches = new ArrayList<CRPSMatch>();
    }

    public void addPlayer(CRPSPlayer player)
    {
        m_players.add(player);
    }

    public void play()
    {
        for(int i = 0; i < m_players.size(); i++)
        {
            for(int j = i + 1; j < m_players.size(); j++)
            {
                m_matches.add(new CRPSMatch(m_players.get(i), m_players.get(j)));
            }
        }

        Collections.shuffle(m_matches, new Random(System.nanoTime()));

        for(CRPSMatch m : m_matches)
        {
            m.play();
        }

        for(CRPSPlayer p : m_players)
        {
            System.out.println(p.student().name() + ": " + p.points() + " points");
        }
    }

    private ArrayList<CRPSPlayer> m_players;
    private ArrayList<CRPSMatch> m_matches;
}
