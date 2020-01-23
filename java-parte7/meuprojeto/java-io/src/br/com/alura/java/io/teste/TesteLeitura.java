package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException { //sem colocar um tratamento d exception nao funciona
		
		//Fluxo de Entrada com Arquivo
		//Padrao Decorator
		
		//classe mais generica - InputStream
		//FileInputStream extends InputStream
		InputStream fis = new FileInputStream("lorem.txt");//coloca throws IOException pois deve-se colocar um tratamento d exception para funcionar.
		
		//classe mais generica - InputStream
		//InputStreamReader extends Reader
		Reader isr = new InputStreamReader(fis, "UTF-8"); //com essa classe transforma-se bit e bytes em caracter
		BufferedReader br = new BufferedReader(isr); //guarda os caracteres em uma linha
		//BufferedReader até é uma subclasse de Reader, no entanto, 
		//como precisamos do método readLine() 
		//e Reader não possui esse método, então é necessário que a referência seja do tipo BufferedReader.
		String linha = br.readLine(); //coloca throws IOException pois deve-se colocar um tratamento d exception para funcionar.
		
		//Stream - input stream of bytes
		//Reader - reading character streams
		
		while(linha!= null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close(); //fechando o buffered,InputStreamReader e FileInputStream
	}

}
