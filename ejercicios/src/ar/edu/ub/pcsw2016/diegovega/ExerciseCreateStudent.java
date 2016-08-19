package ar.edu.ub.pcsw2016.diegovega;

import ar.edu.ub.pcsw2016.IExercise;

/**
 * Created by Pulpo on 13/08/2016.
 */
public class ExerciseCreateStudent extends Exercise{

    public IExercise.ID id() {
        return ExerciseCreateStudent.ID.STUDENT_CREATION;
    }

    public void run(){
        System.out.println("ExerciseCreateStudent");
    }
}
