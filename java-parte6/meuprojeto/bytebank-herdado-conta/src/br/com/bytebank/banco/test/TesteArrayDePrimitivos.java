package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
	
	//Array []
	public static void main(String[] args) {
		
		int []idades = new int[5];// coloca entre colchetes o tamanho do array
		//int idades[];
		// ao criar o array com new o array inicializa com os valores padroes ou seja zero.
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		
		//int idade1 = idades[40]; //java.lang.ArrayIndexOutOfBoundsException- excecao dada ao tentar acessar uma posicao que nao tem no array
		System.out.println(idades.length);// imprime o tamanho do array
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
			
		}
		
		
	}

}
