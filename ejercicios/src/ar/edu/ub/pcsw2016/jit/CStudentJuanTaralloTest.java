package ar.edu.ub.pcsw2016.jit;

import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.jit.ExerciseGitSetUp;
import ar.edu.ub.pcsw2016.jit.ExerciseStudentCreation;
import ar.edu.ub.pcsw2016.jit.CStudentJuanTarallo;


public class CStudentJuanTaralloTest {

    private static final double DELTA = 1e-15;

    public void setUp() throws Exception {
        System.out.println(" ");
    }

    public void tearDown() throws Exception {
        System.out.println(" ");
    }

    public void gradesAverage() throws Exception {
        CStudentJuanTarallo jit = new CStudentJuanTarallo();
        ExerciseGitSetUp gitSetup = new ExerciseGitSetUp(IExercise.ID.GIT_SETUP);
        ExerciseStudentCreation studentCreation = new ExerciseStudentCreation(IExercise.ID.STUDENT_CREATION);
        jit.addExercise(gitSetup);
        jit.addExercise(studentCreation);
        float grade1 = 9;
        float grade2 = 2;
        float average = (grade1 + grade2) / jit.getEjercicios().size();
        gitSetup.setGrade(grade1);
        studentCreation.setGrade(grade2);
        assertEquals(average, jit.gradesAverage(), DELTA);
    }
}
