package aula5;

import java.util.HashMap;

public class Exercicio {

	public static void main(String[] args) {

		// Crie um HashMap vazio chamado "myMap".
		// Adicione uma chave "nome" e um valor "João" ao HashMap "myMap".
		// Verifique se o HashMap "myMap" contém a chave "nome".
		// Adicione mais três pares chave-valor ao HashMap "myMap".
		// Obtenha o valor associado à chave "idade" do HashMap "myMap".
		// Remova a chave "nome" do HashMap "myMap".
		// Verifique se o HashMap "myMap" está vazio.
		// Obtenha o tamanho atual do HashMap "myMap".
		// Percorra todas as chaves do HashMap "myMap" e imprima cada uma delas.
		// Percorra todos os valores do HashMap "myMap" e imprima cada um deles.

		HashMap<String, String> myMap = new HashMap<String, String>();
		myMap.put("nome", "João");
		System.out.println(myMap.get("nome"));
		myMap.put("nome", "Pedro");
		myMap.put("nome", "Lucas");
		myMap.put("nome", "Mateus");
		System.out.println(myMap.get("idade"));
		for (String i : myMap.keySet()) {
			System.out.println(i);
		}
		for (String i : myMap.values()) {
			System.out.println(i);
		}
		myMap.remove("nome");
		System.out.println(myMap);
		System.out.println(myMap.size());

	}
}
