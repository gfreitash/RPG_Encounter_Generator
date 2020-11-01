package core;
import java.util.List;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

public class Preferencia<T> {
    private final NavigableMap<Double, T> mapa = new TreeMap<>();
    private final Random random;
    private double total = 0;

    public Preferencia() {
        this(new Random());
    }

    public Preferencia(Random random) {
        this.random = random;
    }

    public Preferencia<T> adicionar(T item, double peso) {
        if (peso > 0) {
            total += peso;
            mapa.put(total, item);
            return this;
        } else {
            return this;
        }
    }

    public Preferencia<T> adicionar(List<T> item, double peso) {
        if(peso > 0) {
            int cont = 0;
            for (T i : item) {
                if (mapa.containsValue((i)))
                    cont++;
            }

            double pesoIndividual = peso / (item.size() - cont);

            for (T i : item) {
                if (!(mapa.containsKey(i))) {
                    total += pesoIndividual;
                    mapa.put(total, i);
                }
            }
        }
        return this;
    }

    public Preferencia<T> adicionar(T[] item, double peso) {
        if(peso > 0) {
            int cont = 0;
            for (T i : item) {
                if (mapa.containsValue((i)))
                    cont++;
            }

            double pesoIndividual = peso / (item.length - cont);

            for (T i : item) {
                if (!(mapa.containsValue(i))) {
                    total += pesoIndividual;
                    mapa.put(total, i);
                }
            }

        }
        return this;
    }

    public T obter() {
        double value = random.nextDouble() * total;
        return mapa.higherEntry(value).getValue();
    }
}
