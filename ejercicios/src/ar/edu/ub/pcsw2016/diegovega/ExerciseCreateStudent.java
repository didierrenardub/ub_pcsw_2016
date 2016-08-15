package ar.edu.ub.pcsw2016.diegovega;

import ar.edu.ub.pcsw2016.IExercise;

/**
 * Created by Pulpo on 13/08/2016.
 */
public class ExerciseCreateStudent extends Exercise{
    private float grade = 0;

    public IExercise.ID id() {
        return ID.STUDENT_CREATION;
    }

    public void run(){
        System.out.println("ExerciseCreateStudent");
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public float grade() {
        return this.grade;
    }
}
