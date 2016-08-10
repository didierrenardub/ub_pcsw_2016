package ar.edu.ub.pcsw2016.diegovega;
import java.util.*;

/**
 * Created by Pulpo on 06/08/2016.
 */
public class StudentCreation implements IExercise{
    public void run(){
        System.out.println("User name: " + this.userName);
    }

    public ID id() {
        return GitSetup.ID.GIT_SETUP;
    }

    public float grade(IExercise exercise) {
        float grade = 0;
        for (IExercise e : excerciseList) {
            if (e == exercise){
                return e.grade();
            }
        }
        return grade;
    }

    public void setGrade(float grade) {
        this.studentGrade = grade;
    }

    public static void main (String[] args) {
        Diego diego = new Diego();
    }
}
