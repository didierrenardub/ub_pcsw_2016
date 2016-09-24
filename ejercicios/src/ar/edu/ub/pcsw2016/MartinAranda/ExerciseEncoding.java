package ar.edu.ub.pcsw2016.MartinAranda;

import ar.edu.ub.pcsw2016.IExercise;
import ar.edu.ub.pcsw2016.MartinAranda.MovimientoCesar;

public class ExerciseEncoding extends Exercise{
    public IExercise.ID id() {
        return ar.edu.ub.pcsw2016.MartinAranda.ExerciseEncoding.ID.ENCODING;
    }

    public void run(){
        MovimientoCesar mc = new MovimientoCesar();
        System.out.println(mc.alfabetoCesar("holaz",- 1));
    }
}
