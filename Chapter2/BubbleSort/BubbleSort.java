/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Bubble Sort
 */
import java.util.Scanner;

public class BubbleSort {

	public static void main(String args[]) {
		int max, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter max - ");
		max = sc.nextInt();
		
		ArrayBubble arrayBubble = new ArrayBubble(max);
		
		System.out.println("\nEnter values");
		for(int i = 0; i < max; i++) {
			System.out.println("\nEnter value for pos " + i);
			temp = sc.nextInt();
			arrayBubble.insert(temp);
		}
		
		System.out.println("\nOriginal -");
		arrayBubble.display();
		System.out.println("\n");
		arrayBubble.doBubbleSort();
		System.out.println("\nSorted -");
		arrayBubble.display();
	}
}

class ArrayBubble {

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
		}
	}

}

