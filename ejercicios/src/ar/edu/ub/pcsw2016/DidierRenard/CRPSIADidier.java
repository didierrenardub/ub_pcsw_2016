package ar.edu.ub.pcsw2016.DidierRenard;

import ar.edu.ub.pcsw2016.IRPSIA;
import ar.edu.ub.pcsw2016.MOVES;

import java.util.ArrayList;
import java.util.Random;

public class CRPSIADidier implements IRPSIA
{
    public CRPSIADidier()
    {
        m_myMoves = new ArrayList<String>();
    }

    public String play(ArrayList<String> opponentMoves, ArrayList<String> history)
    {
        String theMove = randomMove();

        if(m_myMoves.size() > 10)
        {
            m_myMoves.remove(m_myMoves.size() - 1);
        }

        boolean winning = currentScore(opponentMoves) >= opponentScore(opponentMoves);

        if(winning)
        {
            theMove = randomMove();
        }
        else // gotta take it seriously
        {
            int rocks = 0;
            int papers = 0;
            int scisors = 0;

            for(String oppMove : opponentMoves)
            {
                if(oppMove.equals(MOVES.ROCK))
                {
                    rocks++;
                }
                else if(oppMove.equals(MOVES.PAPER))
                {
                    papers++;
                }
                else
                {
                    scisors++;
                }
            }

            Random r = new Random();
            switch(r.nextInt(3))
            {
                case 0: // strategy one: most probable, based on statistics
                {
                    if(rocks > papers && rocks > scisors)
                    {
                        theMove = MOVES.PAPER;
                    }
                    else if(papers > rocks && papers > scisors)
                    {
                        theMove = MOVES.SCISORS;
                    }
                    else if(scisors > rocks && scisors > papers)
                    {
                        theMove = MOVES.ROCK;
                    }
                    else // odds are shared between more than one move; let fate decide
                    {
                        theMove = randomMove();
                    }
                }
                break;

                case 1: // strategy two: most probable, based on uniform distribution
                {
                    if(rocks < papers && rocks < scisors)
                    {
                        theMove = MOVES.PAPER;
                    }
                    else if(papers < rocks && papers < scisors)
                    {
                        theMove = MOVES.SCISORS;
                    }
                    else if(scisors < rocks && scisors < papers)
                    {
                        theMove = MOVES.ROCK;
                    }
                    else // odds are shared between more than one move; let fate decide
                    {
                        theMove = randomMove();
                    }
                }
                break;

                case 2: // strategy three: last move check
                {
                    String lastOpp = opponentMoves.get(opponentMoves.size() - 1);
                    String lastMine = m_myMoves.get(m_myMoves.size() - 1);
                    boolean oppWin = beats(lastOpp, lastMine);
                    if(lastOpp.equals(MOVES.ROCK))
                    {
                        if(oppWin)
                        {
                            theMove = MOVES.SCISORS;
                        }
                        else
                        {
                            theMove = MOVES.ROCK;
                        }
                    }
                    else if(lastOpp.equals(MOVES.PAPER))
                    {
                        if(oppWin)
                        {
                            theMove = MOVES.ROCK;
                        }
                        else
                        {
                            theMove = MOVES.PAPER;
                        }
                    }
                    else if(lastOpp.equals(MOVES.SCISORS) && oppWin)
                    {
                        if(oppWin)
                        {
                            theMove = MOVES.PAPER;
                        }
                        else
                        {
                            theMove = MOVES.SCISORS;
                        }
                    }
                    else
                    {
                        theMove = randomMove();
                    }
                }
                break;
            }
        }

        play(theMove);
        return theMove;
    }

    private void play(String move)
    {
        m_myMoves.add(move);
    }

    private int currentScore(ArrayList<String> opponentMoves)
    {
        if(opponentMoves.size() == 0)
        {
            return 0;
        }

        int myScore = 0;
        for(int i = 0; i < opponentMoves.size() && i < m_myMoves.size(); i++)
        {
            if(beats(m_myMoves.get(i), opponentMoves.get(i)))
            {
                myScore++;
            }
        }
        return myScore;
    }

    private int opponentScore(ArrayList<String> opponentMoves)
    {
        if(opponentMoves.size() == 0)
        {
            return 0;
        }

        int oppScore = 0;
        for(int i = 0; i < opponentMoves.size() && i < m_myMoves.size(); i++)
        {
            if(beats(m_myMoves.get(i), opponentMoves.get(i)))
            {
                oppScore++;
            }
        }
        return oppScore;
    }

    private boolean beats(String a, String b)
    {
        return a.equals(MOVES.ROCK) && b.equals(MOVES.SCISORS)
                || a.equals(MOVES.PAPER) && b.equals(MOVES.ROCK)
                || a.equals(MOVES.SCISORS) && b.equals(MOVES.PAPER);
    }

    private String randomMove()
    {
        Random r = new Random();

        switch(r.nextInt(3))
        {
            case 0:
                return MOVES.ROCK;
            case 1:
                return MOVES.PAPER;
        }

        return MOVES.SCISORS;
    }

    private ArrayList<String> m_myMoves;
}
