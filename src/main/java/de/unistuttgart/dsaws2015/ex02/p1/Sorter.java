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
	public static <T extends Comparable<T>> void heapSort(ISimpleList<T> list) {
		// see lecture notes 08, page 40
		int i;
		//create heap
		for (i = list.size()/2; i>=0; i--){
			sift(list,i,list.size());
		}
		
		// heapsort
		for (i = list.size()-1; i>0; i--) {
			//swap last element with the first
			list.swap(0, i);
			//create heap with length i from element 0
			sift(list,0,i);
			
		}
		
		
		}
	private static <T extends Comparable<T>> void sift(ISimpleList<T> list, int idx, int size) {
		int parent = idx,child;
		while ((2*parent)+1 < size) {
			child = (2*parent)+1;	// set left child as biggest child

			//compare both children
			if ((child+1) < size) { //list[i] has right child as well
				if (list.get(child).compareTo(list.get(child+1)) < 0) {
					child++; //set right child as biggest child
				}	
			}
			//compare biggest child with parent
			if (list.get(parent).compareTo(list.get(child)) < 0){
				list.swap(parent, child); 
				parent=child;
			}
			else {
				break;
			}
		}
	}
}	



