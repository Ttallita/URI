package uri.iniciante.java;

import java.util.Scanner;

public class Esfera_1011{
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		double pi = 3.14159d;
		double r = input.nextDouble();

		System.out.printf("VOLUME = %.3f\n", ((4./3.) * pi * (r * r * r)) );

		input.close();
	}
	
}