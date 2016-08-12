package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IExercise;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExerciseStudentCreationTest extends Assert {

    @Before
    public void setUp() throws Exception {
        System.out.println(" ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(" ");
    }

    @Test
    public void setGrade() throws Exception {
        float grade = 9;
        new ExerciseStudentCreation(IExercise.ID.STUDENT_CREATION).setGrade(grade);
        assertTrue(grade >= 0 && grade <= 10);
    }

}