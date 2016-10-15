package ar.edu.ub.pcsw2016.diegovega;

import ar.edu.ub.pcsw2016.IRPSIA;
import ar.edu.ub.pcsw2016.MOVES;

import java.util.ArrayList;

/**
 * Created by Pulpo1 on 10/14/16.
 */
public class RPSDiego implements IRPSIA{
    ArrayList<String> miJugada;
    String miPrimerJugada;
    double numeroRandom = Math.random() * 100;

    public RPSDiego(){
        miJugada = new ArrayList<String>();
    }

    public String numeroRandom (){
        if (numeroRandom < 33) {
            this.miPrimerJugada = MOVES.ROCK;
            return miPrimerJugada;
        } else if (numeroRandom < 66) {
            this.miPrimerJugada = MOVES.PAPER;
            return miPrimerJugada;
        } else
            this.miPrimerJugada = MOVES.SCISORS;
        return miPrimerJugada;
    }

    @Override
    public String play(ArrayList<String> opponentMoves, ArrayList<String> opponentHistory) {
        int r = 0;
        int p = 0;
        int s = 0;
        if (opponentMoves.size() == 0) {
            if (numeroRandom < 33) {
                this.miPrimerJugada = MOVES.ROCK;
            } else if (numeroRandom < 66) {
                this.miPrimerJugada = MOVES.PAPER;
            } else
                this.miPrimerJugada = MOVES.SCISORS;
        }
        else{
            for (String m: opponentMoves){
                if (m != null) {
                    if (m.equals(MOVES.ROCK)){
                        r++;
                        if (r > p && r > s){
                            this.miJugada.add(MOVES.ROCK);
                            return this.miJugada.get(miJugada.size()-1);
                        }
                        else if (r > p && r < s){
                            this.miJugada.add(MOVES.SCISORS);
                            return this.miJugada.get(miJugada.size()-1);
                        }
                        else if (r < p && r > s){
                            this.miJugada.add(MOVES.PAPER);
                            return this.miJugada.get(miJugada.size()-1);
                        }
                        else
                            this.miJugada.add(numeroRandom());
                        return this.miJugada.get(miJugada.size()-1);
                    }
                    if (m.equals(MOVES.SCISORS)){
                        s++;
                        if (s > p && s > r){
                            this.miJugada.add(MOVES.SCISORS);
                            return this.miJugada.get(miJugada.size()-1);
                        }
                        else if (s > p && s < r){
                            this.miJugada.add(MOVES.ROCK);
                            return this.miJugada.get(miJugada.size()-1);
                        }
                        else if (s < p && s > r){
                            this.miJugada.add(MOVES.PAPER);
                            return this.miJugada.get(miJugada.size()-1);
                        }
                        else
                            this.miJugada.add(numeroRandom());
                        return this.miJugada.get(miJugada.size()-1);
                    }
                    if (m.equals(MOVES.PAPER)){
                        p++;
                        if (p > r && p > s){
                            this.miJugada.add(MOVES.SCISORS);
                            return this.miJugada.get(miJugada.size()-1);
                        }
                        else if (p > r && p < s){
                            this.miJugada.add(MOVES.PAPER);
                            return this.miJugada.get(miJugada.size()-1);
                        }
                        else if (p < r && p > s){
                            this.miJugada.add(MOVES.ROCK);
                            return this.miJugada.get(miJugada.size()-1);
                        }
                        else
                            this.miJugada.add(numeroRandom());
                        return this.miJugada.get(miJugada.size()-1);
                    }
                }
            }
        }
        return this.miPrimerJugada;
    }


    public ArrayList<String> getMiJugada() {
        return miJugada;
    }

    public void setMiJugada(ArrayList<String> miJugada) {
        this.miJugada = miJugada;
    }

    public double getNumeroRandom() {
        return numeroRandom;
    }

    public void setNumeroRandom(double numeroRandom) {
        this.numeroRandom = numeroRandom;
    }
}

