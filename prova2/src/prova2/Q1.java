package prova2;

import java.util.ArrayList;

public class Q1 {
	
	public static void main(String[] args) {
		ArrayList<Pessoa> lista = new ArrayList<>();
		
		Pessoa p1 = new Pessoa("Ana",20);
		Pessoa p2 = new Pessoa("Bruno",30);
		
		lista.add(p1);
		lista.add(p2);
		
		Pessoa copia =lista.get(0);
		copia.idade =25;
		
		lista.add(new Pessoa("Ana",25));
		
		System.out.println(lista);
	}
}
