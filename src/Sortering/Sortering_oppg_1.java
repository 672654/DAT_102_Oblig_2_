package Sortering;

import java.util.Random;

public class Sortering_oppg_1 {

	private static <T extends Comparable<? super T>> void insertionSort(T[] tabell) {
		int j;
		for (int i = 1; i < tabell.length; i++) {
			T temp = tabell[i];
			
			j = i-1;

			while (j >= 0 && tabell[j].compareTo(temp) > 0) {
				tabell[j + 1] = tabell[j];
				j = j - 1;
			}
			tabell[j+1] = temp;
		}
	}
	
	private static <T extends Comparable<? super T>> void insertionSort2(T[] tabell) {
		
		for (int i = 1; i<tabell.length; i++) {
			T temp = tabell[i];
			int j = i;
			
			while (j > 0 && tabell[j-1].compareTo(temp) > 0) {
				tabell[j] = tabell[j-1];
				j = j - 1;
			}
			tabell[j] = temp;
		}
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random tilfeldig = new Random();
		
		
		Integer[] rTab = new Integer[10];
		for (int i = 0; i < rTab.length; i++) {
			rTab[i] = tilfeldig.nextInt(0,10);
		}
		Integer[]rTab2 = rTab;

		
		System.out.println("Usortert tabell:");
		for(Integer i: rTab) {
			System.out.print(i+" - ");
		}
		System.out.println("\n");

		
		long startTime = System.nanoTime();
		insertionSort(rTab);
		long endTime = System.nanoTime();
		long duration = ((endTime - startTime));//1_000_000); // 1_000_000_000 for sekunder.
		
		long startTime2 = System.nanoTime();
		insertionSort2(rTab2);
		long endTime2 = System.nanoTime();
		long duration2 = ((endTime2 - startTime2));
		
		
		for (Integer i : rTab) {
			System.out.print(i + " - ");
		}
		System.out.println("\n1: KjoreTid i millisekunder = " + duration+"\n");
		
		
		for (Integer i : rTab2) {
			System.out.print(i + " - ");
		}
		System.out.println("\n2: KjoreTid i millisekunder = " + duration2);

	}
}
