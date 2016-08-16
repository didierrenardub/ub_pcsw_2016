package ar.edu.ub.pcsw2016.diegovega;

import org.junit.*;

/**
 * Created by Pulpo on 15/08/2016.
 */
public class EncoderRosarigasinoTest extends Assert{
    @Before
    public void setUp() throws Exception {
        System.out.println(" ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(" ");
    }

    @Test
    public void encodeTextDobleVocal() throws Exception {
        EncoderRosarigasino gaso = new EncoderRosarigasino();
        System.out.println(gaso.encode("HOLAA COMO ANDAS"));
    }
}
