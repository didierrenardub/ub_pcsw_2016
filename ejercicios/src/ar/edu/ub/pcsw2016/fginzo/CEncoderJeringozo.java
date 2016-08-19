package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IEncoder;

import java.util.LinkedList;
import java.util.List;

public class CEncoderJeringozo implements IEncoder {

    /*
    Método que transforma una palabra en español en una palabra
    en jeringozo. En jeringozo después de cada vocal se agrega
    el sonido "p" y se repite la vocal.
    Fuente: https://es.wikipedia.org/wiki/Jerigonza (ver Diferencias
    entre jerigonza y jeringoso)
    */
    @Override
    public String encode(String what) {
        if (! what.isEmpty()) {
            char[] arrayChar = what.toCharArray(); //convierte Str pasado como argumento en char Array
            List<Character> listaChar = this.crearListaChar(arrayChar); //convierte char Array pasado como argumento en
                                                                        //List de tipo Character
            List<String> listaStr = this.crearListaStr(listaChar); //convierte List<Character> pasada como argumento en
                                                                   //List de tipo String
            StringBuilder stringBuilder = new StringBuilder();
            int coleccion = listaStr.size();
            for (int i = 0; i < coleccion; i++) {
                String str = null;
                if ((listaStr.get(i).equalsIgnoreCase("a")) || (listaStr.get(i).equalsIgnoreCase("á")) ||
                        (listaStr.get(i).equalsIgnoreCase("e")) || (listaStr.get(i).equalsIgnoreCase("é")) ||
                        (listaStr.get(i).equalsIgnoreCase("i")) || (listaStr.get(i).equalsIgnoreCase("í")) ||
                        (listaStr.get(i).equalsIgnoreCase("o")) || (listaStr.get(i).equalsIgnoreCase("ó")) ||
                        (listaStr.get(i).equalsIgnoreCase("u")) || (listaStr.get(i).equalsIgnoreCase("ú"))) {

                    str = (stringIsUpperCase(listaStr.get(i))) ? listaStr.get(i) + "P" + listaStr.get(i) :
                            listaStr.get(i) + "p" + listaStr.get(i);
                }
                String jeringozo = listaStr.get(i).replaceAll("a|A|á|Á|e|E|é|É|i|I|í|Í|o|O|ó|Ó|u|U|ú|Ú", str);
                stringBuilder.append(jeringozo);
            }
            return stringBuilder.toString();
        }
        return null;
    }

    /*
    Método que convierte un char Array en List de tipo Character
    Accesibilidad private porque es invocado sólo por el método encode(String str)
    */
    private List<Character> crearListaChar(char[] array) {
        List<Character> listaChar = new LinkedList<>();
        int elementos = array.length;
        for (int i = 0; i < elementos; i++) {
            listaChar.add(array[i]);
        }
        return listaChar;
    }

    /*
    Método que convierte una List<Character> en List de tipo String
    Accesibilidad private porque es invocado sólo por el método encode(String str)
    */
    private List<String> crearListaStr(List<Character> listaChar) {
        List<String> listaStr = new LinkedList<>();
        for (Character elemento : listaChar) {
            listaStr.add(elemento.toString());
        }
        return listaStr;
    }

    private boolean stringIsUpperCase(String str) {
        if (str.matches("A|Á|E|É|I|Í|O|Ó|U|Ú")) {
            return true;
        }
        return false;
    }
}

