package ar.edu.ub.pcsw2016.diegovega;

import ar.edu.ub.pcsw2016.IEncoder;
import ar.edu.ub.pcsw2016.IExercise;

import java.util.ArrayList;

/**
 * Created by Pulpo on 13/08/2016.
 */
public abstract class Exercise implements IExercise, IEncoder {
    private ArrayList<IExercise> excerciseList = new ArrayList<IExercise>();
    private float grade = 0;

    public void run(){
    }

    public float grade() {
        return this.grade;
    }

    public ID id(){
        return null;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String encode(String what){
        return null;
    }
}
