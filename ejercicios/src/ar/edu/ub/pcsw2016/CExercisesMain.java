package ar.edu.ub.pcsw2016;

public class CExercisesMain
{
    public static void main(String[] args)
    {
        CStudentStatistics stats = new CStudentStatistics();
        
        stats.runExercises();
        
        IStudent diego = stats.student("Diego Santiago Vega");
        diego.exercise(IExercise.ID.GIT_SETUP).setGrade(CGrader.instance().completion(10.0f).finalGrade());
        diego.exercise(IExercise.ID.STUDENT_CREATION).setGrade(CGrader.instance().completion(8.0f).prolixity(8.0f).reliability(8.0f).design(5.0f).finalGrade());
        
        IStudent francisco = stats.student("Francisco Ginzo");
        francisco.exercise(IExercise.ID.GIT_SETUP).setGrade(CGrader.instance().completion(10.0f).finalGrade());
        francisco.exercise(IExercise.ID.STUDENT_CREATION).setGrade(CGrader.instance().completion(10.0f).prolixity(9.5f).reliability(9.0f).design(5.0f).finalGrade());
        francisco.exercise(IExercise.ID.ENCODING).setGrade(CGrader.instance().completion(10.0f).prolixity(9.5f).reliability(9.0f).design(10.0f).finalGrade());
    
        System.out.println("Average grades:");
        for(IStudent s : stats.students())
        {
            System.out.println("\t" + s.name() + ": " + s.gradesAverage());
        }
    }
}
