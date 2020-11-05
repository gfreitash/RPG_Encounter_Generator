package utils;

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
}