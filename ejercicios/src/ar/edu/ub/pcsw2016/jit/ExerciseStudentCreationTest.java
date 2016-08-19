package ar.edu.ub.pcsw2016.jit;

import ar.edu.ub.pcsw2016.IExercise;
import org.junit.Assert;

public class ExerciseStudentCreationTest extends Assert {

    public void setUp() throws Exception {
        System.out.println(" ");
    }

    public void tearDown() throws Exception {
        System.out.println(" ");
    }

    public void setGrade() throws Exception {
        float grade = 9;
        new ExerciseStudentCreation(IExercise.ID.STUDENT_CREATION).setGrade(grade);
        assertTrue(grade >= 0 && grade <= 10);
    }

}