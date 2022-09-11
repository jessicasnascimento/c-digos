package java_cubo;

import java.util.Scanner;

public class EstruturaDecisaoAtividade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, idade;
		
		System.out.print("Digite um valor e verifique se é par ou ímpar: ");
		n1 = sc.nextInt();
		if (n1 % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
		
		System.out.println();
		
		System.out.print("Digite dois valores e verifique qual é maior: ");
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		if (n2 > n3) {
			System.out.println(n2 + " > " + n3);
		}
		else if (n3 > n2) {
			System.out.println(n3 + " > " + n2);
		}
		else {
			System.out.println("Iguais");
		}
		
		System.out.println();
		
		System.out.println("Digite sua idade e verifique a faixa etária: ");
		idade = sc.nextInt();
		if (idade < 5 || idade > 25) {
			System.out.println("Idade fora da faixa etária");
		}
		else if (idade <= 7) {
			System.out.println("Infantil A = 5 a 7 anos");
		}
		else if (idade <= 10) {
			System.out.println("Infantil B = 8 a 10 anos");	
		}
		else if (idade <= 13 ) {
			System.out.println("Juvenil A = 11 a 13 anos");	
		}
		else if (idade <= 17) {
			System.out.println("Juvenil B = 14 a 17 anos");	
		}
		else if (idade <= 25) {
			System.out.println("Aduto = 18 a 25 anos");		
		}
		
		sc.close();

	}

}
