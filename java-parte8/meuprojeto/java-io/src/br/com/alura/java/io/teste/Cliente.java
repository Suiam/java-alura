package br.com.alura.java.io.teste;

import java.io.Serializable;

/** 
 * Classe que representa um cliente no Bytebank
 * @author Suiam
 * @version 0.1
 *
 */

public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9205117266306915548L; // identificacao da classe pois nao faz parte do objeto
	//serialVersionUID - administra a versao da classe
	//É boa prática colocar o atributo estático serialVersionUID na classe quando queremos serializar um objeto
	//o serialVersionUID é da classe (por isso estático) e define a versão ou identificação numérica da classe. Cada vez que alteramos algo incompatível na classe, devemos alterar o seu valor.
	//Sempre quando serializamos o objeto, também será serializado o valor do serialVersionUID.
	//o serialVersionUID é da classe (por isso estático) 
	//e define a versão ou identificação numérica da classe. 
	//Cada vez que alteramos algo incompatível na classe, devemos alterar o seu valor.
	//Sempre quando serializamos o objeto, também será serializado o valor do serialVersionUID.

	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}

