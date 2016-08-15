package ar.edu.ub.pcsw2016.diegovega;

import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.IStudent;

import java.util.ArrayList;

/**
 * Created by Pulpo on 06/08/2016.
 */
public class Diego implements IStudent {
    private String name = "Diego Santiago Vega";
    private int registrationNumber = 3116;
    private ArrayList<IExercise> excerciseList = new ArrayList<IExercise>();


    public Diego(){
    }

    public String name() {
        return this.name;
    }

    public int registrationNumber() {
        return this.registrationNumber;
    }

    public void addExercise(IExercise exercise) {
        excerciseList.add(exercise);
    }

    public IExercise exercise(IExercise.ID withId) {
        for (IExercise e : excerciseList)
        {
            if (e.id() == withId){
                return e;
            }
        }
        return null;
    }

    public float gradesAverage() {
        float average = 0;
        int exerciseListLength = excerciseList.size();
        for (IExercise e : excerciseList) {
            average += e.grade();
        }
        average = average / exerciseListLength;
        return average;
    }
}
