package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo.CalculadorDeImposto => full qualified name FQN
public class CalculadorDeImposto{ //nome simples 
	
	private double totalImposto;
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
