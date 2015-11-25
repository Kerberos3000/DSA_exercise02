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
		boolean swapFlag=true;
		// while(swapFlag) {
		for (int j = 0; j < list.size(); j++ )
		{
			swapFlag=false;
			for(int i=0; i < list.size()-1-j; i++) 
			{

				if (list.get(i).compareTo(list.get(i+1)) > 0) 
				{
					//next element is smaller as current element
					list.swap(i, i+1);
					swapFlag=true;
				}
			}
			if (!swapFlag) break; // finish earlier, because list is sorted !
		}
	}

	public static <T extends Comparable<T>> void shakerSort(ISimpleList<T> list) {
		boolean swapFlag=true;
		boolean bubbleUpwards=true;
		
		int ucount = 0;
		int vcount = 0;
		while(swapFlag) {
			swapFlag=false;
			if (bubbleUpwards == true) {
				for(int i=0; i < list.size()-1-ucount; i++){

					if (list.get(i).compareTo(list.get(i+1)) > 0) {
						//next element is smaller as current element
						list.swap(i, i+1);
						swapFlag=true;
					}
				}
				ucount++;
				bubbleUpwards=false;
			}
			else {
				for(int i=list.size()-1-vcount; i > 0; i--){

					if (list.get(i).compareTo(list.get(i-1)) < 0) {
						//next element is smaller as current element
						list.swap(i, i-1);
						swapFlag=true;
					}
				}
				vcount++;
				bubbleUpwards=true;
			}
		}
	}

}
