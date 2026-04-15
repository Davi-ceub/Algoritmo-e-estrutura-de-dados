package aula7;

//Exercício 9: Contar ocorrências em um array
//Crie um método recursivo que conte quantas vezes um número aparece em um array.
//Exemplo:
//contar([1,2,3,2,2,4], 2) = 3
//Assinatura sugerida:
//public static int contar(int[] arr, int valor, int index)
//Dicas:
//Use o índice para percorrer o array
//Caso base: quando index chegar ao tamanho do array
//Passo recursivo:
//Verifique se o elemento atual é igual ao valor
//Some com o resultado da próxima chamada
public class Principal3 {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 5, 5, 7, 8, 9, 5, 4, 2, 5, 5, 5 };
		int resultado = contar(arr, 5, 0);
		System.out.println(resultado);
	}

	public static int contar(int[] arr, int valor, int index) {
		// Caso base: chegou ao fim do array
		if (index == arr.length) {
			return 0;
		}

		// Verifica se o elemento atual é igual ao valor
		int countAtual = (arr[index] == valor) ? 1 : 0;

		// Soma com o resultado da próxima chamada recursiva
		return countAtual + contar(arr, valor, index + 1);
	}

}
