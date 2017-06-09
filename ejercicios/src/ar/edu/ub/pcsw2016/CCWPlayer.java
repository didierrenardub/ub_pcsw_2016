package ar.edu.ub.pcsw2016;

import java.util.ArrayList;

public class CCWPlayer
{
    public CCWPlayer(IStudent student, CConsoleWarrior warrior)
    {
        this.m_student = student;
        this.m_warrior = warrior;
    }
    
    public CConsoleWarrior warrior()
    {
        return this.m_warrior;
    }
    
    public IStudent student()
    {
        return m_student;
    }
    
    public int points()
    {
        return this.m_points;
    }
    
    public void win(int points)
    {
        this.m_points += points;
    }
    
    private IStudent m_student;
    private CConsoleWarrior m_warrior;
    private int m_points;
}
