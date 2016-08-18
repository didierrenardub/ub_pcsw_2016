package ar.edu.ub.pcsw2016.diegovega;

import ar.edu.ub.pcsw2016.IEncoder;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

/**
 * Created by Pulpo on 13/08/2016.
 */
public class EncoderRosarigasino implements IEncoder {
    public EncoderRosarigasino(){}

    public String encode(String what) {
        if (what != null){
        String lowerCaseWhat = what.toLowerCase();
        String[] words = lowerCaseWhat.split(" ");
        List<Character> vocals = new ArrayList<Character>();
        vocals.add('a');
        vocals.add('e');
        vocals.add('i');
        vocals.add('o');
        vocals.add('u');
        String encodedSentence = "";
            for (int i = 0; i < words.length; i++){
                String temp = words[i];
                for(int z = 0; z<){

                }
                for (int j = 0; j < temp.length(); j++) {
                    char c = temp.charAt(j);
                    if (vocals.contains(c)) {
                        if (vocals.contains(encodedSentence.charAt(encodedSentence.length() - 1))) {
                            encodedSentence += c;
                        } else {
                            encodedSentence += "gas" + c;
                        }
                    }
                    else {
                        encodedSentence += c;
                    }
                }
            }
            return encodedSentence;
        }
        return null;
    }
}
