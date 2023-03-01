package com.cursoceat.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Bombilla salon = new Bombilla();
		Bombilla room1 = new Bombilla();
		Bombilla room2 = new Bombilla();
		Bombilla cocina = new Bombilla();
		Bombilla banho = new Bombilla();
		Bombilla terraza = new Bombilla();
		int opcion;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Motrar el estado de la iluminación en la habitación...\n");
			System.out.println("\t1. Salón");
			System.out.println("\t2. Cocina");
			System.out.println("\t3. Baño");
			System.out.println("\t4. Habitación principal");
			System.out.println("\t5. Habitación auxiliar");
			System.out.println("\t6. Terraza");
			System.out.println("\t7. Interruptor general");
			System.out.println("\t8. Salir");
			System.out.print("Indique la estancia: ");
			opcion = input.nextInt();
			
			switch (opcion) {
			case 1 -> {
				System.out.println("\nEl salón está " + salon.mostrarEstado()+ "\n");
				System.out.println("¿Desea modificar la iluminación? (1. Si / 2. No)");
				int modificar = input.nextInt();
				if (modificar == 1) {
					salon.encenderApagar(!salon.estadoIndividual());
					System.out.println("\nEl salón ahora está " + salon.mostrarEstado()+ "\n");
				}
			}
			case 2 -> {
				System.out.println("\nLa cocina está " + cocina.mostrarEstado()+ "\n");
				System.out.println("¿Desea modificar la iluminación? (1. Si / 2. No)");
				int modificar = input.nextInt();
				if (modificar == 1) {
					cocina.encenderApagar(!cocina.estadoIndividual());
					System.out.println("\nLa cocina ahora está " + cocina.mostrarEstado()+ "\n");
				}
			}
			case 3 -> {
				System.out.println("\nEl baño está " + banho.mostrarEstado()+ "\n");
				System.out.println("¿Desea modificar la iluminación? (1. Si / 2. No)");
				int modificar = input.nextInt();
				if (modificar == 1) {
					banho.encenderApagar(!banho.estadoIndividual());
					System.out.println("\nEl baño ahora está " + banho.mostrarEstado()+ "\n");
				}
			}
			case 4 -> {
				System.out.println("\nLa habitación principal está " + room1.mostrarEstado()+ "\n");
				System.out.println("¿Desea modificar la iluminación? (1. Si / 2. No)");
				int modificar = input.nextInt();
				if (modificar == 1) {
					room1.encenderApagar(!room1.estadoIndividual());
					System.out.println("\nLa habitación principal ahora está " + room1.mostrarEstado()+ "\n");
				}
			}
			case 5 -> {
				System.out.println("\nLa habitación auxiliar está " + room2.mostrarEstado()+ "\n");
				System.out.println("¿Desea modificar la iluminación? (1. Si / 2. No)");
				int modificar = input.nextInt();
				if (modificar == 1) {
					room2.encenderApagar(!room2.estadoIndividual());
					System.out.println("\nLa habitación auxiliar ahora está " + room2.mostrarEstado()+ "\n");
				}
			}
			case 6 -> {
				System.out.println("\nLa terraza está " + terraza.mostrarEstado()+ "\n");
				System.out.println("¿Desea modificar la iluminación? (1. Si / 2. No)");
				int modificar = input.nextInt();
				if (modificar == 1) {
					terraza.encenderApagar(!terraza.estadoIndividual());
					System.out.println("\nLa terraza ahora está " + terraza.mostrarEstado()+ "\n");
				}
			}
			case 7 -> {
				System.out.print("El interruptor general está ");
				if (Bombilla.interruptorGeneral)
					System.out.println("encendido\n");
				else 
					System.out.println("apagado\n");
				System.out.println("¿Desea modificar su estado? (1. Si / 2. No)");
				int modificar = input.nextInt();
				if (modificar == 1)
					Bombilla.interruptorGeneral = !Bombilla.interruptorGeneral;
				System.out.print("El interruptor general ahora está ");
				if (Bombilla.interruptorGeneral)
					System.out.println("encendido\n");
				else 
					System.out.println("apagado\n");
				
			}
			}
			
			
			
			
		} while (opcion != 8);
		
		input.close();
	}
	
	

}
