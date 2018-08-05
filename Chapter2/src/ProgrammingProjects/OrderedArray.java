/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Ordered Array App
 */
package ProgrammingProjects;

public class OrderedArray {

	public static void main(String[] args) {
		int maxSize = 100;
		OrdArray arrA = new OrdArray(maxSize);
		OrdArray arrB = new OrdArray(maxSize);

		arrA.insert(77);
		arrA.insert(99);
		arrA.insert(44);
		arrA.insert(55);
		arrA.insert(22);
		arrA.insert(88);
		arrA.insert(11);
		arrA.insert(00);
		arrA.insert(66);
		arrA.insert(33);

		arrB.insert(23);
		arrB.insert(67);
		arrB.insert(230);
		arrB.insert(7745);
		arrB.insert(222);
		arrB.insert(8100);

		System.out.println("\nArray 1 - ");
		arrA.display();
		System.out.println("\nArray 2 - ");
		arrB.display();

		OrdArray arrC = OrdArray.merge(arrA, arrB);
		System.out.println("\nArray 3 - ");
		arrC.display();
	}

}

class OrdArray {
	private long[] a;
	private int nElems;

	public OrdArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	public int size() { 
		return nElems; 
	}

	public long getValueAtPos(int index) {
		return a[index];
	}

	public void setValueAtPos(int index, long value) {
		a[index] = value;
	}

	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		while(true) {
			curIn = (lowerBound + upperBound ) / 2;
			if(a[curIn] == searchKey)
				return curIn;
			else if(lowerBound > upperBound)
				return nElems;
			else {
				if(a[curIn] < searchKey)
					lowerBound = curIn + 1;
				else
					upperBound = curIn - 1;
			}
		}
	}

	public void insert(long value) {
		int j;
		for(j = 0; j < nElems; j++)
			if(a[j] > value)
				break;
		for(int k = nElems; k > j; k--)
			a[k] = a[k-1];
		a[j] = value;
		nElems++;
	}

	public boolean delete(long value) {
		int j = find(value);
		if(j == nElems)
			return false;
		else {
			for(int k=j; k<nElems; k++)
				a[k] = a[k+1];
			nElems--;
			return true;
		}
	}

	public static OrdArray merge(OrdArray arrayA, OrdArray arrayB) {
		int length = arrayA.size() + arrayB.size();
		OrdArray arrayC = new OrdArray(length * 2);
		int i = 0, j = 0, k = 0;

		while(j < arrayA.size() && k < arrayB.size()) {
			if(arrayA.getValueAtPos(j) <= arrayB.getValueAtPos(k)) {
				arrayC.setValueAtPos(i, arrayA.getValueAtPos(j));
				j++;
			} else {
				arrayC.setValueAtPos(i, arrayB.getValueAtPos(k));
				k++;
			}
			arrayC.nElems++;
			i++;
		}

		while(j < arrayA.size()) {
			arrayC.setValueAtPos(i, arrayA.getValueAtPos(j));
			arrayC.nElems++;
			i++;
			j++;
		}

		while(k < arrayB.size()) {
			arrayC.setValueAtPos(i, arrayB.getValueAtPos(k));
			arrayC.nElems++;
			i++;
			k++;
		}
		return arrayC;
	}

	public void display() {
		for(int j = 0; j<nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println("");
	}
}
