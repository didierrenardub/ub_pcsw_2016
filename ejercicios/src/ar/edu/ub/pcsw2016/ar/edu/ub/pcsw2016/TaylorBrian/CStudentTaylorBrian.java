import java.util.ArrayList;
import ar.edu.ub.pcsw2016.IStudent;
import ar.edu.ub.pcsw2016.IExercise;

public class CStudentTaylorBrian implements IStudent{
    public ArrayList <IExercise> exerciseArrayList= new ArrayList <IExercise>();
    public String name(){
        return "Brian Agustín Taylor";
    }
    public int registrationNumber(){
        return 03132;
    }
    private void addExercise(IExercise exercise){
        exerciseArrayList.add(exercise);
    }

}