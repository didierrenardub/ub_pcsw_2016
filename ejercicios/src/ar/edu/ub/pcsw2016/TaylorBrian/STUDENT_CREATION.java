package ar.edu.ub.pcsw2016.TaylorBrian;

import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.TaylorBrian.CStudentTaylorBrian;

public class STUDENT_CREATION implements IExercise {
    private float grade = 0.0f;
    CStudentTaylorBrian Brian = new CStudentTaylorBrian();

    public float grade() {
        return grade;
    }

    public ID id() {
        return ID.STUDENT_CREATION;
    }

    public void run() {
        System.out.println("Nombre del alumno:" + Brian.name() + "\n Numero de registro:" + Brian.registrationNumber() +
                "\n Promedio:" + Brian.gradesAverage());
    }


    public void setGrade(float grade){
        if(grade < 1 || grade>10   ){
            System.out.println("valor invalido de nota");
        }
        else
            this.grade=grade;
    }
}