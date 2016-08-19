package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IExercise;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CEncoderJeringozoTest extends Assert {

    @Before
    public void setUp() throws Exception {
        System.out.println(" ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(" ");
    }

    @Test
    public void encode() throws Exception {
        CEncoderJeringozo codificador = new CEncoderJeringozo();
        String jeringozo1 = codificador.encode("un amuleto excelente para el neumático");
        String jeringozo2 = codificador.encode("Hoy es Fácil y aleatorio.");
        String jeringozo3 = codificador.encode("MAÑANA esTAremos EN LA AeRONAVEGACIÓN");
        String jeringozo4 = codificador.encode("");
        assertEquals("upun apamupulepetopo epexcepelepentepe paparapa epel nepeupumápátipicopo", jeringozo1);
        assertEquals("Hopoy epes Fápácipil y apalepeapatoporipiopo.", jeringozo2);
        assertEquals("MAPAÑAPANAPA epesTAPArepemopos EPEN LAPA APAepeROPONAPAVEPEGAPACIPIÓPÓN", jeringozo3);
        assertEquals(null, jeringozo4);
    }
}