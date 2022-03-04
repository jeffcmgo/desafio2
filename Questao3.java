

public class Questao3 {
	public static void main(String[] args) {
		String s = "ola mundo";
		String semEspaco = s.replaceAll("\\s+", "");
		String[] arrS = semEspaco.split("");

		int grid = (int) Math.round(Math.sqrt(semEspaco.length()));
		String[][] gridS = new String[grid][grid];

		int init = 0;

		for (int i = 0; i < grid; i++) {

			int j = 0;

			while (j < grid && init < arrS.length) {
				gridS[i][j] = arrS[init];
				j++;
				init++;
			}
		}

		for (int i = 0; i < grid; i++) {
			String resultado = "";
			for (int j = 0; j < grid; j++) {
				if (gridS[j][i] == null) {
					break;
				}
				resultado = resultado + gridS[j][i];
			}
			System.out.print(resultado);
			System.out.print(" ");
		}
	}
}
