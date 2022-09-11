package br.com.estrutura_repeticao_for;

import java.util.Scanner;

public class In_Out {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x, in = 0, out = 0;
	
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			x = sc.nextInt();
			 if (x >= 10 && x <= 20) {
				 in = in + 1;	 
			 }
			 else {
				 out = out + 1;
			 }
			 
		}
		
		System.out.println(in + " in"); 
		System.out.println(out + " out"); 
		
		sc.close();
		
	}
}
