package de.unistuttgart.dsaws2015.ex02.p1;

public class Sorter {
	
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
		int p = 0;
		int indexSmallestElement;

		while(p < list.size()) {
			indexSmallestElement = p;
			for (int i=p+1; i < list.size(); i++){

				if (list.get(i).compareTo(list.get(indexSmallestElement)) <0) {
					//next element is smaller as current element
					indexSmallestElement=i;
				}
			}
			list.swap(p, indexSmallestElement);
			p++;
		}
	}

	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
		// TODO
	}

	public static <T extends Comparable<T>> void shakerSort(ISimpleList<T> list) {
		// TODO
	}

}
