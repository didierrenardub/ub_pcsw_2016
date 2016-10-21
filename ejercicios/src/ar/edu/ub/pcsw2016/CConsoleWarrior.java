package ar.edu.ub.pcsw2016;

/**
 Created by Didier on 21/10/2016.
 */
public abstract class CConsoleWarrior
{
    abstract String name();
    abstract int power();
    abstract int health();
    abstract int accuracy();
    abstract int defense();
    
    public CConsoleWarrior(int abilityPoints)
    {
        this.m_totalAbilityPoints = abilityPoints;
        this.m_status = WARRIOR_STATUS.NORMAL;
    }
    
    public final boolean valid()
    {
        if(power() < 1 || health() < 1 || accuracy() < 1 || defense() < 1)
        {
            return false;
        }
        
        return (power() + health() + accuracy() + defense()) != m_totalAbilityPoints;
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
}
