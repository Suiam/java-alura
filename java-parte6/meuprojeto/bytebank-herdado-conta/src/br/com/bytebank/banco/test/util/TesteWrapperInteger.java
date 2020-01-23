package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int idade = 29;
		//List numeros = new ArrayList();
		//numeros.add(idade); // nao deveria deixar adicionar um primitivo uma vez que a List da com referencias.
		//isso ocorre pq o Java transforma o primitivo em Objeto (Integer idadeRef = new Integer(29)) e com isso tem-se uma referencia para guardar na List.o nome disso é AutoBoxing
		//AutoBoxing - do primitivo para o Objeto
		//Unboxing - do Objeto para primitivo
		
		
		Integer idadeRef = Integer.valueOf(29); //Autoboxing
		int valor = idadeRef.intValue(); // devolve um primitivo. Unboxing
		System.out.println(idadeRef.doubleValue()); 
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		String s = args[0];
		//Integer num = Integer.valueOf(s);//tranforma o string em um numero
		int num = Integer.parseInt(s); ////tranforma o string em um numero parseando
		System.out.println(num);
		
		List<Integer> numeros = new ArrayList<Integer>(); // esse seria o correto a fazer ao inves d adicionar o primitivo como feito acima
		
		
	}

}
