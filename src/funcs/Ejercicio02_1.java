package funcs;

import java.util.Arrays;

public class Ejercicio02_1 {

	public static void main(String[] args) {
		int t[] = {1, 2, 49, 10, 23, 2};
		
		int mostrar = maximo(t);
		
		System.out.println(mostrar);
	}
	
	public static int maximo (int t[]) {
		
		Arrays.sort(t);
		
		int nummax = t[t.length-1];
		return nummax;
		
	}

}
