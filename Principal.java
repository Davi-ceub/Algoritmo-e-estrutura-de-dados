package aula7;

public class Principal {

	static int soma = 0;

	public static void main(String[] args) {

		// System.out.println(somaSR(100));

		System.out.println(somaCR(100));
	}

	// com recursão
	public static int somaCR(int numero) {

		if (numero == 1) {
			return 1;
		}
		return numero + somaCR(numero - 1);
	}

	// sem recursão
	public static int somaSR(int numero) {
		int soma = 0;
		for (int i = 0; i <= numero; i++) {
			soma = soma + i;
		}
		return soma;
	}
}
