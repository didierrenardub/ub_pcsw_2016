package ar.edu.ub.pcsw2016.jit;

import ar.edu.ub.pcsw2016.IExercise;

class ExerciseStudentCreation implements IExercise {

    private float grade;
    private IExercise.ID id;

    // Constructor

    ExerciseStudentCreation(IExercise.ID id) {
        this.id = id;
    }

    // Getter del ID del ejercicio

    public IExercise.ID id() {
        return this.id;
    }

    public void run() {
        System.out.println(new CStudentJuanTarallo().name());
    }


    // Setter de la nota del ejercicio sólo en un rango predefinido

    public void setGrade(float grade) {
        if (grade >= 0 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("La nota ingresada no es valida");
        }
    }


    // Getter de la nota asignada al ejercicio

    public float grade() {
        return grade;
    }

    public String toString() {
        return this.id() + " ";
    }

}