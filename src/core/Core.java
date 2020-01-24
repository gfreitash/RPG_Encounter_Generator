package core;

public abstract class Core {
	private String nome;
	private String desc;
	
	protected Core(String nome, String desc) {
		this.nome = nome;
		this.desc = desc;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDesc() {
		return desc;
	}
	
}
