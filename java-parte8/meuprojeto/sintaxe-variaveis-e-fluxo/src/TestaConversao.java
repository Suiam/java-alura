
public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int)salario; //casting
		System.out.println(valor);
		
		long numeroGrande = 128273874878L;
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1= 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2; //0.30000000000000004
		System.out.println(total);
		
		float pontoFlutuante = 3.14f;
	}
}
