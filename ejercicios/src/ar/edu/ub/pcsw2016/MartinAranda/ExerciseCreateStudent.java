package ar.edu.ub.pcsw2016.MartinAranda;

import ar.edu.ub.pcsw2016.IExercise;

public class ExerciseCreateStudent extends Exercise{
    public IExercise.ID id() {
        return ar.edu.ub.pcsw2016.MartinAranda.ExerciseCreateStudent.ID.STUDENT_CREATION;
    }

    public void run(){
        System.out.println("ExerciseCreateStudent");
    }
}
