package exerciciosJava;

public class Ex11 {
	
	public static void printMatrix(double m[][]) {
		for (int i = 0; i < m.length; i++) {
			System.out.print("|");
			for (int j = 0; j < m[1].length; j++) {
				System.out.print("  " + m[i][j]);
			}
			System.out.print("  |");
			System.out.println();
		}
	}
	
	public static void printVetor(double v[]) {
		System.out.printf("[");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + ", ");
		}
		System.out.printf("]\n");
	}
	
	public static void main(String args[]) {
		
		double m[][] = {{1,1,1,1,1},
					    {2,2,3,4,5},
					    {3,2,3,4,5},
					    {4,2,3,4,5},
					    {5,2,3,4,5}};
		
		double lin[] = new double[m.length];
		double col[] = new double[m[1].length];
		double somaLin = 0;
		double somaCol = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[1].length; j++) {
				somaLin = somaLin + m[i][j];
				somaCol = somaCol + m[j][i];
			}
			lin[i] = somaLin;
			col[i] = somaCol;
		}
		
		System.out.printf("Matriz M:\n");
		printMatrix(m);
		System.out.printf("\nSL: ");
		printVetor(lin);
		System.out.printf("\nSc: ");
		printVetor(col);
		
	}

	
}
