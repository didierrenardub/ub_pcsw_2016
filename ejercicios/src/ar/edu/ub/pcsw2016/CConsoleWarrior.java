package ar.edu.ub.pcsw2016;

import java.util.ArrayList;

/**
 Created by Didier on 21/10/2016.
 */
public abstract class CConsoleWarrior
{
    abstract public String name();
    abstract public int power();
    abstract public int health();
    abstract public int accuracy();
    abstract public int defense();
    abstract public WARRIOR_ABILITY ability();
    abstract public WARRIOR_ACTION action(ArrayList<WARRIOR_ACTION> opponentActions);
    
    public CConsoleWarrior(int abilityPoints)
    {
        this.m_totalAbilityPoints = abilityPoints;
        this.m_status = WARRIOR_STATUS.NORMAL;
        this.m_currentHealth = 0;
    }
    
    public final boolean valid()
    {
        if(power() < 1 || health() < 1 || accuracy() < 1 || defense() < 1)
        {
            return false;
        }
        
        return (power() + health() + accuracy() + defense()) == m_totalAbilityPoints;
    }

    public final void hit(int by)
    {
        this.m_currentHealth -= by;
    }

    public final int currentHealth()
    {
        return this.m_currentHealth;
    }

    public final boolean alive()
    {
        return this.m_currentHealth > 0;
    }

    public final void reset()
    {
        this.m_currentHealth = health();
        this.m_status = WARRIOR_STATUS.NORMAL;
    }
    
    public final WARRIOR_STATUS status()
    {
        return m_status;
    }
    
    public final void stun()
    {
        m_status = WARRIOR_STATUS.STUNNED;
    }
    
    public final void makeDizzy()
    {
        m_status = WARRIOR_STATUS.DIZZY;
    }
    
    public final void normalize()
    {
        m_status = WARRIOR_STATUS.NORMAL;
    }
    
    private int m_totalAbilityPoints;
    private WARRIOR_STATUS m_status;
    private int m_currentHealth;
}
