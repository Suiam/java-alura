
public class AliquotaJoao {
	public static void main(String[] args) {
		
		double salario = 3300.00;
		
		if(salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("Deduz da declaracao o valor de R$ 142,00");
		}else if (salario >= 2800 && salario <= 3751.01) {
			System.out.println("IR de 15% e pode deduzir R$ 350,00");
		}else if ( salario >= 3751.01 && salario < 4664.00) {
			System.out.println("IR de 22.5% e pode deduzir R$ 636,00");
			
		}
	}
}
