// nao pode instanciar essa classe pois ela é abstract
// nao se perde os beneficios da herança
public abstract class Funcionario {
	
	
	private String nome;
	private String cpf;
	private double salario; //public para as classes filhas
	
	
	public abstract double getBonificacao(); // metodo nao tem um corpo; nao ha implementacao aqui somente nos filhos ha implementacao deste metodo
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
