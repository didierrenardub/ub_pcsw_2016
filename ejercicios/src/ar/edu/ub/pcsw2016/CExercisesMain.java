package ar.edu.ub.pcsw2016;

public class CExercisesMain
{
    public static void main(String[] args)
    {
        CStudentStatistics stats = new CStudentStatistics();
        
        // Run all exercises from all students
        for(IStudent s : stats.students())
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
