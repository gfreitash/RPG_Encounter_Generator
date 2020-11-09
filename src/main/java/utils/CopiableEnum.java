package utils;


import com.rits.cloning.Cloner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a very niche class that works almost like an enum,
 * however it gives copies of the items instead of references
 * and are way less powerful.
 *
 */
public abstract class CopiableEnum implements Cloneable{
    private final String nome;
    private final int ordinal;
    private static int[] size;
    private static CopiableEnum[][] values;
    private static final List<Class<CopiableEnum>> classes = new ArrayList<>();
    private static final Logger logger = LogManager.getLogger(CopiableEnum.class);

    /**
     * Add the subclass static variable to the 'values' array
     * @param nome the name of static variable
     * @param classe the class of the static variable(must extend NonStaticEnum)
     */
    protected <E extends CopiableEnum> CopiableEnum(String nome, Class<E> classe) {
        logger.debug("Constructing a new NonStaticEnum");
        logger.trace("Constructor parameters - String nome: " + nome + ", " +
                "Class<E> classe: " + classe);
        int index;

        logger.trace("classes.size(): " + classes.size());
        logger.debug("Checking if 'classes' already has elements");

        if(classes.size() > 0) {
            logger.debug("'classes' has elements");
            logger.debug("Checking if 'classe' already is in the 'classes' list");

            if(classes.contains(classe)) {
                logger.debug("'classe' is already in the list");

                index = classes.indexOf(classe);
                logger.trace("The class index of where the new static " +
                        "variable will be stored is: " + index);
            } else {
                logger.debug("'classes' doesn't contais  'classe'");
                logger.trace("Adding 'classe' to the end of the list");

                classes.add((Class<CopiableEnum>) classe);
                logger.warn("Unchecked cast '(Class<NonStaticEnum>) classe'");
                logger.trace("'classe' added to the end of the list");

                index = classes.size()-1;
                logger.trace("The class index of where the new static " +
                        "variable will be stored is: " + index);

                logger.trace("Creating a bigger array of 'values' and copying the old one, " +
                        "to make room for the new type of class added");
                CopiableEnum[][] nse = values;
                values = new CopiableEnum[nse.length+1][];

                for(int i = 0; i <= nse.length; i++) {
                    logger.trace("i: " + i + ", 'nse.length': " + nse.length);
                    logger.trace("Recreating an array to store old values of 'values["+i+"]' or " +
                            "creating a new one if none existed before");

                    try {
                        values[i] = new CopiableEnum[nse[i].length];
                        logger.trace("Values existed");

                        logger.trace("Copying the array of index " + i +
                                " to the new one");
                        logger.trace("'nse["+i+"].length': " + nse[i].length +
                                ", 'values["+i+"].length': " + values[i].length);
                        System.arraycopy(nse[i], 0, values[i], 0, nse[i].length);
                    } catch (ArrayIndexOutOfBoundsException e){
                        logger.trace("None values existed");
                        values[i] = new CopiableEnum[1];
                    }
                }
                logger.trace("expanding 'size' array to match the new " +
                        "class type added");

                int[] temp = size;
                size = new int[index+1];
                System.arraycopy(temp, 0, size, 0, temp.length);
            }

        } else {
            logger.debug("'classes' does not have elements");
            logger.trace("Adding 'classe' to the end of the list");
            classes.add((Class<CopiableEnum>) classe);
            logger.warn("Unchecked cast '(Class<NonStaticEnum>) classe'");

            logger.trace("Creating a basic implementation of 'classe'");
            index = 0;
            logger.trace("The class index of where the new static " +
                    "variable will be stored is: " + index);
            values = new CopiableEnum[1][1];
            size = new int[1];
        }

        logger.debug("Checking if the array 'values[]' of 'values[index]' has elements");
        if(values[index][0] != null) {
            logger.debug("'values[index][]' has elements");

            logger.trace("Expanding the old array to make space for the new static variable");
            CopiableEnum[] temp = values[index];
            values[index] = new CopiableEnum[++size[index]];
            System.arraycopy(temp, 0, values[index], 0, temp.length);
        } else {
            logger.debug("'values[index][]' does not has elements");

            logger.trace("Initializing the array 'values[index][]'");
            size[index]++;
        }

        logger.debug("Adding the static variable to the array");
        logger.trace("Static variable will be added in values["+ index+"]["+(size[index]-1)+"]");
        values[index][size[index]-1] = this;

        logger.trace("Normalizing argument 'nome'");
        this.nome = Utils.normalizar(nome).toUpperCase();
        logger.trace("Setting static variable ordinal value");
        this.ordinal = size[index]-1;
    }

    /**
     * This is expect to work just like enum ordinal()
     * @return ordinal
     */
    public int ordinal() {
        return ordinal;
    }

    private static <E extends CopiableEnum> int findClass(Class<E> classe) {
        logger.trace("classes contém "+ classe +"?");
        if(classes.contains(classe)) {
            System.out.println("sim");
            return classes.indexOf(classe);
        }
        System.out.println("não");
        return -1;
    }

    /**
     * This method should find the element by its name
     * and then return a copy of it.
     *
     * If doesn't it instead return null.
     *
     * This method should be overwritten by the subclass
     * to return the appropriate type.
     * @param str the name of static variable
     * @return n.clone()
     */
    public static <E extends CopiableEnum> CopiableEnum valueOf(String str, Class<E> classe) {
        int index = findClass(classe);

        if(index != -1) {
            for (CopiableEnum n : values[index]) {
                if (n.nome.equals(Utils.normalizar(str).toUpperCase()))
                    return n.clone();
            }
        }
        return null;
    }

    /**
     * This method return a copy of all static members.
     *
     * This method should be overwritten by the subclass
     * to return the appropriate type.
     * @return values[] clone
     */
    public static CopiableEnum[][] values() {
        CopiableEnum[][] copiableEnums = new CopiableEnum[values.length][];
        for(int i = 0; i < copiableEnums.length; i++) {
            copiableEnums[i] = values[i].clone();
        }
        return copiableEnums;
    }

    public static <E extends CopiableEnum> E[] values(Class<E> classe) {
        E[] es = (E[]) Array.newInstance(classe, getSize(classe));
        int index = findClass(classe);
        System.out.println("Array type: " + es.getClass() + "Array size: " + es.length);

        if(index != -1) {
            for (CopiableEnum n : values()[index])
                es[n.ordinal] = (E) n;
            return es;
        }

        return null;
    }

    /**
     * This method returns how many class types
     * this enum have stored and how many static variables they have.
     * @return size
     */
    public static int[] getSize() {
        return size;
    }

    /**
     * This method returns how many static variables
     * this class type have.
     * @return size
     */
    public static <E extends CopiableEnum> int getSize(Class<E> classe) {
        int index = findClass(classe);
        if(index != -1)
            return size[index];

        return -1;
    }

    /**
     * This method clone an static variable.
     * This method is a deep clone copy and should be
     * overwritten by the subclass to return the appropriate type.
     * @return a new copy of a static variable
     */
    public CopiableEnum clone() {
        Cloner cloner = new Cloner();
        return cloner.deepClone(this);
    }

    public String nome() {
        return nome;
    }

    /**
     * This method should return a copy of the
     * object that it was called
     * @return
     */
    public abstract CopiableEnum get();
}
