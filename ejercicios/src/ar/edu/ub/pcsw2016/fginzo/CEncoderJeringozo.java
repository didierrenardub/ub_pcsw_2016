package ar.edu.ub.pcsw2016.fginzo;

import ar.edu.ub.pcsw2016.IEncoder;

import java.util.LinkedList;
import java.util.List;

public class CEncoderJeringozo implements IEncoder {

    @Override
    public String encode(String what) {
        if (! what.isEmpty()) {
            char[] listado = what.toCharArray();
            List<Character> lista = new LinkedList<>();
            List<String> jeringozo = new LinkedList<>();
            StringBuilder stringBuilder = new StringBuilder();
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
                stringBuilder.append(resultado);
            }
            return stringBuilder.toString();
        }
        return null;
    }


    public void encodeT(String what) {
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
    }
}

