
import java.util.ArrayList;

public class RemoverPares {
	public static void main(String[] args) {

		// Criando o ArrayList
		ArrayList<Integer> numeros = new ArrayList<>();

		// Adicionando números
		numeros.add(10);
		numeros.add(7);
		numeros.add(4);
		numeros.add(9);
		numeros.add(2);
		numeros.add(15);

		// Removendo números pares
		numeros.removeIf(numero -> numero % 2 == 0);

		// Exibindo a lista final
		System.out.println("Lista após remover números pares: " + numeros);
	}
}