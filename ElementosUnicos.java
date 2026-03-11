
import java.util.ArrayList;
import java.util.HashSet;

public class ElementosUnicos {
	public static void main(String[] args) {

		// Criando o ArrayList
		ArrayList<String> lista = new ArrayList<>();

		// Adicionando elementos (com repetição)
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Ana");
		lista.add("Maria");
		lista.add("Carlos");
		lista.add("João");

		// Usando HashSet para remover duplicados
		HashSet<String> elementosUnicos = new HashSet<>(lista);

		// Mostrando a quantidade de elementos únicos
		System.out.println("Lista original: " + lista);
		System.out.println("Elementos únicos: " + elementosUnicos);
		System.out.println("Quantidade de elementos únicos: " + elementosUnicos.size());
	}
}