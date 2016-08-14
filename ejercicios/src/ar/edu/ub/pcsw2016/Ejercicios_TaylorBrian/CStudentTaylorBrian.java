package ar.edu.ub.pcsw2016.Ejercicios_TaylorBrian;
import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.IStudent;

import java.util.ArrayList;

public class CStudentTaylorBrian implements IStudent{
    private ArrayList <IExercise> exerciseArrayList= new ArrayList <IExercise>();

    public CStudentTaylorBrian(){

    }

    public String name(){
        return "Brian Agustín Taylor";
    }
    public int registrationNumber(){
        return 03132;
    }
    public void addExercise(IExercise exercise){
        exerciseArrayList.add(exercise);
    }

    @Override
    public IExercise exercise(IExercise.ID withId) {
        for (IExercise ejercicio: exerciseArrayList)
        { if (ejercicio.id() == withId){
            return withId;
        }
        else return null;
        }
        return exercise(withId);
    }

       public float gradesAverage(){
        float average= 0.0f;
        int cantidadEjecicios= exerciseArrayList.size();
        if (exerciseArrayList.isEmpty()){
            return 0.0f;
        }
        else {
            for (IExercise ejercicio : exerciseArrayList) {
                average = average + ejercicio.grade();
            }
            average = average / cantidadEjecicios;
        }
        return average;
    }
}