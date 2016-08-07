package ar.edu.ub.pcsw2016.diegovega;

/**
 * Created by Pulpo on 06/08/2016.
 */
public class Diego implements IStudent{
    private String name;
    private int registrationNumber;
    private List<IExercise> excerciseList = new ArrayList<IExercise>();

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }


    public Diego(String name, int registrationNumber){
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String name() {
        return getName();
    }

    public int registrationNumber() {
        return getRegistrationNumber();
    }

    public void addExercise(IExercise exercise) {
        excerciseList.add(exercise);
    }

    public IExercise exercise(IExercise.ID withId) {
        for (IExercise e : exerciseList)
        {
            if (e.id() == withId){
                return e;
            }
        }
        return null;
    }

    public float gradesAverage() {
        float average = 0;
        int exerciseListLength = exerciseList.size();
        for (IExercise e : excerciseList) {
            average += e.grade();
        }
        average = average / exerciseListLength;
        return average;
    }
}
