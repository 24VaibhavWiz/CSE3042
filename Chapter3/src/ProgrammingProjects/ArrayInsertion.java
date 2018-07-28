/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Insertion Sort
 */
package ProgrammingProjects;
import java.util.Scanner;

public class ArrayInsertion {

	private int[] A;
	private int total;
	private boolean sorted = false;

	public ArrayInsertion(int max) {
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

	public int median() {
		int medianValue;

		if(!sorted) {
			doInsertionSort();
		}

		if(total % 2 == 0) {
			medianValue = (A[total / 2 - 1] + A[(total / 2) + 1 - 1]) / 2;
		} else {
			medianValue = A[(total + 1) / 2 - 1];
		}

		return medianValue;
	}
	
	public void noDups() {
		if(!sorted) {
			doInsertionSort();
		}
		// TODO : remove duplicates code
	}

	public void doInsertionSort() {
		int in, out;
		sorted = true;
		for(out = 1; out < total; out++) {
			int temp = A[out];
			in = out;
			while(in > 0 && A[in - 1] >= temp) {
				A[in] = A[in - 1];
				in--;
			}
			A[in] = temp;
		}
	}

}

