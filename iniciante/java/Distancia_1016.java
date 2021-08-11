package uri.iniciante.java;

import java.util.Scanner;

public class Distancia_1016 {

	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		int km = input.nextInt();
		
		System.out.printf( ((60 * km) / 30) + " minutos\n");

		input.close();
	}

}
