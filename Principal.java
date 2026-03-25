import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		System.out.println(numeros);
		numeros.remove(1);
		System.out.println(numeros);
		if (numeros.contains(40)) {
			System.out.println("Encontrado");
		} else {
			System.out.println("Não encontrado");
		}

	}
}
