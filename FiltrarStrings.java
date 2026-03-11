import java.util.ArrayList;

public class FiltrarStrings {

	public static ArrayList<String> filtrarPorLetra(ArrayList<String> lista, char letra) {
		ArrayList<String> resultado = new ArrayList<>();

		for (String palavra : lista) {
			if (palavra.toLowerCase().startsWith(String.valueOf(letra).toLowerCase())) {
				resultado.add(palavra);
			}
		}

		return resultado;
	}

	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<>();

		palavras.add("Ana");
		palavras.add("Bruno");
		palavras.add("Amanda");
		palavras.add("Carlos");
		palavras.add("Aline");

		char letra = 'A';

		ArrayList<String> filtradas = filtrarPorLetra(palavras, letra);

		System.out.println("Palavras que começam com " + letra + ": " + filtradas);
	}
}