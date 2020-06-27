package com.vieira.crud.api.documents;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cliente {
	
	@Id
	private String id;

	@NotEmpty(message = "Nome não pode ser vazio.")
	private String nome;
	
	@NotEmpty(message = "Email não pode ser vazio.")
	@Email(message = "Email inválido.")
	private String email;
	
	@NotEmpty(message = "CPF não pode ser vazio.")
	@CPF(message = "CPF inválido.")
	private String cpf;

	
	public Cliente() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	
}
