package prova2;

import java.util.ArrayList;
import java.util.List;

public class ListaEspera {

	private List<String> fila;

	public ListaEspera() {
		fila = new ArrayList<>();
	}

	// adiciona no final da fila
	public void entrarNaFila(String nome) {
		fila.add(nome);
	}

	// remove e retorna o primeiro da fila
	public String chamarProximo() {
		if (fila.isEmpty()) {
			return "Fila vazia";
		}
		return fila.remove(0);
	}

	// retorna posição (base 1)
	public int posicaoNaFila(String nome) {
		int pos = fila.indexOf(nome);
		if (pos == -1) {
			return -1;
		}
		return pos + 1;
	}

	// exibe fila com posições
	public void exibirFila() {
		for (int i = 0; i < fila.size(); i++) {
			System.out.println((i + 1) + ": " + fila.get(i));
		}
	}

	// teste
	public static void main(String[] args) {

		ListaEspera lista = new ListaEspera();

		lista.entrarNaFila("Carlos");
		lista.entrarNaFila("Ana");
		lista.entrarNaFila("Bruno");
		lista.entrarNaFila("Ana");

		System.out.println("Proximo: " + lista.chamarProximo());

		System.out.println("Posicao de Ana: " + lista.posicaoNaFila("Ana"));
		System.out.println("Posicao de Carlos: " + lista.posicaoNaFila("Carlos"));

		System.out.println("Fila atual:");
		lista.exibirFila();
	}
}
