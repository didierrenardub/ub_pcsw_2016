package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IRPSIA;
import ar.edu.ub.pcsw2016.MOVES;

import java.util.ArrayList;
import java.util.Random;

public class CJuegoRPS implements IRPSIA {

    public CJuegoRPS() {
    }

    @Override
    public String play(ArrayList<String> opponentMoves, ArrayList<String> opponentHistory) {
        int paperCount = 0;
        int rockCount = 0;
        int scissorsCount = 0;
        if ((opponentMoves != null) || (! opponentMoves.isEmpty()) ||
                (opponentHistory != null)) {
            for (String movidaOponente : opponentMoves) {
                opponentHistory.add(movidaOponente);
            }
            for (String historiaOponente : opponentHistory) {
                if (historiaOponente.equals(MOVES.PAPER)) {
                    paperCount =+ 1;
                }
                else if (historiaOponente.equals(MOVES.ROCK)) {
                    rockCount =+ 1;
                }
                else if (historiaOponente.equals(MOVES.SCISORS)) {
                    scissorsCount =+ 1;
                }
            }
            if ((paperCount > rockCount) && (paperCount > scissorsCount)) {
                return MOVES.SCISORS;
            }
            else if ((rockCount > paperCount) && (rockCount > scissorsCount)) {
                return MOVES.PAPER;
            }
            else if ((scissorsCount > paperCount) && ( scissorsCount > rockCount)) {
                return MOVES.ROCK;
            }
        }
        else {
            System.out.println("Todavía no hay movida del oponente para poder jugar.");
        }
        return randomMove();
    }

    private String randomMove()
    {
        Random r = new Random();

        switch(r.nextInt(3))
        {
            case 0:
                return MOVES.ROCK;
            case 1:
                return MOVES.PAPER;
        }

        return MOVES.SCISORS;
    }

}
