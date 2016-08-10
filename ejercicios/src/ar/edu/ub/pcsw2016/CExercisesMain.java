package ar.edu.ub.pcsw2016;

import ar.edu.ub.pcsw2016.fginzo.ExerciseGitSetUp;
import ar.edu.ub.pcsw2016.fginzo.ExerciseStudentCreation;
import ar.edu.ub.pcsw2016.fginzo.FranciscoGinzo;

import java.util.Iterator;
import java.util.List;


public class CExercisesMain
{
    public static void main(String[] args) {

        FranciscoGinzo ginzo = new FranciscoGinzo("Francisco", "Ginzo", 3113);
        ExerciseGitSetUp gitSetup = new ExerciseGitSetUp(IExercise.ID.GIT_SETUP);
        ExerciseStudentCreation studentCreation = new ExerciseStudentCreation(IExercise.ID.STUDENT_CREATION);
        ginzo.addExercise(gitSetup);
        System.out.println(gitSetup.id());
        gitSetup.run();
        studentCreation.setGrade(-12);
        gitSetup.setGrade(8);
        System.out.println(gitSetup.grade());
        System.out.println(ginzo.gradesAverage());
        List<IExercise> lista = ginzo.getEjercicios();
        Iterator itr = lista.iterator();
        while (itr.hasNext()) {
            Object elemento = itr.next();
            System.out.print(elemento + "\n");
        }
        System.out.println(ginzo.name());
        studentCreation.run();
        System.out.println(studentCreation.id());
    }
}
