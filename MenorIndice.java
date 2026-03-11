import java.util.ArrayList;

public class MenorIndice {
	public static void main(String[] args) {

		// Criando o ArrayList
		ArrayList<Integer> numeros = new ArrayList<>();

		// Adicionando números
		numeros.add(15);
		numeros.add(8);
		numeros.add(23);
		numeros.add(4);
		numeros.add(12);

		// Inicializando com o primeiro elemento
		int menor = numeros.get(0);
		int indiceMenor = 0;

		// Percorrendo a lista para encontrar o menor número
		for (int i = 1; i < numeros.size(); i++) {
			if (numeros.get(i) < menor) {
				menor = numeros.get(i);
				indiceMenor = i;
			}
		}

		// Resultado
		System.out.println("Lista: " + numeros);
		System.out.println("Menor número: " + menor);
		System.out.println("Índice do menor número: " + indiceMenor);
	}
}
