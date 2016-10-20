package ar.edu.ub.pcsw2016.MartinAranda;

import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.MartinAranda.Exercise;

public class ExerciseGitSetup extends Exercise{
    public IExercise.ID id() {
        return ar.edu.ub.pcsw2016.MartinAranda.ExerciseGitSetup.ID.GIT_SETUP;
    }

    public void run(){
        System.out.println("ExerciseGitSetup");
    }
}
