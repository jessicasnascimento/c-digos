package br.com.exercicios;

import java.util.Scanner;

public class Numero10 {

	/* 10) Crie um algoritmo leia um n�mero do usu�rio e exiba a sua tabuada de 
multiplica��o. */
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int numero;
      
      System.out.println("Informar um n�mero: ");
      numero = sc.nextInt();

      int multiplicador = 0;
      
      while(multiplicador <= 10){
      int resultado = numero * multiplicador;
      
      System.out.println(numero + " * " + multiplicador + " = " + resultado);
      
      multiplicador++;
      

      sc.close();

	}
  }
}
