package ar.edu.ub.pcsw2016.MartinAranda;

import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.IStudent;

import java.util.ArrayList;

public class StudentMartin implements IStudent {
    private ArrayList<IExercise> exerciseList = new ArrayList<IExercise>();


    public StudentMartin(){
    }

    public String name() {
        return "Edgardo Martin Aranda";
    }

    public int registrationNumber() {
        return 3123;
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
