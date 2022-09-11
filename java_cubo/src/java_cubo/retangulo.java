package java_cubo;
import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double a, b, areaRetangulo; 
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		areaRetangulo = a * b;
		
		System.out.printf("RETANGULO: %.3f%n" , areaRetangulo);
		
		sc.close();
	}

}
