package br.com.estrutura_sequencial;

import java.util.Scanner;

public class sequencial_4 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int numeroFuncionario = sc.nextInt();
	    int horasTrabalhadas  = sc.nextInt();
	    float valorHora       = sc.nextFloat();
	    float salario         = horasTrabalhadas * valorHora;
	    
	    System.out.println("Numero Funcionario = " + numeroFuncionario);
	    System.out.printf("Salario = %.2f%n" , salario);
	    
	    sc.close();
			
		}

}
