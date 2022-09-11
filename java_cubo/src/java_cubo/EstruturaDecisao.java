package java_cubo;

import java.util.Scanner;

public class EstruturaDecisao {
	
	public static void main(String[] args) {
		EstruturaAninhada();
			
		}

	private static void EstruturaAninhada () {
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, media;
		int n;
		
		System.out.print("Entre com sua primeira nota: ");
		nota1 = sc.nextFloat();
		System.out.print("Entre com sua segunda nota: ");
		nota2 = sc.nextFloat();
		
		media = (nota1 + nota2) / 2;
		if (media == 10.0) {
			System.out.println("Parab�ns! Voc� foi aprovado com nota m�xima");
		}
		else if (media >= 7) {
			System.out.printf("Parab�ns! Voc� foi aprovado. M�dia: %.1f%n" , media);	
		}
		else if (media < 4){
			System.out.printf("Aten��o! Voc� foi reprovado. M�dia: %.1f%n" , media);
		}
		else {
			System.out.println("Aten��o! Voc� ficou de RECUPERA��O" );
		}
		
		System.out.println();
		
		System.out.print("Escolha um n�mero at� X: ");
        n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Voc� escolheu o n�mero 1");
			break;
		case 2:
			System.out.println("Voc� escolheu o n�mero 2");
			break;
		case 3:
			System.out.println("Voc� escolheu o n�mero 3");
			break;
		case 4:
			System.out.println("Voc� escolheu o n�mero 4");
			break;
		default: System.out.println("N�mero inv�lido");
			break;
		}
	
		sc.close();

		}
		
	}


