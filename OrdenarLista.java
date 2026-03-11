import java.util.ArrayList;
import java.util.Collections;

public class OrdenarLista {
	public static void main(String[] args) {

		// Criando o ArrayList
		ArrayList<String> nomes = new ArrayList<>();

		// Adicionando elementos
		nomes.add("Carlos");
		nomes.add("Ana");
		nomes.add("Bruno");
		nomes.add("Daniela");
		nomes.add("Eduardo");

		// Ordenando em ordem alfabética
		Collections.sort(nomes);

		// Exibindo a lista ordenada
		System.out.println("Lista em ordem alfabética: " + nomes);
	}
}