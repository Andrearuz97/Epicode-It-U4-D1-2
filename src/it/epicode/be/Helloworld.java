package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// prints the phrase in console 
		System.out.println("This is my first Epicode Java Project!");
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("come ti chiami?");
			String nome = scanner.nextLine();
			System.out.println("Il tuo cognome?");
			String cognome = scanner.nextLine();
			System.out.println("La tua età");
			int eta = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Dove sei nato?");
			String città = scanner.nextLine();
			System.out.println(
					"Il tuo nome è " + nome + " " + cognome + " " + "e hai la bellezza di " + eta + " "
							+ "anni e sei nato a " + città);

			scanner.close();
		}
	}


