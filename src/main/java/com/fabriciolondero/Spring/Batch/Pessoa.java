package com.fabriciolondero.Spring.Batch;

public class Pessoa 
{
	private String sobrenome;
	  private String nome;

	  public Pessoa() {
	  }

	  public Pessoa(String nome, String sobrenome) {
	    this.nome = nome;
	    this.sobrenome = sobrenome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  public String getNome() {
	    return nome;
	  }

	  public String getSobrenome() {
	    return sobrenome;
	  }

	  public void setSobrenome(String sobrenome) {
	    this.sobrenome = sobrenome;
	  }

	  @Override
	  public String toString() {
	    return "Nome: " + nome + ", sobrenome: " + sobrenome;
	  }

}
