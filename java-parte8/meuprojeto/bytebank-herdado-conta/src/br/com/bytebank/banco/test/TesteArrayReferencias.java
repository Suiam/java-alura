package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//Conta[] contas = new Conta[5];
		//dentro deste array pode viver referencias que serao inicializados com valores padroes - null
		// valor padrao de uma referencia é null
		
		//um array mais generico seria do tipo Object-> Object[] contas = new Object[5];
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		ContaPoupanca cc2 = new ContaPoupanca(123, 221);
	
		referencias[0] = cc1;
		referencias[1] = cc2;
		
		//System.out.println(referencias[0].getNumero());
		//System.out.println(referencias[1].getNumero());
		// System.out.println(contas[3].getNumero()); ate o momento irá ocorrer a exception java.lang.NullPointerException
		
		//ContaPoupanca ref =(ContaPoupanca)contas[1]; //criou uma referencia(ref) que tem o mesmo valor do cc1 que esta no array contas[1]
		//(ContaPoupanca)contas[1] - type cast...tansforma a ref do tipo Conta em ContaPoupanca, ou seja, transforma uma referencia generica em uma mais especifica
		//ContaCorrente ref =(ContaCorrente)contas[1] - ocorrera uma exception - ClassCastException
		//System.out.println(ref.getNumero());

	}

}
