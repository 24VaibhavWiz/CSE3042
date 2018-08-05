/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Bubble Sort
 */
package ProgrammingProjects;

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

	public void oddEvenSort() {
		int out, in;
		int i;
		int nInPasses = total / 2;
		for (out = total - 1; out > 1; out--) {
			for (i = 0; i < nInPasses; i++) {
				for (in = 0; in < out; in += 2) // even loop
					if (A[in] > A[in + 1])
						swap(in, in + 1);
				for (in = 1; in < out; in += 2) // odd loop
					if (A[in] > A[ in +1])
						swap( in , in +1);
			}
		}
	}

	public void doBubbleSort() {
		int out, in;
		for(out = total - 1; out > 1; out--)
			for(in = 0; in < out; in++)
				if(A[in] > A[in+1])
					swap(in, in+1);
	}

	public void doBidirectionalBubbleSortTest() {
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

	public void doBidirectionalBubbleSort() {
		int outBottom, outTop, in;
		outBottom = 0;
		outTop = total - 1;
		while(outBottom < outTop) {
			for(in = outBottom; in < outTop; in++) {
				if(A[in] > A[in + 1])
					swap(in, in+1);
			}
			outTop--;
			for(in = outTop; in > outBottom; in--) {
				if(A[in - 1] > A[in])
					swap(in, in-1);
			}
			outBottom++;
		}
	}
}