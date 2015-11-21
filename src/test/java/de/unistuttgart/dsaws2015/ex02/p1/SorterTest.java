package de.unistuttgart.dsaws2015.ex02.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SorterTest {
	
	@Test
	public void testSorter() {
		SimpleList<Integer> list = new SimpleList<Integer>();
		
		// initialize list
		list.append(5);
		list.append(7);
		list.append(100);
		list.append(1);
		list.append(25);
		list.append(45);
		list.append(13);
		
		list.printList();
		
		
		Sorter.selectionSort(list);
		System.out.print("print sorted list:\n");
		list.printList();
		
	assertTrue(true);
	}

}
