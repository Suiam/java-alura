
public class TesteSacaValoresNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101)); // nao realiza pois retorna false
		
		System.out.println(conta.getSaldo());
	}
	
}
