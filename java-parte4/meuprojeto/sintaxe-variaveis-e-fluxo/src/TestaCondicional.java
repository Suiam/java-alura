
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais.");
		
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) { 
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("seja bem vindo");
		}else {
			if ( quantidadePessoas >= 2) {
				System.out.println("Voce pode entrar pois esta acompanhado");
			} else {
				System.out.println("Infelizmente voce nao pode entrar");
			}
		}
	}
}
