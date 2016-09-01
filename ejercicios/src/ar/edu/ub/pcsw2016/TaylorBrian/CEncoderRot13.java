package ar.edu.ub.pcsw2016.TaylorBrian;
import ar.edu.ub.pcsw2016.IEncoder;

import java.util.ArrayList;


/**
 * Created by Brian on 30/08/2016.
 */
public class CEncoderRot13 implements IEncoder {

    public String encode(String what){
        char [] a= new char [] {'a','b','c','d','e','f','g','h','i','j','k','l','m'};

        char [] n= new char[] {'n','o','p','q','r','s','t','u','v','w','x','y''z'};

        if(what  != null){
            String lowerCase= what.toLowerCase();
            String encodedPhrase= " ";
            for(int i=0; i<lowerCase.length(); i++){
                String position = lowerCase[i];
                if(position.contains(char [] a)){
                    encodedPhrase= position.replace(position[i], n[i]);
                }
                else(position.contentEquals(n[i])){
                        encodedPhrase=position.replace(n[i], a[i]);
                }
                return encodedPhrase;
            }
        return null;
        }
    }
}
