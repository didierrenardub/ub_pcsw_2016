package ar.edu.ub.pcsw2016;

import java.util.ArrayList;
import java.util.Random;

public class CRPSBattleBot implements IStudent, IRPSIA
{
    public CRPSBattleBot(String botName)
    {
        m_botName = botName;
    }

    public float gradesAverage()
    {
        return 0.0f;
    }

    public IExercise exercise(IExercise.ID withId)
    {
        return null;
    }

    public int registrationNumber()
    {
        return 666;
    }

    public void addExercise(IExercise ex)
    {
    }

    public String name()
    {
        return "BattleBot/" + m_botName;
    }

    public String play(ArrayList<String> opponentMoves, ArrayList<String> opponentHistory)
    {
        Random r = new Random();

        switch(r.nextInt(3))
        {
            case 0:
                return MOVES.ROCK;
            case 1:
                return MOVES.PAPER;
            case 2:
                return MOVES.SCISORS;
        }

        return MOVES.ROCK;
    }

    private String m_botName;
}
