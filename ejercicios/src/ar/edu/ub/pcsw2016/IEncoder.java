package ar.edu.ub.pcsw2016;

public interface IEncoder
{
    /** Encodes a given string into a particular encoding format.
     @param what The string to be encoded.
     @return A string representing the encoded version of the supplied string.
     */
    String encode(String what);
}
