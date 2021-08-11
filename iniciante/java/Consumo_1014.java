package uri.iniciante.java;

import java.util.Scanner;

public class Consumo_1014 {
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		double km = input.nextDouble();
		double litros = input.nextDouble();

		System.out.printf("%.3f km/l\n", km/litros );

		input.close();
	}
	
}