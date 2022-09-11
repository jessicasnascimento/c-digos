package com.br.mediajess;
import java.util.Scanner;

public class mediaAluno {
	
	public static void main(String[] args) {
		processarNota(); }
	
	private static void processarNota() {
		
    Scanner sc = new Scanner(System.in);	
    
    System.out.print("Digite a nota1: "); 
	float nota1 = sc.nextFloat();
	System.out.print("Digite a nota2: "); 
	float nota2 = sc.nextFloat();
	System.out.print("Digite a nota3: ");
	float nota3 = sc.nextFloat();
	System.out.print("Digite a nota4: "); 
	float nota4 = sc.nextFloat(); 
	
    float mediaGeral = (nota1 + nota2 + nota3 + nota4) / 4;
    
    if (mediaGeral >= 7) { System.out.printf("Aprovado: %.2f" , mediaGeral); }  
    else { System.out.printf("Reprovado: %.2f" , mediaGeral); }
    
	sc.close();	
	}
}
