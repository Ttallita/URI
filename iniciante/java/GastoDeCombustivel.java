package uri.iniciante.java;

import java.util.Scanner;

public class GastoDeCombustivel {
    
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		double horas = input.nextInt();
		double velocidadeMedia = input.nextInt();

		System.out.printf("%.3f\n", (horas * velocidadeMedia)/12 );

		input.close();
	}
}
