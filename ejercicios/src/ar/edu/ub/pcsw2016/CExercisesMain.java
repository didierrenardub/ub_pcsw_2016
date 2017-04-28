package ar.edu.ub.pcsw2016;

import ar.edu.ub.pcsw2016.DidierRenard.CRPSIADidier;
import ar.edu.ub.pcsw2016.diegovega.RPSDiego;
import ar.edu.ub.pcsw2016.fginzo.CExerciseEncoding;
import ar.edu.ub.pcsw2016.fginzo.CJuegoRPS;

import java.util.Scanner;

public class CExercisesMain
{
    private CExercisesMain()
    {
        this.m_stats = new CStudentStatistics();
    }
    
    private int userInput(int min, int max)
    {
        Scanner s = new Scanner(System.in);
        
        int input = min - 1;
        
        while(input < min || input > max)
        {
            try
            {
                input = s.nextInt();
            }
            catch(Exception e)
            {
                s.nextLine();
            }
            finally
            {
                
                if(input < min || input > max)
                {
                    System.out.println("Invalid input, try again:");
                }
            }
        }
        
        return input;
    }
    
    private CStudentStatistics stats()
    {
        return m_stats;
    }
    
    private void studentsGrading()
    {
        IStudent diego = stats().student("Diego Santiago Vega");
        diego.exercise(IExercise.ID.GIT_SETUP).setGrade(CGrader.instance().completion(10.0f).finalGrade());
        diego.exercise(IExercise.ID.STUDENT_CREATION).setGrade(CGrader.instance().completion(8.0f).prolixity(8.0f).reliability(8.0f).design(5.0f).finalGrade());
        diego.exercise(IExercise.ID.ENCODING).setGrade(CGrader.instance().completion(10.0f).prolixity(7.0f).reliability(10.0f).design(10.0f).finalGrade());
    
        IStudent francisco = stats().student("Francisco Ginzo");
        francisco.exercise(IExercise.ID.GIT_SETUP).setGrade(CGrader.instance().completion(10.0f).finalGrade());
        francisco.exercise(IExercise.ID.STUDENT_CREATION).setGrade(CGrader.instance().completion(10.0f).prolixity(9.5f).reliability(9.0f).design(5.0f).finalGrade());
        francisco.exercise(IExercise.ID.ENCODING).setGrade(CGrader.instance().completion(10.0f).prolixity(9.5f).reliability(9.0f).design(10.0f).finalGrade());
    
        IStudent juanIgnacio = stats().student("Juan Tarallo");
        juanIgnacio.exercise(IExercise.ID.GIT_SETUP).setGrade(CGrader.instance().completion(10.0f).finalGrade());
        juanIgnacio.exercise(IExercise.ID.STUDENT_CREATION).setGrade(CGrader.instance().completion(1.0f).prolixity(9.0f).reliability(2.0f).design(2.0f).finalGrade());
    
        System.out.println("Average grades:");
        for(IStudent s : stats().students())
        {
            System.out.println("\t" + s.name() + ": " + s.gradesAverage());
        }
    }
    
    private void rockPaperScissorsTournament()
    {
        CRPSTournament t = new CRPSTournament();
        CRPSBattleBot bb = new CRPSBattleBot("UB");
        t.addPlayer(new CRPSPlayer(bb, bb));
        t.addPlayer(new CRPSPlayer(stats().student("Diego Santiago Vega"), new RPSDiego()));
        t.addPlayer(new CRPSPlayer(stats().student("Didier Renard"), new CRPSIADidier()));
        t.addPlayer(new CRPSPlayer(stats().student("Francisco Ginzo"), new CJuegoRPS()));
        t.play();
    }
    
    private void consoleWarriorsTournament()
    {
        CCWTournament t = new CCWTournament(200);
        CRPSBattleBot bb = new CRPSBattleBot("Wittbecker");
        CRPSBattleBot bb2 = new CRPSBattleBot("Aguilera");
        CRPSBattleBot bb3 = new CRPSBattleBot("Greiner");
        CRPSBattleBot bb4 = new CRPSBattleBot("Aldegani");
        t.addPlayer(new CCWPlayer(bb, new CConsoleWarriorBot(t.maxAbility())));
        t.addPlayer(new CCWPlayer(bb2, new CConsoleWarriorBot("Optimus", t.maxAbility())));
        t.addPlayer(new CCWPlayer(bb3, new CConsoleWarriorBot("Vader", t.maxAbility())));
        t.addPlayer(new CCWPlayer(bb4, new CConsoleWarriorBot("Luke", t.maxAbility())));
        t.play();
    }
        
    public static void main(String[] args)
    {
        CExercisesMain app = new CExercisesMain();
        
        System.out.println("Choose an action:\n1 - Rock, Paper, Scissors tournament\n2 - Console Warriors tournament\n3 - Run exercises\n4 - Students grading");
        
        switch(app.userInput(1, 4))
        {
            case 1:
                app.rockPaperScissorsTournament();
            break;
            
            case 2:
                app.consoleWarriorsTournament();
            break;
            
            case 3:
                app.stats().runExercises();
            break;
            
            case 4:
                app.studentsGrading();
            break;
        }
    }
    
    private CStudentStatistics m_stats;
}
