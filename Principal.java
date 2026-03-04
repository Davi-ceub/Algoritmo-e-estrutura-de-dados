
public class Principal {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Rodrigo",6500); 
		Funcionario f2 = new Gerente("Pedro",10000);
		Funcionario f3 = new Estagiario("Marcos",3500);
		
		f1.Resultado();
		f2.Resultado();
		f3.Resultado();
	}
}
