package com.cursoceat.menu;

import java.util.Scanner;

import com.cursoceat.main.Operaciones;


public class Menu{

	static public void miMenu() {

		int opcion;
		double numero1 = 0;
		double numero2 = 0;
		double valor;

		do {
			System.out.println("\t******************");
			System.out.println("\t    Calculadora   ");
			System.out.println("\t******************");
			System.out.println("\t1 Suma");
			System.out.println("\t2 Resta");
			System.out.println("\t3 Multiplicar");
			System.out.println("\t4 Dividir");
			System.out.println("\t5 Resto");
			System.out.println("\t6 Exponencial");
			System.out.println("\t7 Salir");
			System.out.println("\t******************");
			System.out.print("\n\tSu opcion es ->");
			opcion = new Scanner(System.in).nextInt();
			
			if (opcion!=7) {
				System.out.print("\tSu primer numero es ->");
				numero1 = new Scanner(System.in).nextDouble();
				System.out.print("\tSu segundo numero es ->");
				numero2 = new Scanner(System.in).nextDouble();
			}
				
			

			Operaciones operacion = new Operaciones();

			switch (opcion) {
			case 1 -> {
				valor = operacion.suma(numero1, numero2);
				System.out.println("La suma de " + numero1 + " + " + numero2+ " = " + valor);
			}
			case 2 -> {
				valor = operacion.resta(numero1, numero2);
				System.out.println("La resta de " + numero1 + " - " + numero2+ " = " + valor);
			}
			case 3 -> {
				valor = operacion.multiplicar(numero1, numero2);
				System.out.println("La multiplicacion de " + numero1 + " * " + numero2+ " = " + valor);
			}
			case 4 -> {
				valor = operacion.dividir(numero1, numero2);
				System.out.println("La division de " + numero1 + " / " + numero2+ " = " + valor);
			}
			case 5 -> {
				valor = operacion.resto(numero1, numero2);
				System.out.println("El resto de " + numero1 + " y " + numero2+ " = " + valor);
			}
			case 6 -> {
				valor = operacion.exponencial(numero1, numero2);
				System.out.println("La exponencial de " + numero1 + " ^ " + numero2+ " = " + valor);
			}
			default ->{
				System.out.println("\tHasta luego");
			}
			}

		} while (opcion != 7);
	}
}
