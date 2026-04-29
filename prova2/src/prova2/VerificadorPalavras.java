package prova2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerificadorPalavras {

	private Set<String> palavrasUnicas;

	public VerificadorPalavras(List<String> palavras) {
		this.palavrasUnicas = new HashSet<>(palavras);
	}

	public int totalPalavrasUnicas() {
		return palavrasUnicas.size();
	}

	public boolean contemPalavra(String palavra) {
		return palavrasUnicas.contains(palavra);
	}

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("java");
		palavras.add("dados");
		palavras.add("java");
		palavras.add("arvore");
		palavras.add("dados");
		palavras.add("lista");

		VerificadorPalavras vp = new VerificadorPalavras(palavras);

		System.out.println("Total de palavras unicas: " + vp.totalPalavrasUnicas());
		System.out.println("\"java\" esta na lista: " + vp.contemPalavra("java"));
		System.out.println("\"pilha\" esta na lista: " + vp.contemPalavra("pilha"));
	}
}
