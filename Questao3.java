public class Questao3 {
	
	public static void main(String[] args) {
		// define variável de texto
		String s = "ola mundo";
		// remove espaços em branco
		String semEspaco = s.replaceAll("\\s+", "");
		// transfere para um array
		String[] arrS = semEspaco.split("");
		// define o tamanho do grid com base no numero de caracteres do texto
		int grid = (int) Math.round(Math.sqrt(semEspaco.length()));
		// define matriz n * n
		String[][] gridS = new String[grid][grid];
		// define variável contadora
		int init = 0;
		
		// loop para montar a matriz de caracteres
		for (int i = 0; i < grid; i++) {
			// inicializa a variável j a cada volta
			int j = 0;
			// loop para preencher a linha da matriz
			while (j < grid && init < arrS.length) {
				gridS[i][j] = arrS[init];
				j++;
				init++;
			}
		}
		// loop dentro de loop para exibir o resultado das colunas
		for (int i = 0; i < grid; i++) {
			String resultado = "";
			for (int j = 0; j < grid; j++) {
				// testa se a posição na matriz de caracteres está vazia e interrompe o loop se true
				if (gridS[j][i] == null) {
					break;
				}
				resultado = resultado + gridS[j][i];
			}
			// imprime o resultado
			System.out.print(resultado);
			System.out.print(" ");
		}
	}
}
