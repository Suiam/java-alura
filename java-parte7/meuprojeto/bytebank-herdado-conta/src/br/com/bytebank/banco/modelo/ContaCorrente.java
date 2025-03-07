package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel, Serializable {
	
	public ContaCorrente(int agencia, int numero) { //chama o construtor especifico da class Conta
		super(agencia, numero);
	}
	
	@Override 
	//anotacao na configuracao; configuracao para o compilador; esta sobrescrevendo o metodo saca da super class
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override 
	//anotacao na configuracao; configuracao para o compilador; esta sobrescrevendo o metodo saca da super class
	public void deposita(double valor) {
		super.saldo += valor; 
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta corrente, " + super.toString();
	}
}
