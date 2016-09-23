package ar.edu.ub.pcsw2016.MartinAranda;

import ar.edu.ub.pcsw2016.IEncoder;
import ar.edu.ub.pcsw2016.IExercise;

import java.util.ArrayList;

public class Exercise implements IExercise {
    private float grade = 0;

    public void run(){
    }

    public float grade() {
        return this.grade;
    }

    public IExercise.ID id(){
        return null;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
