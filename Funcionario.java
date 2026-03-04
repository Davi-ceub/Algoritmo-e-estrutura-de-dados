
public class Funcionario {

	public String nome = "";
	public double salarioBase = 0.0;

	public Funcionario(String nome, double salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public double calcularSalario() {
		return salarioBase;
	}

	public void Resultado() {
		System.out.println("Nome: " + nome);
		System.out.println("Sálario Final:R$ " + calcularSalario());
	}
}
