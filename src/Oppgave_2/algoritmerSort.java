package Oppgave_2;

import java.lang.reflect.Array;

public class algoritmerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] tab = { 2, 1, 5, 101, 3, 1, 7, 4, 9, 33, 20, 16, 100, 99, 102 };
		for (Integer i : tab) {
			System.out.print(i + "  ");
		}

		System.out.println("\n\n sort:");
		// insertionSort(tab);
		// selectionSort(tab);
		// quickSort(tab, 0, tab.length - 1);
		mergeSort(tab);

		for (Integer i : tab) {
			System.out.print(i + "  ");
		}

	}

	private static <T extends Comparable<? super T>> void insertionSort(T[] arr) {
		// 1: første element er sortert. Begynn i index 0+1. opprett variabel med index
		// smallest.
		// 2: gå igjennom tabellen og sjekk om elementene til venstre er mindre.
		// 3: er de mindre må de byttes.

		for (int i = 1; i < arr.length; i++) {
			int smallest = i;

			while (smallest > 0 && arr[smallest].compareTo(arr[smallest - 1]) < 1) {
				T temp = arr[smallest];
				arr[smallest] = arr[smallest - 1];
				arr[smallest - 1] = temp;

				smallest = smallest - 1;
			}
		}
	}

	private static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
		// step 1: start til venstre i tab. opprett smallest som index pos med minste
		// verdi.
		// step 2: gå igjennom tabellen og let etter mindre verdi. oppdater smallest
		// underveis.
		// step 3: erstatt minste med verdien i index step 1.

		for (int i = 0; i < arr.length; i++) {
			int smallest = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[smallest]) < 1) {
					smallest = j;
				}
			}
			T temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}

	}

	private static <T extends Comparable<? super T>> void quickSort(T[] arr, int start, int end) {

		if (end <= start) { // base.
			return;
		}
		int pivot = finnPivot(arr, start, end);
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);

	}

	private static <T extends Comparable<? super T>> int finnPivot(T[] arr, int start, int end) {

		T pivot = arr[end];
		int i = start - 1;

		for (int j = start; j <= end - 1; j++) {
			if (arr[j].compareTo(pivot) < 0) {
				i++;
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		T temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;

		return i;
	}

	private static <T extends Comparable<? super T>> void mergeSort(T[] arr) {

		int length = arr.length;
		if (length <= 1) { // base
			return;
		}

		int mid = length / 2;
		
		T[] leftArr = (T[]) new Comparable[mid];
		T[] rightArr = (T[]) new Comparable[length - mid];

		
		int i = 0;
		int j = 0;

		for (; i < length; i++) {
			if (i < mid) {
				leftArr[i] = arr[i];
			} else {
				rightArr[j] = arr[i];
				j++;
			}
		}
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr, rightArr, arr);
	}

	private static <T extends Comparable<? super T>> void merge(T[] leftArr, T[] rightArr, T[] arr) {

		int leftS = arr.length / 2;
		int rightS = arr.length - leftS;
		int i = 0, l = 0, r = 0;
		
		
		while (l < leftS && r < rightS) {
			if(leftArr[l].compareTo(rightArr[r])<0) {
				arr[i] = leftArr[l];
				i++;
				l++;
			}
			else {
				arr[i] = rightArr[r];
				i++;
				r++;
			}
		}
		while(l<leftS) {
			arr[i] = leftArr[l];
			i++;
			l++;
		}
		while(r<rightS) {
			arr[i]=rightArr[r];
			i++;
			r++;
		}
	}
}
