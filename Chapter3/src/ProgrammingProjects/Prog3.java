/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Insertion Sort by removing duplicates
 */
package ProgrammingProjects;

public class Prog3 {

	public static void main(String args[]) {
		int max = 9;
		ArrayInsertion arrayInsertion = new ArrayInsertion(max);

		arrayInsertion.insert(7);
		arrayInsertion.insert(7);
		arrayInsertion.insert(10);
		arrayInsertion.insert(5);
		arrayInsertion.insert(3);
		arrayInsertion.insert(2);
		arrayInsertion.insert(1);
		arrayInsertion.insert(1);
		arrayInsertion.insert(1);

		System.out.println("Original array- ");
		arrayInsertion.display();

		arrayInsertion.doInsertionSort();
		System.out.println("\nSorted -");
		arrayInsertion.display();

		System.out.println("\nAfter removing duplicates -");
		arrayInsertion.noDups();
		arrayInsertion.display();

		System.out.println("\nMedian - " + arrayInsertion.median());
	}
}

