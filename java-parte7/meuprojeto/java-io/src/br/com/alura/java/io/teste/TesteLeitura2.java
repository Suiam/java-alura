package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8"); //especificando o charset que quer utilizar
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);	
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(","); //definindo o caracter de separacao
			
			String tipoConta = linhaScanner.next();
			linhaScanner.useLocale(Locale.US); //regras regionais encapsuladas aqui. Usa as regras americanas para os numeros
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format(new Locale("pt", "BR") , "%s - %04d-%010d, %20s: %08.2f %n", tipoConta, agencia, numero, titular, saldo);
			//%04 -preenche para ficar com 4 inteiros sendo 22 ficara 0022
			//%010d - preenche com zero para ficar com 10 decimais sendo 33 ficara 0000000033
			//%20s - da um espaco de 20 caracteres para string
			//%08.2f - formatando um float
			
			System.out.println(valorFormatado);
		
			linhaScanner.close();
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
		}
		scanner.close();
	}
}
