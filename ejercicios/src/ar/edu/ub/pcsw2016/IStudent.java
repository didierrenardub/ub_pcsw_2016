package ar.edu.ub.pcsw2016;

import java.util.ArrayList;

/**
 * Base class for students. Each student should inherit from it and
 * implement the required methods.
 */
public interface IStudent {
    /**
     * Getter for the student's name.
     *
     * @return Expected to return the student's full name.
     */
    String name();

    /**
     * Getter for the student's registration number. That is, the one
     * given by the university as enrollment.
     *
     * @return Expected to return the student's registration number;
     */
    int registrationNumber();

    /**
     * Adds an exercise to this student's exercise list.
     *
     * @param exercise
     */
    void addExercise(IExercise exercise);

    /**
     * Returns the instance of exercise that matches the given ID, or null if it doesn't exist.
     *
     * @param withId The ID of the requested exercise.
     * @return The exercise itself, or null if not found.
     */
    IExercise exercise(IExercise.ID withId);

    /**
     * It computes the average grading for the current student, taken from the exercises
     * registered for the current student.
     *
     * @return The average grading for the current student.
     */
    float gradesAverage();
}
