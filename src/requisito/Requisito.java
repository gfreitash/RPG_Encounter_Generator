package requisito;

public abstract class Requisito {
	
	public CompararRequisito corresponde(Requisito outro) {
		return equals(outro) ? CompararRequisito.IGUAL: CompararRequisito.DIFERENTE;
	}
	
	public abstract boolean equals(Object o);
}
