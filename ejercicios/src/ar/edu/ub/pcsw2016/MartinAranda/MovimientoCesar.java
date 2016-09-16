package ar.edu.ub.pcsw2016.MartinAranda;

import java.lang.reflect.Array;

public class MovimientoCesar {
    String palabraModificada = "";
    String alfabetoOriginal = "abcdefghijklmnopqrstwxyz";

    public String alfabetoCesar (String palabra, Integer desplazamiento){
        palabra = palabra.toLowerCase();
        if (palabra.isEmpty() || palabra == null) {
            return null;
        }
        else{
            for (int i = 0; i < palabra.length(); i++) {
                char c = palabra.charAt(i);
                for (int j = 0; j < alfabetoOriginal.length(); j++){
                    char d = alfabetoOriginal.charAt(j);
                    if (c == d){
                        int variante = j + desplazamiento;
                        if(variante > 23){
                        palabraModificada += alfabetoOriginal.charAt(variante - 24);
                        }
                        else{
                            palabraModificada += alfabetoOriginal.charAt(j + desplazamiento);
                        }
                    }
                }
            }
            return palabraModificada;
        }
    }

    public static void main (String args[]){
        MovimientoCesar mc = new MovimientoCesar();
        System.out.println(mc.alfabetoCesar("holaz",- 1));
    }
}
