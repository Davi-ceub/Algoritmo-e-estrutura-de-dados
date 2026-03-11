package aula4;

public class Principal {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		a1.setNome("Molina");

		Aluno a2 = new Aluno();
		a2.setNome("José");

		System.out.println(a1.getNome().toUpperCase());
		System.out.println(a2.getNome().toUpperCase());
	}
}
