package br.com.estrutura_condicional;

import java.util.Scanner;

public class Condicional_3 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int A = sc.nextInt();
       int B = sc.nextInt();
       
       if ((A % 2 == 0) && (B % 2 == 0)) {
    	   System.out.println("S�o m�ltiplos"); 
       }
       
       else {
    	   System.out.println("N�o s�o m�ltiplos");
       }
       
       sc.close();
	}

}
