package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IExercise;

public class CExerciseGitSetUp extends CExercise implements IExercise {

    /*
    Constructor
     */
    public CExerciseGitSetUp(ID id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("fginzo");
    }
}
