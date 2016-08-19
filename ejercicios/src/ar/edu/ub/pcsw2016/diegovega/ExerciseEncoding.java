package ar.edu.ub.pcsw2016.diegovega;

import ar.edu.ub.pcsw2016.IExercise;

/**
 * Created by Pulpo1 on 8/19/16.
 */
public class ExerciseEncoding extends Exercise{
    public IExercise.ID id() {
        return ExerciseEncoding.ID.ENCODING;
    }

    public void run(){
        EncoderRosarigasino gaso = new EncoderRosarigasino();
        System.out.println(gaso.encode("HOLA COMO ANDAS, estoy aprendiendo a hablar rosarino"));
    }
}
