package br.com.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class sequencial_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double a, b, c, pi = 3.14159, areaTriangulo,
		areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo; 
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTriangulo = a * c / 2;
		areaCirculo   = pi * Math.pow(c, 2.0);
		areaTrapezio  = (a + b) * c / 2.0;
		areaQuadrado  = b * b;
		areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n" , areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n" , areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n" , areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n" , areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n" , areaRetangulo);
		
		sc.close();
	}

}
