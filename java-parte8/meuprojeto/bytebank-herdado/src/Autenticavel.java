//contrato autenticavel.
//quem assina o contrato precisa implementar os metodos setSenha e autentica.
//interface nao pode ter nada concreto.

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
