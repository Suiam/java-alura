package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException { //sem colocar um tratamento d exception nao funciona
		
		//Fluxo de Entrada com Arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");	
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		//bw.newLine();
		bw.newLine();
		bw.write("ahuhsuhdsuhdu hauHDUSHDUDS AHUDHSDUFH");
		
		
		bw.close(); 
	}

}
