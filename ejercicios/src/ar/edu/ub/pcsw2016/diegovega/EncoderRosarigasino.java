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
        int count = 0;
        int count2 = 0;
            for (int i = 0; i < words.length; i++){
                String temp = words[i];
                for (int j = 0; j < temp.length(); j++) {
                    char c = temp.charAt(j);
                    if (vocals.contains(c)){
                        count += 1;
                    }
                }
                count -= 1;
                for (int k = 0; k < temp.length(); k++){
                    char c = temp.charAt(k);
                    if (vocals.contains(c)) {
                        count2 += 1;
                        if (count == count2) {
                            encodedSentence += c + "gas";
                        }
                        encodedSentence += c;
                    }
                    else{
                        encodedSentence += c;
                    }
                }
                count = 0;
                count2 = 0;
                encodedSentence += " ";
            }
            return encodedSentence;
        }
        return null;
    }
}
