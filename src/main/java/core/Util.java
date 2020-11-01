package core;

public abstract class Util {
    public static int arredondarParaProximoPar(double valor) {
        int temp = (int)Math.ceil(valor);
        if (temp%2 == 0)
            return temp;
        return temp-1;
    }
}