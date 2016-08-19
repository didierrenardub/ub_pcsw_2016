package ar.edu.ub.pcsw2016.diegovega;

import ar.edu.ub.pcsw2016.IExercise;

/**
 * Created by Pulpo on 13/08/2016.
 */
public class ExerciseGitSetup extends Exercise{

    public IExercise.ID id() {
        return ExerciseGitSetup.ID.GIT_SETUP;
    }

    public void run(){
        System.out.println("ExerciseGitSetup");
    }

}
