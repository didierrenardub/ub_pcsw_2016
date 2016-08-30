package ar.edu.ub.pcsw2016.TaylorBrian;
import ar.edu.ub.pcsw2016.IEncoder;

import java.util.ArrayList;


/**
 * Created by Brian on 30/08/2016.
 */
public class CEncoderRot13 implements IEncoder {

    private char [] a= new char [26] {'a','b','c','d','e','f','g','h','i','j','k','l','m','A','B','C','D','E','F','F',
            'H','I','J','K','L','M' };

    private char [] n= new char[26] {'n','o','p','q','r','s','t','u','v','w','x','y''z','N','O','P','Q','R','S','T'
            ,'U','V','W','X','Y','Z'};

    public String encode(String what){
        if(what  != null){
            String lowerCase= what.toLowerCase();
            for(int i=0; i<lowerCase.charAt(); i++){

            }
        }
    }
}
