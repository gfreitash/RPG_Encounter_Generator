package utils;

/**
 * This is a very niche that class works almost like an enum,
 * however it gives copies of the items instead of references
 * and are way less powerful.
 *
 * It's recommended that all of subclasses overwrite the methods
 * to have the subclass class return type.
 */
public abstract class NonStaticEnum implements Cloneable{
    private final String nome;
    private final int ordinal;
    private static int size = 0;
    private static NonStaticEnum[] values;

    /**
     * Only the name is important as a parameter here,
     * since the constructor handles the rest
     * @param nome
     */
    protected NonStaticEnum(String nome) {
        this.nome = Utils.normalizar(nome).toUpperCase();
        this.ordinal = size;

        if(size > 0) {
            NonStaticEnum[] temp = values;
            values = new NonStaticEnum[++size];
            System.arraycopy(temp, 0, values, 0, temp.length);
        } else {
            values = new NonStaticEnum[++size];
        }
        values[size - 1] = this;
    }

    /**
     * This is expect to work just like enum ordinal()
     * @return
     */
    public int ordinal() {
        return ordinal;
    }

    /**
     * This method should find the element by its name
     * and then return a copy of it.
     *
     * If doesn't it instead return null.
     *
     * This method should be overwritten by the subclass
     * to return the appropriate type.
     * @param str
     * @return
     */
    public static NonStaticEnum valueOf(String str) {
        for(NonStaticEnum n: values) {
            if (n.nome.equals(str))
                return n.clone();
        }
        return null;
    }

    /**
     * This method return a copy of all static members.
     *
     * This method should be overwritten by the subclass
     * to return the appropriate type.
     * @return
     */
    public static NonStaticEnum[] values() {
        NonStaticEnum[] nonStaticEnums = new NonStaticEnum[values.length];
        for(int i = 0; i < nonStaticEnums.length;i++)
            nonStaticEnums[i] = values[i].clone();

        return nonStaticEnums;
    }

    /**
     * This just returns how many static variables
     * this class have.
     * @return
     */
    public static int size() {
        return size;
    }

    /**
     * This method clone an static variable.
     * This method is a shallow copy and should be
     * overwritten by the subclass to return the appropriate type
     * and a deep copy, if needed.
     * @return
     */
    public NonStaticEnum clone() {
        try {
            return (NonStaticEnum) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
