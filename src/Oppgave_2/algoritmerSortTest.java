package Oppgave_2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class algoritmerSortTest {

	Integer[] tab;
	Integer[] sortertTab;
	
	@BeforeEach
	void setUp() throws Exception {
		Integer[] tabell = {5,2,7,3,9};
		this.tab = tabell;
		Integer[] sortert = {2,3,5,7,9};
		this.sortertTab = sortert;
	}

	@Test
	void testInsertionSort() {
		algoritmerSort.insertionSort(tab);
		assertEquals(tab[tab.length-1],9);
	}

	@Test
	void testSelectionSort() {
		fail("Not yet implemented");
	}

	@Test
	void testQuickSort() {
		fail("Not yet implemented");
	}

	@Test
	void testMergeSort() {
		fail("Not yet implemented");
	}

}
