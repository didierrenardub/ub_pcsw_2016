package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IExercise;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CStudentFranciscoGinzoTest extends Assert {

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
        ExerciseStudentCreation studentCreation = new ExerciseStudentCreation(IExercise.ID.STUDENT_CREATION);
        CExerciseEncoding cExerciseEncoding = new CExerciseEncoding(IExercise.ID.ENCODING);
        ginzo.addExercise(gitSetup);
        ginzo.addExercise(studentCreation);
        ginzo.addExercise(cExerciseEncoding);
        float grade1 = 8;
        float grade2 = 5;
        float grade3 = 7;
        float average = (grade1 + grade2 + grade3) / ginzo.getEjercicios().size();
        gitSetup.setGrade(grade1);
        studentCreation.setGrade(grade2);
        assertEquals(average, ginzo.gradesAverage(), DELTA);
    }

}