import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("John", 32);
		people.put("Steve", 30);
		people.put("Angie", 33);

		for (String nome : people.keySet()) {
			Integer idade = people.get(nome);
			if (idade < 31) {
				System.out.println("Key: " + nome + "Value: " + people.get(nome));
			}
		}
	}
}
