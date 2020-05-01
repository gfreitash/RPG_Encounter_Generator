package requisito;

public abstract class Requisito {
	
	public CompararRequisito corresponde(Requisito outro) {
		return equals(outro) ? CompararRequisito.IGUAL: CompararRequisito.DIFERENTE;
	}
	
	public abstract Object getRequisito();
	
	public abstract boolean equals(Object o);
	
	public abstract int hashCode();
}
