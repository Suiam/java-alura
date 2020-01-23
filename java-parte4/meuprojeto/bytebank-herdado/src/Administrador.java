
public class Administrador extends Funcionario implements Autenticavel { //administrador herda da classe funcionario e assina o contrato Autenticavel
	
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador= new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		
		return 50;
	}

}
