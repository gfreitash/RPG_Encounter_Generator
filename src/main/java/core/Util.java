package core;

import java.util.EnumSet;
import java.util.Enumeration;

public abstract class Util {
    public static int arredondarParaProximoPar(double valor) {
        int temp = (int)Math.ceil(valor);
        if (temp%2 == 0)
            return temp;
        return temp-1;
    }

    public static <T extends Enum<T>> int lengthOf(Class<T> classe) {
        return classe.getEnumConstants().length;
    }
}