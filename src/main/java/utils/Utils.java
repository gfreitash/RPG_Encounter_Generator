package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.reflect.Array;
import java.text.Normalizer;

public abstract class Utils {
    private static Logger logger = LogManager.getLogger();

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

    public static <T> T[] GenSet(Class<T> c, int s) {
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked")
        final T[] a = (T[]) Array.newInstance(c, s);
        return a;
    }


}