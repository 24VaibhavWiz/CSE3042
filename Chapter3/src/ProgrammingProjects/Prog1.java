/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Bi directional Bubble Sort
 */
package ProgrammingProjects;

public class Prog1 {

	public static void main(String args[]) {
		int max = 6;
		ArrayBubble arrayBubble = new ArrayBubble(max);

		arrayBubble.insert(7);
		arrayBubble.insert(10);
		arrayBubble.insert(5);
		arrayBubble.insert(3);
		arrayBubble.insert(2);
		arrayBubble.insert(1);

		System.out.println("\nOriginal -");
		arrayBubble.display();
		System.out.println("\n");
		arrayBubble.doBubbleSort();
		System.out.println("\nSorted -");
		arrayBubble.display();
	}
}

