package ar.edu.ub.pcsw2016;

import java.util.ArrayList;

public class CRPSPlayer
{
    public CRPSPlayer(IStudent student, IRPSIA ia)
    {
        this.m_student = student;
        this.m_history = new ArrayList<String>();
        this.m_ia = ia;
    }

    public IRPSIA ia()
    {
        return this.m_ia;
    }

    public IStudent student()
    {
        return m_student;
    }

    public ArrayList<String> history()
    {
        return this.m_history;
    }

    public void addMove(String move)
    {
        this.m_history.add(move);
    }

    public int points()
    {
        return this.m_points;
    }

    public void win()
    {
        this.m_points += 3;
    }

    public void draw()
    {
        this.m_points += 1;
    }

    private IStudent m_student;
    private IRPSIA m_ia;
    private ArrayList<String> m_history;
    private int m_points;
}
