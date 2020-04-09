package requisito;

import core.Pericia;

public class RequisitoPericia {
	private Pericia pericia;
	
	public RequisitoPericia(Pericia pericia) {
		this.pericia = pericia;
	}
	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o instanceof RequisitoPericia) {
			RequisitoPericia reqPeri = (RequisitoPericia) o;
			return pericia.equals(reqPeri.pericia);
		}
		return false;
	}
}
