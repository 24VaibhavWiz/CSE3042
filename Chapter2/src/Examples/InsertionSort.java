/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Insertion Sort
 */
package Examples;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String args[]) {
		int max, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter max - ");
		max = sc.nextInt();
		
		ArrayInsertion arrayInsertion = new ArrayInsertion(max);
		
		System.out.println("\nEnter values");
		for(int i = 0; i < max; i++) {
			System.out.println("\nEnter value for pos " + i);
			temp = sc.nextInt();
			arrayInsertion.insert(temp);
		}
		
		arrayInsertion.display();
		arrayInsertion.doInsertionSort();
		arrayInsertion.display();
	}
}

class ArrayInsertion {

	private int[] A;
	private int total;
	
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
	
	public void doInsertionSort() {
		int in, out;
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

