public class Questao1 {
	
	public static void main(String[] args) {
		// define array de números ímpares
		int [] arr = {5, 2, 1, 3, 4};
		// define variável auxiliar para troca de valores
		int aux = 0;
		// loop para percorrer o array comparando os valores
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				// testa se uma posição do array é menor que a outra
				if(arr[i] < arr[j]) {
					// troca os valores de maneira ordenada
					aux = arr[i];
					arr[i] = arr[j];
					arr[j] = aux;
				}
			}
		}
		// calcula a mediana
		int n = (int) arr[Math.round(arr.length / 2)];
		// imprime a mediana do array
		System.out.println(n);
	}
}