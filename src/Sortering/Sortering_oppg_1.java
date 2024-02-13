package Sortering;

public class Sortering_oppg_1 {
// tes
	private static <T extends Comparable<? super T>> void insertSort(T[] tabell) {

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
		System.out.println("index "+indexS+" sammenlignet med index "+indexEnd+" = "+tabell[indexS].compareTo(tabell[indexEnd]));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		Integer[] iTab = {2,1,4,3};
		String[] sTab = { "Apple", "Orange", "Banana", "Ananas", "Raspberry" };
		Boolean[] bTab = {true, false, false, false, true, true};
	
		long startTime = System.nanoTime();
		insertSort(iTab);
		long endTime = System.nanoTime();
		long duration = ((endTime - startTime));// /1000000

		insertSort(sTab);
		insertSort(bTab);
		
		for (Integer i : iTab) {
			System.out.print(i+" ");
		}
		System.out.println("\nKjoreTid = "+duration);
		
		System.out.println("\n");
		for (String i : sTab) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n");
		for (Boolean i : bTab) {
			System.out.print(i + " ");
		}
		
	}
}
