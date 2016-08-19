package ar.edu.ub.pcsw2016.diegovega;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Pulpo on 15/08/2016.
 */
public class ExercisesTest {
    @Before
    public void setUp() throws Exception {
        System.out.println(" ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(" ");
    }

    @Test
    public void idTestGitSetup() throws Exception {
        ExerciseGitSetup gitSetup = new ExerciseGitSetup();
        System.out.println(gitSetup.id());
        gitSetup.run();
    }

    @Test
    public void idTestCreateStudent() throws Exception {
        ExerciseCreateStudent createStudent = new ExerciseCreateStudent();
        System.out.println(createStudent.id());
        createStudent.run();
    }
}
