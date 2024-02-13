package Sortering;

import java.util.Random;

public class Sortering_oppg_1 {
// tes
	private static <T extends Comparable<? super T>> void insertionSort(T[] tabell) {

		for (int i = 1; i < tabell.length; i++) {
			T temp = tabell[i];
			int j = i - 1;

			while (j >= 0 && tabell[j].compareTo(temp) < 0) {
				tabell[j + 1] = tabell[j];
				j = j - 1;
			}
			tabell[j + 1] = temp;
		}
	}

	private static <T extends Comparable<? super T>> void compare(T[] tabell, int indexS, int indexEnd) {
		System.out.println("index " + indexS + " sammenlignet med index " + indexEnd + " = "
				+ tabell[indexS].compareTo(tabell[indexEnd]));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random tilfeldig = new Random();
		
		Integer[] rTab = new Integer[80000];
		for (int i = 0; i < rTab.length; i++) {
			rTab[i]=tilfeldig.nextInt(10);
		}
		Integer[] iTab = { 2, 1, 4, 3 };
		String[] sTab = { "Apple", "Orange", "Banana", "Ananas", "Raspberry" };
		Boolean[] bTab = { true, false, false, false, true, true };


		long startTime = System.nanoTime();
		insertionSort(rTab);
		long endTime = System.nanoTime();
		long duration = ((endTime - startTime)/1_000_000); // 1_000_000_000 for sekunder.
		for (Integer i : rTab) {
			System.out.print(i + " - ");
		}
		System.out.println("\nKjoreTid i millisekunder = " + duration);

	}
}
