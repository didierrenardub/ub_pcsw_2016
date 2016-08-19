package ar.edu.ub.pcsw2016.fginzo;

public class CExerciseEncoding extends CExercise {

    /*
   Constructor
    */
    public CExerciseEncoding (ID id) {
        this.id = id;
    }

    @Override
    public void run() {
        CEncoderJeringozo codificador = new CEncoderJeringozo();
        String jeringozo1 = codificador.encode("un amuleto excelente, porque coordina la guia del dia del neumático.\n");
        String jeringozo2 = codificador.encode("Hoy es Fácil y aleatorio la Mítica única posibilidad de acercarse.\n");
        String jeringozo3 = codificador.encode("MAÑANA esTAremos EN LA AERONAVE BUSCANDO LUgar DONDE ATERRIZAR CON AERONAVEGACIÓN");
        System.out.println(jeringozo1);
        System.out.println(jeringozo2);
        System.out.println(jeringozo3);
    }
}
