
import java.util.ArrayList;

public class ContarOcorrencias {
	public static void main(String[] args) {

		// Criando o ArrayList
		ArrayList<String> lista = new ArrayList<>();

		// Adicionando elementos
		lista.add("Java");
		lista.add("Python");
		lista.add("Java");
		lista.add("C++");
		lista.add("Java");
		lista.add("Python");

		// String que queremos contar
		String busca = "Java";

		int contador = 0;

		// Percorrendo a lista
		for (String elemento : lista) {
			if (elemento.equals(busca)) {
				contador++;
			}
		}

		// Resultado
		System.out.println("Lista: " + lista);
		System.out.println("A palavra '" + busca + "' aparece " + contador + " vezes.");
	}
}