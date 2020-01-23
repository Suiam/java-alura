package br.com.bytebank.banco.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeserializacao{ 

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular());
		//da erro dizendo q a ContaCorrente nao tem um construtor valido - java.io.InvalidClassException
		//ContaCorrente tem como classe mae a class Conta que precisa ser Serializable
		// colocando na classe implements Serializable uma outra excecao ocorre - java.io.InvalidClassException
		//isso ocorre pq na classe mae conta ha uma propriedade Cliente que nao esta como serializable...sendo assim deve-se colocar serializable na classe cliente
		// oq pode fazer tb é dizer q o CLiente na classe Conta é transient: transient...se grava uma conta corrente o Cliente nao é gravado no objeto
		//colocando transient o print de getTItular virá null pois o cliente nao é gravado.
		
		
	}
}
