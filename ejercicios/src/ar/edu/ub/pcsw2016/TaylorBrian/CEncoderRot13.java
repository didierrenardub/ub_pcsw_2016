package ar.edu.ub.pcsw2016.TaylorBrian;
import ar.edu.ub.pcsw2016.IEncoder;

import java.util.ArrayList;


/**
 * Created by Brian on 30/08/2016.
 */
public class CEncoderRot13 implements IEncoder {

    public String encode(String what){
        private char [] a= new char [13] {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
        private char [] n= new char[13] {'n','o','p','q','r','s','t','u','v','w','x','y''z'};
        if(what  != null){
            String lowerCase= what.toLowerCase();
            for(int i=0; i<lowerCase.length(); i++){
                String position= lowerCase[i];
                if(position.contains(a[i]) ){
                    position.replace());
                }

            }
        }
    }
}