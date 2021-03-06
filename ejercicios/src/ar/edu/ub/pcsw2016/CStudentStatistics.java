package ar.edu.ub.pcsw2016;

import ar.edu.ub.pcsw2016.ablanco.CStudentAndresBlanco;
import ar.edu.ub.pcsw2016.DidierRenard.CStudentDidierRenard;
import ar.edu.ub.pcsw2016.MartinAranda.StudentMartin;

import ar.edu.ub.pcsw2016.fcarmona.CStudentFacundoCarmona;
import ar.edu.ub.pcsw2016.diegovega.StudentDiego;
import ar.edu.ub.pcsw2016.fginzo.CExerciseEncoding;
import ar.edu.ub.pcsw2016.fginzo.CExerciseGitSetUp;
import ar.edu.ub.pcsw2016.fginzo.CExerciseStudentCreation;
import ar.edu.ub.pcsw2016.fginzo.CStudentFranciscoGinzo;

import ar.edu.ub.pcsw2016.jit.CStudentJuanTarallo;

import java.util.ArrayList;

/**
 * This class is used mainly by the professor to gather statistics from its
 * students, as well as test their exercises.
 */
public class CStudentStatistics {
    /**
     * Default constructor. Nothing fancy here, just initialization of some stuff.
     */
    public CStudentStatistics() {
        m_students = new ArrayList<IStudent>();
        
        IStudent diego = new StudentDiego();
        diego.addExercise(new ar.edu.ub.pcsw2016.diegovega.ExerciseGitSetup());
        diego.addExercise(new ar.edu.ub.pcsw2016.diegovega.ExerciseCreateStudent());
        diego.addExercise(new ar.edu.ub.pcsw2016.diegovega.ExerciseEncoding());
        
        IStudent francisco = new CStudentFranciscoGinzo();
        francisco.addExercise(new CExerciseGitSetUp(IExercise.ID.GIT_SETUP));
        francisco.addExercise(new CExerciseStudentCreation(IExercise.ID.STUDENT_CREATION));
        francisco.addExercise(new CExerciseEncoding(IExercise.ID.ENCODING));
    
        IStudent juanIgnacio = new CStudentJuanTarallo();
        juanIgnacio.addExercise(new ar.edu.ub.pcsw2016.jit.ExerciseGitSetup(IExercise.ID.GIT_SETUP));
        juanIgnacio.addExercise(new ar.edu.ub.pcsw2016.jit.ExerciseStudentCreation(IExercise.ID.STUDENT_CREATION));

        IStudent martin = new StudentMartin();
        martin.addExercise(new ar.edu.ub.pcsw2016.MartinAranda.ExerciseGitSetup());
        martin.addExercise(new ar.edu.ub.pcsw2016.MartinAranda.ExerciseCreateStudent());
        martin.addExercise(new ar.edu.ub.pcsw2016.MartinAranda.ExerciseEncoding());

        IStudent didier = new CStudentDidierRenard();
        
        IStudent andres = new CStudentAndresBlanco();
        
        IStudent facundo = new CStudentFacundoCarmona();
        
        addStudent(diego);
        addStudent(francisco);
        addStudent(andres);
        addStudent(martin);
        addStudent(facundo);
        addStudent(juanIgnacio);
        addStudent(didier);
    }

    /**
     * Adds a student to student's list.
     *
     * @param student The student to be added.
     */
    public void addStudent(IStudent student) {
        m_students.add(student);
    }

    /**
     * Searches for the student with the given name.
     *
     * @param withName The name of the student to be returned.
     * @return The instance of the IStudent object that name belongs to, or null if not found.
     */
    public IStudent student(String withName) {
        for (IStudent s : students()) {
            if (s.name().equalsIgnoreCase(withName)) {
                return s;
            }
        }

        return null;
    }

    /**
     * Same as above, but search using the student's registration number.
     *
     * @param withRegistrationNumber The registration number to be found.
     * @return The instance of IStudent object that registration number belongs to, or null if not found.
     */
    public IStudent student(int withRegistrationNumber) {
        for (IStudent s : students()) {
            if (s.registrationNumber() == withRegistrationNumber) {
                return s;
            }
        }

        return null;
    }

    /**
     * Getter for students array.
     *
     * @return The full array of students.
     */
    public ArrayList<IStudent> students() {
        return m_students;
    }

    /**
     * Computes the percentage of completion of the given exercise among all students.
     *
     * @param forExercise The exercise to be computed.
     * @return The percentage of completion for that exercise.
     */
    public float exerciseCompletion(IExercise.ID forExercise) {
        int totalExercises = students().size() * IExercise.ID.EXERCISE_COUNT.ordinal();
        int completedExercises = 0;

        for (IStudent s : students()) {
            IExercise e = s.exercise(forExercise);

            if (e != null) {
                completedExercises++;
            }
        }

        return (float) completedExercises / (float) totalExercises * 100.0f;
    }

    /**
     * Computes the percentage of completion of all exercises among all students.
     *
     * @return The percentage of completion of all exercises among all students.
     */
    public float exercisesCompletion() {
        int totalExercises = students().size() * IExercise.ID.EXERCISE_COUNT.ordinal();
        float totalCompletion = totalExercises * 100.0f;
        float completion = 0.0f;

        for (int i = 0; i < IExercise.ID.EXERCISE_COUNT.ordinal(); i++) {
            completion += exerciseCompletion(IExercise.ID.values()[i]);
        }

        return completion / totalCompletion * 100.0f;
    }
    
    public void runExercises()
    {
        for(IStudent s : students())
        {
            System.out.println("Running exercises from " + s.name());
            for(int i = 0; i < IExercise.ID.EXERCISE_COUNT.ordinal(); i++)
            {
                IExercise e = s.exercise(IExercise.ID.values()[i]);
            
                System.out.println("---------------------------------------------------");
                System.out.print("Exercise " + IExercise.ID.values()[i].name() + "... ");
            
                if(e != null)
                {
                    System.out.println("running: ");
                    e.run();
                }
                else
                {
                    System.out.println("NOT FOUND");
                }
            }
            System.out.println("===================================================");
        }
    }
    
    private ArrayList<IStudent> m_students;
}
