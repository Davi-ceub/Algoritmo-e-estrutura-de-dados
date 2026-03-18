package aula5;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
			
		HashMap<Integer, String> alunos = new HashMap<Integer, String>();
		alunos.put(123456, "Molina");
		alunos.put(654321, "José");
		alunos.put(554466,"Maria");
		System.out.println(alunos);
		System.out.println(alunos.get(654321));
		// alteração de valor
		alunos.put(654321, "João");
		System.out.println(alunos);
		//removendo valor
		alunos.remove(654321);
		System.out.println(alunos);
		alunos.size();
		System.out.println(alunos.size());
	}
}