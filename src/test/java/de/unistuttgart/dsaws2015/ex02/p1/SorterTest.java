package de.unistuttgart.dsaws2015.ex02.p1;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;



public class SorterTest {

public static final int LIST_SIZE = 25;	

	@Test
	public void testSorter() {
		SimpleList<Integer> list = new SimpleList<Integer>();
	
		//generate random list
		Random randomGenerator = new Random();
		for (int idx = 0; idx < LIST_SIZE; idx++){
		      list.append(randomGenerator.nextInt(100));
		}
	
		System.out.print("print random list:\n");
		list.printList();

		Sorter.selectionSort(list);
		System.out.print("print sorted list:\n");
		list.printList();
		
		//check if list is sorted
		for (int i = 0; i<list.size()-1; i++) {
			if(list.get(i).compareTo(list.get(i+1))<=0) {
				assertTrue(true);
			}
			else {
				System.out.print("list["+(i+1)+"] = "+list.get(i+1)+" < list["+i+"] = "+list.get(i));
				assertTrue(false);
			}
		}
		
	}

}
