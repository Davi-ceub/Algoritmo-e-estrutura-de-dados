package aula7;

public class Principal2 {

	public static void main(String[] args) {
		System.out.println(fatorialSR(5));
		System.out.println(fatorialCR(5));
	}

	public static int fatorialCR(int numero) {
		if (numero == 1 || numero == 0) {
		}
		return numero * fatorialCR(numero - 1);
	}

	public static int fatorialSR(int numero) {
		int resultado = 1;
		for (int i = numero; i > 0; i--) {
			resultado = resultado * i;
		}
		return resultado;
	}
}