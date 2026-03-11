import java.util.ArrayList;

public class ReverterLista {

	public static ArrayList<String> inverterLista(ArrayList<String> lista) {
		ArrayList<String> listaReversa = new ArrayList<>();

		for (int i = lista.size() - 1; i >= 0; i--) {
			listaReversa.add(lista.get(i));
		}

		return listaReversa;
	}

	public static void main(String[] args) {

		ArrayList<String> palavras = new ArrayList<>();

		palavras.add("Java");
		palavras.add("Python");
		palavras.add("C++");
		palavras.add("JavaScript");

		ArrayList<String> resultado = inverterLista(palavras);

		System.out.println("Lista original: " + palavras);
		System.out.println("Lista reversa: " + resultado);
	}
}