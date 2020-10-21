package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passageiro {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private String senha;
	
	public Passageiro() {
		super();
	}

	public Passageiro(String nome, String email, String cpf, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
	
}
