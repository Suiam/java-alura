package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName()); //imprime o encoding utilizado (no caso deste sistema operacional é o UTF-8)
		
		//byte[] bytes = s.getBytes(); // quantos bytes
		byte[] bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length + " , UTF-8.");
		String sNovo = new String(bytes, "utf-8"); 
		System.out.println(sNovo); //usa o charset UTF-8
		
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + " , UTF-16, ");
		//sNovo = new String(bytes, "utf-8"); //como aqui esta usando utf 8 e acima é utf-16 tem problema ao codificar 
		sNovo = new String(bytes, "utf-16");
		System.out.println(sNovo); 
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + " , US-ASCII, ");
		//sNovo = new String(bytes, "utf-8");
		sNovo = new String(bytes, "us-ascii"); // como no ascii nao ha ç continuará dando erro nesse caso. Ira aparecer um ponto de interrogaçao
		System.out.println(sNovo); //como aqui esta usando utf 8 e acima é US-ASCII tem problema ao codificar. Para nao ter esse problema é so colocar acima o adequado (US-ASCII) 		
	}

}
