package br.com.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Condicional_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
	    double x = sc.nextDouble();
	    
	    if (x < 0) {System.out.println("Fora do intervalo");
	    }
	    else if (x <= 25) {
	    	System.out.println("Intervalo [0,25]");	
	    }
	    else if (x <= 50) {
	    	System.out.println("Intervalo (25,50]");
	    }
	    else if (x <= 100){
	    	System.out.println("Intervalo (75,100]");	
	    }
	    	    
		sc.close();
	}

}
