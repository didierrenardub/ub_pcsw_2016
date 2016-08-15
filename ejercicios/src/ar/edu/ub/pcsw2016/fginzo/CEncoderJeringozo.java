package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IEncoder;

import java.util.LinkedList;
import java.util.List;

public class CEncoderJeringozo implements IEncoder {

    @Override
    public String encode(String what) {
        if (! what.isEmpty()) {
            char[] listado = what.toCharArray();
            List<Character> listaChar = this.crearListaChar(listado);
            List<String> listaStr = this.crearListaStr(listaChar);
            StringBuilder stringBuilder = new StringBuilder();
            int elementos = listaStr.size();
            for (int i = 0; i < elementos; i++) {
                String str = null;
                if ((listaStr.get(i).equals("a")) || (listaStr.get(i).equals("e")) || (listaStr.get(i).equals("i"))
                        || (listaStr.get(i).equals("o")) || (listaStr.get(i).equals("u"))) {
                    str = listaStr.get(i) + "p" + listaStr.get(i);
                }
                //if (! listaStr.get(i).equals("que")) {
                    String resultado = listaStr.get(i).replaceAll("a|e|i|o|u", str);
                    stringBuilder.append(resultado);
                //}
            }
            return stringBuilder.toString();
        }
        return null;
    }

    private List<Character> crearListaChar(char[] array) {
        int elementos = array.length;
        List<Character> listaChar = new LinkedList<>();
        for (int i = 0; i < elementos; i++) {
            listaChar.add(array[i]);
        }
        return listaChar;
    }


    private List<String> crearListaStr(List<Character> listaChar) {
        int elementos = listaChar.size();
        List<String> listaStr = new LinkedList<>();
        for (int i = 0; i < elementos; i++) {
            listaStr.add(listaChar.get(i).toString());
        }
        return listaStr;
    }


/*    public void encodeT(String what) {
        if (! what.isEmpty()) {
            char[] listado = what.toCharArray();
            List<Character> lista = new LinkedList<>();
            List<String> jeringozo = new LinkedList<>();
            for (int i = 0; i < listado.length; i++) {
                lista.add(listado[i]);
            }
            for (int j = 0; j < lista.size(); j++) {
                jeringozo.add(lista.get(j).toString());
            }
            for (int k = 0; k < jeringozo.size(); k++) {
                String str = null;
                if ((jeringozo.get(k).equals("a")) || (jeringozo.get(k).equals("e")) || (jeringozo.get(k).equals("i"))
                        || (jeringozo.get(k).equals("o")) || (jeringozo.get(k).equals("u"))) {
                    str = jeringozo.get(k) + "p" + jeringozo.get(k);
                }
                String resultado = jeringozo.get(k).replaceAll("a|e|i|o|u", str);
                System.out.print(resultado);
            }
        }
    }*/
}

