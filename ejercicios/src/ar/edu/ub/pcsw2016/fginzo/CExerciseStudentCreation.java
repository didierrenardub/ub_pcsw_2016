package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IExercise;

public class CExerciseStudentCreation extends CExercise implements IExercise {

    /*
    Constructor
     */
    public CExerciseStudentCreation(IExercise.ID id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(new CStudentFranciscoGinzo().name());
    }
}
