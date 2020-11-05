package core;

public interface Requisitavel extends Checavel{

    /**
     * Returns this object as a requirement
     */
    default Requisito asRequisito(){
        return new Requisito(this);
    }
}
