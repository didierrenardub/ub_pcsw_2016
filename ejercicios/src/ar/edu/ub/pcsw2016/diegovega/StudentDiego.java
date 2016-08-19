package ar.edu.ub.pcsw2016.diegovega;
import java.util.*;
import ar.edu.ub.pcsw2016.*;

/**
 * Created by Pulpo on 06/08/2016.
 */
public class StudentDiego implements IStudent{
    private ArrayList<IExercise> exerciseList = new ArrayList<IExercise>();


    public StudentDiego(){
    }

    public String name() {
        return "Diego Santiago Vega";
    }

    public int registrationNumber() {
        return 3116;
    }

    public void addExercise(IExercise exercise) {
        exerciseList.add(exercise);
    }

    public IExercise exercise(IExercise.ID withId) {
        if (withId != null) {
            if (exerciseList.size() > 0) {
                for (IExercise e : exerciseList) {
                    if (e.id() == withId) {
                        return e;
                    }
                }
            }
        }
        return null;
    }

    public float gradesAverage() {
        if (exerciseList.size() > 0) {
            float average = 0;
            int exerciseListLength = exerciseList.size();
            for (IExercise e : exerciseList) {
                average += e.grade();
            }
            average = average / exerciseListLength;
            return average;
        }
        return 0;
    }
}
