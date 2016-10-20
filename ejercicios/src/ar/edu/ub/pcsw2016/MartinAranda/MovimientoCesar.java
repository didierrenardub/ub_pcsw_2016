
package ar.edu.ub.pcsw2016.MartinAranda;

import java.lang.reflect.Array;

public class MovimientoCesar {
    String palabraModificada = "";
    String alfabetoOriginal = "abcdefghijklmnopqrstwxyz";

    public String alfabetoCesar (String palabra, Integer desplazamiento)
    {
        if (palabra == null || palabra.isEmpty())
        {
            return null;
        }

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++)
        {
            char c = palabra.charAt(i);
            for (int j = 0; j < alfabetoOriginal.length(); j++)
            {
                char d = alfabetoOriginal.charAt(j);
                if (c == d)
                {
                    int variante = j + desplazamiento;
                    if(variante > 23)
                    {
                        palabraModificada += alfabetoOriginal.charAt(variante - 24);
                    }
                    else
                    {
                        palabraModificada += alfabetoOriginal.charAt(j + desplazamiento);
                    }
                }
            }
        }
        return palabraModificada;
    }
}
