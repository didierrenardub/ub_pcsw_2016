package ar.edu.ub.pcsw2016.fginzo;

public class CExerciseEncoding extends CExercise {

    /*
   Constructor
    */
    public CExerciseEncoding (ID id) {

    }

    @Override
    public void run() {
        CEncoderJeringozo codificador = new CEncoderJeringozo();
        String jeringozo1 = codificador.encode("un amuleto ideal porque se viene el dia del neumatico");
        //codificador.encodeT("se viene el dia del amuleto\n");
        //String jeringozo2 = codificador.encode("la");
        //String jeringozo3 = codificador.encode("la amada");
        //System.out.println(jeringozo1 + "\n" + jeringozo2 + "\n" + jeringozo3);
        System.out.println(jeringozo1);
    }
}
