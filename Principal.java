package aula4_2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<String> carros = new ArrayList<String>();
		carros.add("Pulse");
		carros.add("Honda Fit");
		carros.add("147");
		carros.add("Opala");
		carros.add("Byd");

		System.out.println(carros);

		carros.remove(2);

		System.out.println(carros);

		carros.remove("Byd");

		System.out.println(carros);

		// acessando uma informação específica
		System.out.println(carros.get(1));

		carros.set(0, "Abarth");

		System.out.println(carros);

		for (String carro : carros) {
			System.out.println(carro);
		}
	}
}
