
import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {

		// Criando o ArrayList
		ArrayList<String> lista = new ArrayList<>();

		// Adicionando elementos
		lista.add("Maçã");
		lista.add("Banana");
		lista.add("Laranja");
		lista.add("Uva");

		// Imprimindo os elementos da lista
		System.out.println("Elementos da lista: " + lista);

		// Imprimindo o tamanho da lista
		System.out.println("Tamanho da lista: " + lista.size());

		// Verificando se um elemento específico está presente
		String elemento = "Banana";

		if (lista.contains(elemento)) {
			System.out.println("O elemento '" + elemento + "' está na lista.");
		} else {
			System.out.println("O elemento '" + elemento + "' NÃO está na lista.");
		}
	}
}