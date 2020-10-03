package core;

import java.util.ArrayList;
import java.util.List;

import requisito.Requisito;

public abstract class Vantagem extends Identidade {
	
	private String tipo;
	private String desc_tipo;
	private String especializacao;
	private List<Requisito> requisitos;
	
	protected Vantagem(String nome, String desc, String tipo, String desc_tipo) {
		super(nome, desc);
		this.tipo = tipo;
		this.desc_tipo = desc_tipo;
	}
	
	protected Vantagem(String nome, String desc, String tipo, String desc_tipo, Requisito ... requisitos) {
		super(nome, desc);
		this.tipo = tipo;
		this.desc_tipo = desc_tipo;
		
		this.requisitos = new ArrayList<Requisito>();
		for(Requisito x: requisitos) {
			this.requisitos.add(x);
		}
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getDescTipo() {
		return desc_tipo;
	}
	
	public String getEspecializacao() {
		return especializacao;
	}
	
	public List<Requisito> getRequisitos() {
		return requisitos;
	}
	
}
