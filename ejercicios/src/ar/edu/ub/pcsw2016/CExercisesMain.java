package ar.edu.ub.pcsw2016;

import ar.edu.ub.pcsw2016.DidierRenard.CRPSIADidier;
import ar.edu.ub.pcsw2016.diegovega.RPSDiego;
import ar.edu.ub.pcsw2016.fginzo.CExerciseEncoding;
import ar.edu.ub.pcsw2016.fginzo.CJuegoRPS;

public class CExercisesMain
{
    public static void main(String[] args)
    {
        CStudentStatistics stats = new CStudentStatistics();
        stats.runExercises();

        CRPSTournament t = new CRPSTournament();
        CRPSBattleBot bb = new CRPSBattleBot("UB");
        t.addPlayer(new CRPSPlayer(bb, bb));
        t.addPlayer(new CRPSPlayer(stats.student("Diego Santiago Vega"), new RPSDiego()));
        t.addPlayer(new CRPSPlayer(stats.student("Didier Renard"), new CRPSIADidier()));
        t.addPlayer(new CRPSPlayer(stats.student("Francisco Ginzo"), new CJuegoRPS()));

        t.play();

        /*IStudent diego = stats.student("Diego Santiago Vega");
        diego.exercise(IExercise.ID.GIT_SETUP).setGrade(CGrader.instance().completion(10.0f).finalGrade());
        diego.exercise(IExercise.ID.STUDENT_CREATION).setGrade(CGrader.instance().completion(8.0f).prolixity(8.0f).reliability(8.0f).design(5.0f).finalGrade());
        diego.exercise(IExercise.ID.ENCODING).setGrade(CGrader.instance().completion(10.0f).prolixity(7.0f).reliability(10.0f).design(10.0f).finalGrade());
        
        IStudent francisco = stats.student("Francisco Ginzo");
        francisco.exercise(IExercise.ID.GIT_SETUP).setGrade(CGrader.instance().completion(10.0f).finalGrade());
        francisco.exercise(IExercise.ID.STUDENT_CREATION).setGrade(CGrader.instance().completion(10.0f).prolixity(9.5f).reliability(9.0f).design(5.0f).finalGrade());
        francisco.exercise(IExercise.ID.ENCODING).setGrade(CGrader.instance().completion(10.0f).prolixity(9.5f).reliability(9.0f).design(10.0f).finalGrade());
    
        IStudent juanIgnacio = stats.student("Juan Tarallo");
        juanIgnacio.exercise(IExercise.ID.GIT_SETUP).setGrade(CGrader.instance().completion(10.0f).finalGrade());
        juanIgnacio.exercise(IExercise.ID.STUDENT_CREATION).setGrade(CGrader.instance().completion(1.0f).prolixity(9.0f).reliability(2.0f).design(2.0f).finalGrade());
    
        System.out.println("Average grades:");
        for(IStudent s : stats.students())
        {
            System.out.println("\t" + s.name() + ": " + s.gradesAverage());
        }*/
    }
}
