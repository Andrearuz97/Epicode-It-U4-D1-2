package it.epicode.be;



public class Helloworld {

    public static void main(String[] args) {
     

        // Esegui il metodo moltiplica
        int risultatoMoltiplicazione = moltiplica(5, 3);
        System.out.println("Il prodotto di 5 e 3 è: " + risultatoMoltiplicazione);

        // Esegui il metodo concatena
        String risultatoConcatenazione = concatena("Hello", 2023);
        System.out.println("Risultato della concatenazione: " + risultatoConcatenazione);

        // Esegui il metodo inserisciUnArray
        String[] arrayIniziale = {"Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5"};
        String nuovaStringa = "Nuova Stringa";
        String[] nuovoArray = inserisciUnArray(arrayIniziale, nuovaStringa);
        System.out.println("Nuovo array: ");
        for (String elemento : nuovoArray) {
            System.out.println(elemento);
        }
    }

    // Metodo per moltiplicare due numeri interi e restituire il prodotto
    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    // Metodo per concatenare una stringa e un intero e restituire la stringa risultante
    public static String concatena(String str, int num) {
        return str + num;
    }

    // Metodo per inserire una stringa in un array di stringhe
    public static String[] inserisciUnArray(String[] array, String nuovaStringa) {
        String[] nuovoArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                nuovoArray[i] = array[i];
                nuovoArray[i + 1] = nuovaStringa;
            }
            nuovoArray[i + 1] = array[i];
        }
        return nuovoArray;
    }
}
