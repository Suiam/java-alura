
public class Gerente extends Funcionario implements Autenticavel { //gerente herda da classe funcionario e assina o contrato Autenticavel
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador= new AutenticacaoUtil(); //composicao = um depende do outro. O gerente tem um autenticacaoutil.
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
		System.out.println("Bonificacao Gerente");
		return super.getSalario(); //super - indicar q o salario pertence a classe mae e nao esta definido na classe filha
	}	
}


