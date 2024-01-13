package Caso3;

import java.util.Scanner;

public class Ej_Caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Alumno1:
		Scanner in = new Scanner(System.in);
		// CASO TRIÁNGULO N
		double base = 0;
		double altura = 0;
		System.out.println("CASO TRIÁNGULO");
		System.out.println("Introduce la altura");
		altura = in.nextDouble();
		System.out.println("Introduce la base: ");
		base = in.nextDouble();
		System.out.println("El área del triángulo es: " + calcularAreaTriangulo(base, altura));
		System.out.println("\n");
		
		//Alumno2:
		//
		
		
		
	}
	
	//CASO TRIANGULO N
	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	//

}
