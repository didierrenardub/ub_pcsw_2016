package ar.edu.ub.pcsw2016.diegovega;

import ar.edu.ub.pcsw2016.IExercise;

import java.util.ArrayList;

/**
 * Created by Pulpo on 13/08/2016.
 */
public abstract class Exercise implements IExercise {
    private ArrayList<IExercise> excerciseList = new ArrayList<IExercise>();

    public void run(){
    }

    public float grade() {
        return Float.parseFloat(null);
    }

    public ID id(){
        return null;
    }

    public void setGrade(float grade) {

    }
}
