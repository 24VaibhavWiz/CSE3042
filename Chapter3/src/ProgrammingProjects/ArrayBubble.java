/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Bubble Sort
 */
package ProgrammingProjects;
import java.util.Scanner;

public class ArrayBubble {

	private int[] A;
	private int total;

	public ArrayBubble(int max) {
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

	public void doBubbleSort() {
		int out, in, ctr = 1;
		for(out = total - 1; out >= 1; out--) {
			for(in = 0; in < out; in++) {
				if(A[in] > A[in + 1]) {
					swap(in, in + 1);
					System.out.println("Change " + ctr);
					display();
					ctr++;
				}
			}
			for(in = out; in > 0; in--) {
				if(A[in] < A[in - 1]) {
					swap(in, in - 1);
					System.out.println("Reverse Change " + ctr);
					display();
					ctr++;
				}
			}
		}
	}
}