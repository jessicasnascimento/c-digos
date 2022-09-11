package java_cubo;

import java.util.Scanner;

public class salario {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Nome Funcionário: ");
	    String nome = sc.next();
	    System.out.println("Salário Atual: ");
	    float salarioAtual    = sc.nextFloat();
	    System.out.println("Porcentual de reajuste: " );
	    float reajuste        = sc.nextFloat();
	    float salarioNovo     = salarioAtual + (salarioAtual * reajuste / 100);
	    
	    System.out.println("Nome Funcionario : " + nome);
	    System.out.printf("Salario Atual : %.2f%n" , salarioNovo);
	    	    
	    sc.close();
			
		}
}
