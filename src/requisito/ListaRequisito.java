package requisito;

import java.util.ArrayList;
import java.util.List;

public class ListaRequisito {
	private List<Requisito> requisitos;
	private boolean temRequisitos;
	
	public ListaRequisito() {
		requisitos = new ArrayList<Requisito>();
		temRequisitos = true;
	}
	
	public ListaRequisito(Requisito ... req) {
		requisitos = new ArrayList<Requisito>();
		for(Requisito x: req) {
			requisitos.add(x);
		}
		temRequisitos = false;
	}
	
	public ListaRequisito(ListaRequisito ... requisitos) {
		this.requisitos = new ArrayList<Requisito>();
		for(ListaRequisito x: requisitos) {
			if(x.temRequisitos)
				this.requisitos.addAll(x.getRequisitos());
		}
	}
	
	public List<Requisito> getRequisitos() {
		return requisitos;
	}
	
	public boolean temRequisitos() {
		return temRequisitos;
	}
}
