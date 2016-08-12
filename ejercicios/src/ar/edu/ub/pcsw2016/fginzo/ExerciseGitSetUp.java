package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IExercise;

public class ExerciseGitSetUp implements IExercise {

    private float grade;
    private ID id;

    /*
    Constructor
     */
    public ExerciseGitSetUp (ID id) {
        this.id = id;
    }

    /*
    Getter del ID del ejercicio
     */
    @Override
    public ID id() {
        return this.id;
    }

    @Override
    public void run() {
        System.out.println("fginzo");
    }

    /*
    Setter de la nota del ejercicio sólo en un rango predefinido
     */
    @Override
    public void setGrade(float grade) {
        if (grade >= 0 && grade <= 10) {
            this.grade = grade;
        }
        else {
            System.out.println("La nota ingresada no corresponde al sistema de calificación (0 a 10 ambos inclusive).");
        }
    }

    /*
    Getter de la nota asignada al ejercicio
     */
    @Override
    public float grade() {
        return grade;
    }

    public String toString() {
        return this.id() + " ";
    }

}
