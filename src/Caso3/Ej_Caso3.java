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
		//CASO CIRCUNFERENCIA L
		System.out.println("CASO CIRCUNFERENCIA");
		double radio = 0;
		System.out.println("Introduce el radio: ");
		radio = in.nextDouble();
		// Calcular el área y el perímetro
		System.out.println("El área de la circunferencia es: " + calcularAreaCircunferencia(radio));
		System.out.println("El perímetro de la circunferencia es: " + calcularPerimetroCircunferencia(radio));
		System.out.println("\n");
		
		//Alumno1:
		//
		
	}
	
	//CASO TRIANGULO N
	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	//CASO CIRCUNFERENCIA L
	public static double calcularAreaCircunferencia(double radio) {
		return 3.14 * radio * radio;

	}
	public static double calcularPerimetroCircunferencia(double radio) {
		return 2 * 3.14 * radio;
	}
	//


}
