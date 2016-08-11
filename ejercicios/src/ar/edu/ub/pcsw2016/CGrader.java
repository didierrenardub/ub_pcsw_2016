package ar.edu.ub.pcsw2016;

import java.util.ArrayList;

public class CGrader
{
    public static CGrader instance()
    {
        return new CGrader();
    }
    
    public CGrader()
    {
        m_grades = new ArrayList<>();
    }
    
    public CGrader completion(float grade)
    {
        m_grades.add(grade);
        
        return this;
    }
    
    public CGrader prolixity(float grade)
    {
        m_grades.add(grade);
    
        return this;
    }
    
    public CGrader design(float grade)
    {
        m_grades.add(grade);
    
        return this;
    }
    
    public float finalGrade()
    {
        Float total = 0.0f;
        for(Float g : m_grades)
        {
            total += g;
        }
        
        return total / m_grades.size();
    }
    
    ArrayList<Float> m_grades;
}
