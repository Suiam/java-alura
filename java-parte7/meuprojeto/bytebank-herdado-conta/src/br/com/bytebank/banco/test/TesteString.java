package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Alura"; //String é uma classe vinda do pacote java.lang
		//object literal
		//nesse caso nao precisa usar new String para criar um objeto. 
		// nada impende q seja feito isso mas nao é necessario e é considerado ma pratica
		//String outro = new String("Alura");
		
		nome.replace('A', 'a'); // char coloca aspas simples
		//nome.replace("Al", "aL"); //  coloca aspas duplas por ser expressao e nao char
		System.out.println(nome);
		
		nome.toLowerCase();
		System.out.println(nome);
		// nos dois casos nao mudou pois a string é imutavel. Para mudar tem q criar uma nova string para a nova string refletir a alteracao
		// a mudança reflete em outro objeto.
		
		String outra = nome.replace("A", "a");
		System.out.println(outra);
		
		String outra2 = nome.toUpperCase();
		System.out.println(outra2);
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		String substring = nome.substring(1);
		System.out.println(substring);
		
		System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = " "; // como tem espaço a string nao esta vazia
		System.out.println(vazio.isEmpty());
		
		String outrovazio = vazio.trim(); // tira o espaco no inicio e fim d uma string
		System.out.println(outrovazio.isEmpty()); //voltara true pois o trim tira o espaço q ha na string vazio.
		
		System.out.println(nome.contains("Alu"));
		System.out.println(vazio.contains("Alu"));
		//System - classe,java.lang, acesso publico(public)
		//out - atributo, public,referencia, static
		//println - metodo, public,nao static, sobrecarga, nao joga excecoes do tipo checked  
		
	}

}
