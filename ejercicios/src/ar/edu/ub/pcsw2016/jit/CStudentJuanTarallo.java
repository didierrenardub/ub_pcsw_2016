package ar.edu.ub.pcsw2016.jit;

import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.IStudent;

import java.util.LinkedList;
import java.util.List;


public class CStudentJuanTarallo implements IStudent {

    private int registrationNumber;
    private String name;
    private String surname;
    private List<IExercise> exercises;

    // Constructor

    public CStudentJuanTarallo() {
        this("Juan", "Tarallo", 3129);
    }

    // Segundo constructor

    public CStudentJuanTarallo(String name, String surname, int registrationNumber) {
        this.name = name;
        this.surname = surname;
        this.registrationNumber = registrationNumber;
        this.exercises = new LinkedList<>();
    }


    // Getter del apellido

    private String getSurname() {
        return this.surname;
    }

    // Getter del nombre y apellido

    public String name() {
        return getName() + " " + getSurname();
    }

    @Override
    public int registrationNumber() {
        return 0;
    }

    // Getter de la lista de ejercicios

    public List<IExercise> getExercises() {
        return this.exercises;
    }

    // Agrega un ejercicio a la lista de ejercicios

    public void addExercise(IExercise exercise) {
        exercises.add(exercise);
    }

    // Devuelve el ejercicio cuyo ID coincide con el ID pasado como argumento

    public IExercise exercise(IExercise.ID withId) {
        if (!getExercises().isEmpty()) {
            for (IExercise exercise : getExercises()) {
                if (exercise.id() == withId) {
                    return exercise;
                }
            }
        }
        return null;
    }

    // Calcula la nota promedio considerando cantidad de ejercicios y nota asignada a cada uno de ellos

    public float gradesAverage() {
        if (getExercises().size() > 0) {
            float average = 0;
            int getExerciseLength = getExercises().size();
            for (IExercise ejercicio : getExercises()) {
                average += ejercicio.grade();
            }
            average = average / getExerciseLength;
            return average;
        }
        return 0;


    }

    // Getter del nombre

    public String getName() {
        return name;
    }

    // Getter de matricula

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    // Setter de matricula

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
