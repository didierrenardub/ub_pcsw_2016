package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IExercise;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FranciscoGinzoTest extends Assert {

    private static final double DELTA = 1e-15;

    @Before
    public void setUp() throws Exception {
        System.out.println(" ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(" ");
    }

    @Test
    public void gradesAverage() throws Exception {
        FranciscoGinzo ginzo = new FranciscoGinzo();
        ExerciseGitSetUp gitSetup = new ExerciseGitSetUp(IExercise.ID.GIT_SETUP);
        ginzo.addExercise(gitSetup);
        gitSetup.setGrade(8);
        assertEquals(8, ginzo.gradesAverage(), DELTA);
        float grade = 8;
        gitSetup.setGrade(grade);
        assertEquals(grade, ginzo.gradesAverage(), DELTA);
    }
}
