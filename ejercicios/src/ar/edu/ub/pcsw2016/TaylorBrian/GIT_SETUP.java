import src.ar.edu.ub.pcsw2016.IExercise;

public class GIT_SETUP implements IExercise{
    public float grade;

    public ID id(){
        return IExercise.ID.GIT_SETUP;
    }

    public void run(){
        system.out.pintln("NibraT");
    }

    public float grade(){
        return grade;
    }
    public void setGrade(grade){
    this.setGrade=grade;
    }
}