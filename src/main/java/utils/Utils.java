package utils;

import java.lang.reflect.Array;
import java.text.Normalizer;

public abstract class Utils {
    public static int arredondarParaProximoPar(double valor) {
        int temp = (int)Math.ceil(valor);
        if (temp%2 == 0)
            return temp;
        return temp-1;
    }

    public static <T extends Enum<T>> int enumLength(Class<T> classe) {
        return classe.getEnumConstants().length;
    }

    public static String normalizar(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")
                .replaceAll(" ", "_");
    }

    public static <E> E[] GenSet(Class<E> c, int s) {
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked")
        final E[] a = (E[]) Array.newInstance(c, s);
        return a;
    }
}