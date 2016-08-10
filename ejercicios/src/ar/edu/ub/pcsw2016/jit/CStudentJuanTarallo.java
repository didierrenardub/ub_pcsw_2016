package ar.edu.ub.pcsw2016.jit;

import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.IStudent;

/**
 * Created by nacho on 8/8/2016.
 */
public class CStudentJuanTarallo implements IStudent {

    private int registrationNumber;
    private String name;

    public CStudentJuanTarallo(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String name() {
        return getName();
    }

    public int registrationNumber() {
        return registrationNumber;
    }

    public void addExercise(IExercise exercise) {

    }

    public IExercise exercise(IExercise.ID withId) {
        return null;
    }

    public float gradesAverage() {
        return 0;
    }

    public String getName() {
        return name;
    }


}
