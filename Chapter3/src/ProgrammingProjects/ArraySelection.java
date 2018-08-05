/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Selection Sort
 */
package ProgrammingProjects;

public class ArraySelection {

	private int[] A;
	private int total;
	
	public ArraySelection(int max) {
		A = new int[max];
		total = 0;
	}
	
	public void insert(int val) {
		A[total] = val;
		total++;
	}
	
	public void display() {
		for(int i = 0; i < total; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("");
	}
	
	public void swap(int one, int two) {
		int temp = A[one];
		A[one] = A[two];
		A[two] = temp;
	}
	
	public void doSelectionSort() {
		int out, in, min;
		for(out = 0; out < total - 1; out++) {
			min = out;
			for(in = out + 1; in < total; in++)
				if(A[in] < A[min] )
					min = in;
				swap(out, min);
		}
	}

}

