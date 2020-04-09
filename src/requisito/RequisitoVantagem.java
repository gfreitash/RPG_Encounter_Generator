package requisito;

import core.Vantagem;

public class RequisitoVantagem extends Requisito {
	Vantagem vantagem;
	
	public RequisitoVantagem(Vantagem vantagem) {
		this.vantagem = vantagem;
	}
	
	@Override
	public CompararRequisito corresponde(Requisito outro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o instanceof RequisitoVantagem) {
			RequisitoVantagem reqVant = (RequisitoVantagem) o;
			return vantagem.equals(reqVant.vantagem);
		}
		return false;
	}

}
