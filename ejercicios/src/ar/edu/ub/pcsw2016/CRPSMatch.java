package ar.edu.ub.pcsw2016;

import java.util.ArrayList;

public class CRPSMatch
{
    public CRPSMatch(CRPSPlayer p1, CRPSPlayer p2)
    {
        this.m_home = p1;
        this.m_away = p2;
    }

    public CRPSPlayer home()
    {
        return this.m_home;
    }

    public CRPSPlayer away()
    {
        return this.m_away;
    }

    public void play()
    {
        play(10);
    }

    public void play(int roundCount)
    {
        final long WAIT_TIME = 0;

        print("***********************\n", 0);
        print("Next match: " + home().student().name() + " vs " + away().student().name() + "\n", 0);
        print("***********************\n\n", WAIT_TIME * 3);

        ArrayList<String> homeMoves = new ArrayList<String>();
        ArrayList<String> awayMoves = new ArrayList<String>();
        int homeScore = 0;
        int awayScore = 0;
        for(int i = 0; i < roundCount; i++)
        {
            String homeMove = home().ia().play(awayMoves, away().history());
            String awayMove = away().ia().play(homeMoves, home().history());

            home().addMove(homeMove);
            away().addMove(awayMove);

            homeMoves.add(homeMove);
            awayMoves.add(awayMove);

            print(home().student().name() + " played " + homeMove + "\n", WAIT_TIME);
            print(away().student().name() + " played " + awayMove + "\n", WAIT_TIME / 2);

            if(beats(homeMove, awayMove))
            {
                homeScore++;
                print(home().student().name() + " scores!\n", WAIT_TIME / 2);
            }
            else if(beats(awayMove, homeMove))
            {
                awayScore++;
                print(away().student().name() + " scores!\n", WAIT_TIME / 2);
            }
            else
            {
                print("Round drawn.\n", WAIT_TIME / 2);
            }

            print(home().student().name() + ": " + homeScore + " - " + away().student().name() + ": " + awayScore + "\n\n", WAIT_TIME);
        }

        if(homeScore > awayScore)
        {
            home().win();
            print("***********************\n", 0);
            print(home().student().name().toUpperCase() + " won the match!\n", 0);
            print("***********************\n\n", WAIT_TIME);
        }
        else if(awayScore > homeScore)
        {
            away().win();
            print("***********************\n", 0);
            print(away().student().name().toUpperCase() + " won the match!\n", 0);
            print("***********************\n\n", WAIT_TIME);
        }
        else
        {
            home().draw();
            away().draw();
            print("Match drawn.\n\n", WAIT_TIME);
        }
    }

    public boolean beats(String a, String b)
    {
        return a.equals(MOVES.ROCK) && b.equals(MOVES.SCISORS)
            || a.equals(MOVES.PAPER) && b.equals(MOVES.ROCK)
            || a.equals(MOVES.SCISORS) && b.equals(MOVES.PAPER);
    }

    public void print(String str, long time) // wait long time? boring
    {
        System.out.print(str);
        try
        {
            Thread.sleep(time);
        }
        catch(InterruptedException e)
        {

        }
    }

    private CRPSPlayer m_home;
    private CRPSPlayer m_away;
}
