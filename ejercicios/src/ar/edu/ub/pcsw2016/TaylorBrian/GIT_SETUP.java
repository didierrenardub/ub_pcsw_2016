package ar.edu.ub.pcsw2016.TaylorBrian;
import ar.edu.ub.pcsw2016.IExercise;

public class GIT_SETUP implements IExercise{
    private float grade = 0.0f;
    public float grade(){
        return grade;
    }

    public ID id(){
        return IExercise.ID.GIT_SETUP;
    }

    public void run(){
        System.out.println("NibraT");
    }

    public void setGrade(float grade){
        if(grade < 1 || grade>10   ){
            System.out.println("valor invalido de nota");
        }
        else
        this.grade =grade;
        }
}