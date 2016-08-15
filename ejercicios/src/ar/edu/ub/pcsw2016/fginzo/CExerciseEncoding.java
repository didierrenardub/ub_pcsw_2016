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
        String jeringozo1 = codificador.encode("un amuleto excelente, porque coordina la guia del dia del neumatico.");
        String jeringozo2 = codificador.encode("Hoy es Fácil y aleatorio la Mítica única posibilidad de acercarse.");
        String jeringozo3 = codificador.encode("MAÑANA esTAremosS EN LA AERONAVE BUSCANDO LUgar DONDE ATERRIZAR");
        System.out.println(jeringozo1);
        System.out.println(jeringozo2);
        System.out.println(jeringozo3);
    }
}
