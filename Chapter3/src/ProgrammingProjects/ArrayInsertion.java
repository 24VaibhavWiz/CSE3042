/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Insertion Sort
 */
package ProgrammingProjects;

public class ArrayInsertion {

	private int[] A;
	private int nElems;
	private boolean sorted = false;

	public ArrayInsertion(int max) {
		A = new int[max];
		nElems = 0;
	}

	public void insert(int val) {
		A[nElems] = val;
		nElems++;
	}

	public void display() {
		for(int i = 0; i < nElems; i++) {
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

		if(nElems % 2 == 0) {
			medianValue = (A[nElems / 2 - 1] + A[(nElems / 2) + 1 - 1]) / 2;
		} else {
			medianValue = A[(nElems + 1) / 2 - 1];
		}

		return medianValue;
	}

	public void noDups() {
		int totalTemp = nElems;
		int shiftAmount = 0;
		int curNum = 0;
		for(int index = 0; index < totalTemp; index++) {
			if(A[index] == curNum) {
				shiftAmount++;
				nElems--;
			}
			else {
				curNum = A[index];
				A[index - shiftAmount] = A[index];
			}
		}
	}

	public void doInsertionSort() {
		int in, out;
		int copies = 0, comparisons = 0;
		
		for(out = 1; out < nElems; out++) {
			int temp = A[out];
			copies++;
			in = out;
			while(in > 0 && A[in - 1] >= temp) {
				A[in] = A[in - 1];
				copies++;
				if(in == 1)
					comparisons++;
				comparisons++;
				in--;
			}
			A[in] = temp;
			copies++;
		}
		
		System.out.println("\nNo of Comparisons - " + comparisons);
		System.out.println("\nNo if Copies - " + copies);
	}

	public void doinsertionSortWithDupsRemoval() {
		int in , out;
		int numDups = 0;
		for (out = 1; out < nElems; out++) {
			int temp = A[out];
			in = out;
			while (in > 0 && A[in - 1] >= temp) {
				if (A[in - 1] == temp && temp > -1) {
					temp = -1;
					numDups++;
				}
				A[in] = A[in -1];
				in --;
			}
			A[in] = temp;
		}

		display();
		System.out.println("\nNumber of duplicates - " + numDups);

		int totalElems = nElems - numDups;
		for (int i = 0; i < totalElems; i++) {
			A[i] = A[i + numDups];
		}
		nElems -= numDups;
		System.out.println("After removing duplicates - ");
		display();
	}

}

