/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Insertion Sort with median
 */
package ProgrammingProjects;

public class Prog2 {

	public static void main(String args[]) {
		int max = 6;
		ArrayInsertion arrayInsertion = new ArrayInsertion(max);

		arrayInsertion.insert(7);
		arrayInsertion.insert(10);
		arrayInsertion.insert(5);
		arrayInsertion.insert(3);
		arrayInsertion.insert(2);
		arrayInsertion.insert(1);

		System.out.println("\nOriginal -");
		arrayInsertion.display();
		System.out.println("\n");
		arrayInsertion.doInsertionSort();
		System.out.println("\nSorted -");
		arrayInsertion.display();

		System.out.println("Median = " + arrayInsertion.median());
	}
}
