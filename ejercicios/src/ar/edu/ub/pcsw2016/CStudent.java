package ar.edu.ub.pcsw2016;

import java.util.LinkedList;
import java.util.List;

/**
 Created by Didier on 19/8/2016.
 */
public abstract class CStudent implements IStudent
{
    List<IExercise> m_exercises = new LinkedList<IExercise>();
    
    public void addExercise(IExercise exercise)
    {
        m_exercises.add(exercise);
    }
    
    public IExercise exercise(IExercise.ID withId)
    {
        for(IExercise e : m_exercises)
        {
            if(e.id() == withId)
            {
                return e;
            }
        }
        
        return null;
    }
    
    public float gradesAverage()
    {
        float average = 0.0f;
        
        for(IExercise e : m_exercises)
        {
            average += e.grade();
        }
        
        if(m_exercises.size() > 0)
        {
            average = average / m_exercises.size();
        }
        
        return average;
    }
}
