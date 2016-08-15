package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.IStudent;

import java.util.LinkedList;
import java.util.List;

public class CStudentFranciscoGinzo implements IStudent {

    private final String APELLIDO;
    private final String NOMBRE;
    private final int MATRICULA;
    private List<IExercise> ejercicios;

    /*
    Constructor
    */
    public CStudentFranciscoGinzo() {
        this("Francisco", "Ginzo", 3113);
        }

    /*
    Constructor
    */
    public CStudentFranciscoGinzo(String nombre, String apellido, int matricula) {
        this.NOMBRE = nombre;
        this.APELLIDO = apellido;
        this.MATRICULA = matricula;
        this.ejercicios = new LinkedList<>();
    }

    /*
    Getter de los atributos nombre, apellido
    */
    @Override
    public String name() {
        return getNombre() + " " + getApellido();
    }

    /*
    Getter del atributo matricula
    */
    @Override
    public int registrationNumber() {
        return this.MATRICULA;
    }

    /*
    Calcula la nota promedio considerando cantidad de ejercicios y
    nota asignada a cada uno de los mismos
    */
    @Override
    public float gradesAverage() {
        try {
            float average;
            int cantidad = getEjercicios().size();
            float puntajeTotal = 0;
            for (int i = 0; i < cantidad; i++) {
                puntajeTotal += getEjercicios().get(i).grade();
            }
            average = puntajeTotal / cantidad;
            return average;
        }
        catch (Exception e) {
            System.out.println("El alumno no tiene ejercicios asignados.");
        }
        return 0;
    }

    /*
    Agrega un ejercicio a la lista de ejercicios
    */
    @Override
    public void addExercise(IExercise exercise) {
        ejercicios.add(exercise);
    }

    /*
    Devuelve el ejercicio cuyo ID coincide con el ID pasado como argumento
    */
    @Override
    public IExercise exercise(IExercise.ID withId) {
        if (! getEjercicios().isEmpty()) {
            for (IExercise ejercicio : getEjercicios()) {
                if (ejercicio.id() == withId) {
                    return ejercicio;
                }
            }
        }
        return null;
    }

    public String getApellido() {
        return this.APELLIDO;
    }

    public void setEjercicios(List<IExercise> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public List<IExercise> getEjercicios() {
        return this.ejercicios;
    }

    public String getNombre() {
        return this.NOMBRE;
    }

}

