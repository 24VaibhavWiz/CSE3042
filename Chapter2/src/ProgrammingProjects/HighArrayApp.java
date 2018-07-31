/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: High Array App
 */
package ProgrammingProjects;
import java.lang.Math;

public class HighArrayApp {

	public static void main(String[] args) {
		int max = 20;
		HighArray arrayA = new HighArray(max);

		arrayA.insert(77);
		arrayA.insert(99);
		arrayA.insert(44);
		arrayA.insert(55);
		arrayA.insert(22);
		arrayA.insert(88);
		arrayA.insert(11);
		arrayA.insert(00);
		arrayA.insert(66);
		arrayA.insert(33);

		System.out.println("Original array - ");
		arrayA.display();
		System.out.println("\nMax value removed - " + arrayA.removeMax());
		arrayA.display();

		System.out.println("\nArray sorted backwards - ");

		int length = arrayA.getNumElems();
		HighArray arrayB = new HighArray(max);

		for(int j = 0; j < length; j++) {
			long item = arrayA.removeMax();
			arrayB.insert(item);
		}
		arrayB.display();

		HighArray arrayC = new HighArray(max * 2);

		for(int i = 0; i < ((max * 2) - 3); i++) {
			long random = (long) (Math.random() * 200);
			arrayC.insert(random);
		}

		arrayC.insert(90);
		arrayC.insert(90);
		arrayC.insert(90);

		System.out.println("\nNew array - ");
		arrayC.display();
		arrayC.noDups();
		System.out.println("\nAfter removing duplicates - ");
		arrayC.display();
	}
}

class HighArray {

	private long[] a;
	private int nElems;

	public HighArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	public int getNumElems() {
		return nElems;
	}

	public boolean find(long searchKey) {
		int j;
		for(j = 0; j < nElems; j++) {
			if(a[j] == searchKey)
				break;
		}
		if(j == nElems)
			return false;
		else
			return true;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public long delete(long value) {
		int j;

		for(j = 0; j < nElems; j++) {
			if(a[j] == value)
				break;
		}

		if(j == nElems)
			return 0;
		else {
			int k;
			for(k = j; k < (nElems - 1); k++) {
				a[k] = a[k + 1];
			}
			nElems--;
			return value;
		}
	}

	public long getMax() {
		int j;
		long biggest = -1;

		if(nElems == 0)
			return biggest;
		else {
			for(j = 0; j < nElems; j++) {
				if(a[j] > biggest) 
					biggest = a[j];
			}
			return biggest;
		}
	}

	public long removeMax() {
		int j;
		long biggest = -1;

		if(nElems == 0)
			return biggest;
		else {
			for(j = 0; j < nElems; j++) {
				if(a[j] > biggest) biggest = a[j];
			}
			delete(biggest);
			return biggest;
		}
	}

	public void noDups() {
		int size = nElems - 1;
		long value = 0;

		for(int i = 0; i <= size; i++) {
			value = a[i];
			for(int j = i + 1; j <= size; j++) {
				if(a[j] == value) {
					for(int k = j; k < size; k++) {
						a[k] = a[k + 1];
					}
					nElems--;
					j--;
					size--;
					System.out.println("Deleted element - " + value);
				}
			}
		}
	}

	public void display() {
		for(int j = 0; j < nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("");
	}
}