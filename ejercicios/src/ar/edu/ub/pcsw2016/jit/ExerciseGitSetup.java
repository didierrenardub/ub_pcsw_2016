package ar.edu.ub.pcsw2016.jit;

import ar.edu.ub.pcsw2016.IExercise;

public class ExerciseGitSetup implements IExercise {

    private ID id;
    private float grade;

    // Constructor

    public ExerciseGitSetup(ID id) {
        this.id = id;
    }

    // Getter de ID

    public ID getId() {
        return this.id;
    }

    @Override
    public ID id() {
        return null;
    }

    public void run() {
        System.out.println("JIT");
    }

    @Override
    public float grade() {
        return 0;
    }

    // Getter de grade

    public float getGrade() {
        return this.grade;
    }

    // Setter de grade

    @Override
    public void setGrade(float grade) {
        if (grade >= 0 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("La nota ingresada no es valida.");
        }
    }

    // Conversor de ID a string

    public String toString() {
        return this.id() + " ";
    }
}
