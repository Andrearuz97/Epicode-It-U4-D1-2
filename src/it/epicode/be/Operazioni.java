package it.epicode.be;

public class Operazioni{

	public static void main(String[] args) {

		// Esegui il metodo moltiplica
		int risultatoMoltiplicazione = moltiplica(5, 3);
		System.out.println("Il prodotto di 5 e 3 è: " + risultatoMoltiplicazione);

		// Esegui il metodo concatena
		String risultatoConcatenazione = concatena("Hello", 2023);
		System.out.println("Risultato della concatenazione: " + risultatoConcatenazione);

		int divisione = dividi(10, 3);
		System.out.println("Il risultato della divisione è: " + divisione);

	}

	// Metodo per moltiplicare due numeri interi e restituire il prodotto
	public static int moltiplica(int num1, int num2) {
		return num1 * num2;
	}

	// Metodo per concatenare una stringa e un intero e restituire la stringa
	// risultante
	public static String concatena(String str, int num) {
		return str + num;
	}

	public static int dividi(int div1, int div2) {
		return div1 / div2;
	}

}