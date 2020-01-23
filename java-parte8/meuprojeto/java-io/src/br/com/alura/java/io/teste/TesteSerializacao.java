package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		String nome = "Suiam Costa";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//		String nome = (String)ois.readObject();
//		ois.close();
//		System.out.println(nome);
		
		//codigo escrita
//		Cliente cliente = new Cliente();
//		cliente.setNome("Suiam Costa");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("13391710748");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		//ocorrerá uma exceçao -  java.io.NotSerializableException
		//a classe Cliente nao assina a interface Serializable como a classe String assina. Por isso ocorreu o erro
		// para nao ocorrer mais esse erro deve ser colocado na classe Cliente - implements Serializable
		
		
		//codigo leitura
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente)ois.readObject();
		ois.close();
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getProfissao());
		//colocado na classe Cliente um identificador da classe (o serialVersionUID) ocorrera um erro - java.io.InvalidClassException
		//java.io.InvalidClassException - qdo grava um objeto, grava-se os dados do objeto mas tambem foi gravada uma identificacao da classe. Um numero que identifica uma versao da classe em memoria
		//essa versao é vista na excecao -  stream classdesc serialVersionUID = 9205117266306915548,
		//qdo recupera esse arquivo ele ve o id e compara com o id q esta na classe(q esta 1). 
		//Sendo assim os ids sao diferentes agora (a diferenca se deu devido a criacao aqui ter ocorrido antes do id da classe cliente)
		//para isso basta substituir o id da classe com o id informado no erro.
		//ocorrendo mudanças na classe o id vai se alterando caso nao coloque o serialVersionUID na classe. Para evitar isso deve-se criar o Id na classe forçando uma versao.
		
	}

}


//A transformação do objeto em um fluxo binário é chamada de serialização.
//A transformação de um fluxo binário em um objeto é chamada de desserialização.