


package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics - pode especificar a classe. No caso foi especificado que o array so tera Conta
		//ArrayList<Conta> lista = new ArrayList(); //especificou que apenas pode ser criado referencias do tipo Conta
		//LinkedList<Conta> lista = new LinkedList<Conta>();
		//List<Conta> lista = new ArrayList<Conta>();
		// no java.util.List tem-se : ArrayList, LinkedList e Vector
		//Lista - sequencias, duplicados...diferente do HashSet
		
		List<Conta> lista = new Vector<Conta>(); //thread safe
		Conta cc = new ContaCorrente(11,11);
		//Cliente cliente = new Cliente(); //nao conseguira colocar cliente pois a lista é d conta...antes d colocar poderia colocar cliente
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0); // ocorrera colocando Cliente um java.lang.ClassCastException
		System.out.println( ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33,33);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(44,44);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("------------------------------");
		for (Object oRef: lista) { //pra cada elemento imprime o elemento, Parecido com o for d cima
			System.out.println(oRef);
		}
		
		
	}

}
