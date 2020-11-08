package br.com.agenda.model;

public class Local {
	private long id;
	private String nome;

	public long getId() {
		return id;
	}

	public Local(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Local [id=" + id + ", nome=" + nome + "]";
	}

}
