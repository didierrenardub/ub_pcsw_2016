package ar.edu.ub.pcsw2016.diegovega;
import ar.edu.ub.pcsw2016.*;

import java.util.ArrayList;

/**
 * Created by Pulpo on 06/08/2016.
 */
public class GitSetup implements IExercise {
    private String exercise = "GitSetup";
    private ArrayList<IExercise> excerciseList = new ArrayList<IExercise>();
    private float grade;

    public void run(){
        System.out.println("User name: " + this.exercise);
    }

    public float grade() {
        return this.grade;
    }

    public ID id() {
        return GitSetup.ID.GIT_SETUP;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
