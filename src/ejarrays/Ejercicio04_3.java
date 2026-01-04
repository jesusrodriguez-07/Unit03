package ejarrays;

public class Ejercicio04_3 {

	public static void main(String[] args) {
		int tablas[][] = new int [11][11];
		
		for (int i = 1; i < tablas.length;i++) {
			for ( int j = 1; j < tablas[0].length;j++) {
				tablas[i][j] = i*j;
			}
		}
		
		for (int i = 1; i < tablas.length; i++) {
			for (int j = 1; j < tablas[0].length;j++) {
				System.out.print(j + "x" + i + "=" + tablas[i][j] + "\t");	
			}
			System.out.println();
		}

	}

}
