package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) { //ver setinha do lado do run -> run configurations -> arguments -> passa os args e eles apareceram no console ao rodar
		
		System.out.println("Funcionou");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
