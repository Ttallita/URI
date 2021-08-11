package uri.iniciante.java;

import java.util.Scanner;

public class Cedulas_1018 {
    
    public static void main (String[] args){
		Scanner input = new Scanner(System.in);

        int cedulas[] = {100,50,20,10,5,2,1};
		int n = input.nextInt();
        
        System.out.println(n);

        for (int i = 0; i < cedulas.length; i++){
            System.out.printf("%d nota(s) de R$ %.2f\n", n/cedulas[i], (double)cedulas[i]);
            n %= cedulas[i];
        }

		input.close();
	}

}
