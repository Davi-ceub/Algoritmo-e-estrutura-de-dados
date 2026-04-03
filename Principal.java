package Hashset;

import java.util.HashSet;

public class Principal {
	// Crie um HashSet vazio chamado "mySet".
	// Adicione os números 1, 2, 3, 4 e 5 ao HashSet "mySet".
	// Verifique se o HashSet "mySet" contém o número 3.
	// Remova o número 2 do HashSet "mySet".
	// Verifique se o HashSet "mySet" está vazio.
	// Crie outro HashSet chamado "otherSet" e adicione os números 4, 5, 6 e 7.
	// Retenha no HashSet "mySet" apenas os elementos presentes em "otherSet".
	// Adicione todos os elementos de "otherSet" ao HashSet "mySet".
	// Obtenha o tamanho atual do HashSet "mySet".
	// Percorra todos os elementos do HashSet "mySet" e imprima cada um deles.

	public static void main(String[] args) {
		HashSet<Integer> mySet = new HashSet<Integer>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(5);
		System.out.println(mySet);
		System.out.println(mySet.contains(3));
		mySet.remove(2);
		System.out.println(mySet);
		System.out.println(mySet.size());
		
		HashSet<Integer> otherSet = new HashSet<Integer>();
		otherSet.add(4);
		otherSet.add(5);
		otherSet.add(6);
		otherSet.add(7);
		System.out.println(otherSet);
		mySet.remove(1);
		mySet.remove(3);
		System.out.println(mySet);
		mySet.add(6);
		mySet.add(7);
		System.out.println(mySet.size());
		for(int i : mySet) {
			System.out.println(i);
		}
	}

}
