package ar.edu.ub.pcsw2016.diegovega;
import ar.edu.ub.pcsw2016.*;
import java.util.ArrayList;

/**
 * Created by Pulpo on 06/08/2016.
 */
public class StudentCreation implements IExercise{
    private String name = "StudentCreation";
    private ArrayList<IExercise> excerciseList = new ArrayList<IExercise>();
    private float grade;

    public void run(){
        System.out.println("User name: " + this.name);
    }

    public float grade() {
        return this.grade;
    }

    public ID id() {
        return StudentCreation.ID.STUDENT_CREATION;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
