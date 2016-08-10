package ar.edu.ub.pcsw2016.diegovega;
import java.util.*;

/**
 * Created by Pulpo on 06/08/2016.
 */
public class GitSetup implements IExercise {
    private String userName = "Dienry";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

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
}
