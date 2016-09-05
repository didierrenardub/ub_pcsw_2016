package ar.edu.ub.pcsw2016.TaylorBrian;
import ar.edu.ub.pcsw2016.IEncoder;

import java.util.ArrayList;


/**
 * Created by Brian on 30/08/2016.
 */
public class CEncoderRot13 implements IEncoder {
    public String encode(String what) {
        String a= "abcdefghijlm";

        String n = "nopqrstuvxyz";

        if (what != null) {
            String lowerCase = what.toLowerCase();
            String encodedPhrase = " ";
            for (int i = 0; i < lowerCase.length(); i++) {
                String position = "" + lowerCase.charAt(i);
                if (a.contains(position)) {
                    encodedPhrase = position.replace(position.charAt(i), n.charAt(i));
                }
                else if (n.contains(position)){
                    encodedPhrase = position.replace(position.charAt(i), a.charAt(i));
                }
            }
            return encodedPhrase;
        }
        return null;
    }
}

