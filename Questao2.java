public class Questao2 {
	
	public static void main(String[] args) {
		// define array de números
		int[] n = {1, 5, 3, 4, 2};
		// define a variável da diferença alvo
		int x = 2;
		// define a variável contadora
		int contador = 0;
		// loop para percorrer o array e comparar os valores encontrados
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n.length; j++) {
				// calcula a diferença e compara com o valor de x, contando se verdadeiro
				if(n[i]-n[j] == x || n[j]-n[i] == x) {
					contador++;
				}
			}
		}
		// imprime o número de elementos pares do vetor que tem uma diferença igual ao valor de x
		System.out.println(contador/2);
	}
}
