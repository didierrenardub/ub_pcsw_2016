package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IExercise;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CExerciseEncodingTest extends Assert {

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
        float grade1 = 9;
        float grade2 = 0;
        float grade3 = 10;
        float grade4 = -1;
        new CExerciseEncoding(IExercise.ID.ENCODING).setGrade(grade1);
        assertTrue(grade1 >= 0 && grade1 <= 10);
        new CExerciseEncoding(IExercise.ID.ENCODING).setGrade(grade2);
        assertTrue(grade2 >= 0 && grade2 <= 10);
        new CExerciseEncoding(IExercise.ID.ENCODING).setGrade(grade3);
        assertTrue(grade3 >= 0 && grade3 <= 10);
        new CExerciseEncoding(IExercise.ID.ENCODING).setGrade(grade4);
        assertTrue(grade4 >= 0 && grade4 <= 10);
    }
}