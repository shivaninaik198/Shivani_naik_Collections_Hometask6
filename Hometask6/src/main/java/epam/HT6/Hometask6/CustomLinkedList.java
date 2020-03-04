package epam.HT6.Hometask6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomLinkedList {

	public static void main(String[] args) {
		int choice;
		String element, relement;
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("A");
		llist.add("B");
		llist.add("C");
		llist.add("D");
		llist.add("E");
		llist.add("F");
		llist.add("G");
		llist.add("H");
		llist.add("I");
		llist.add("J");
		while(true) {
			System.out.println("1.Fetch an element.");
			System.out.println("2.Add an element.");
			System.out.println("3.Remove an element.");
			System.out.println("4.Display the contents of the list.");
			System.out.println("5.Exit.");
			System.out.print("Enter your choice : ");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			switch(choice) {
			case 1 : System.out.print("Enter the index value : ");
					 int index = scanner.nextInt();
					 System.out.println("Element at index "+index+" is : "+llist.get(index));
					 break;
			case 2 : System.out.print("Enter the element : ");
					 element = scanner.next();
					 llist.add(element);
					 System.out.println("Element successfully added!");
					 break;
			case 3 : System.out.print("Enter the element to be removed : ");
					 relement = scanner.next();
					 llist.remove(relement);
					 System.out.println("Element successfully removed!");
					 break;
			case 4 : System.out.print("Elements are : ");
					 Iterator<String> iterator = llist.iterator();
					 while(iterator.hasNext()) {
						 System.out.println(iterator.next());
					 }
					 break;
			case 5 : System.exit(0);
			default  :System.out.println("Enter a valid choice!");
			}
		}
	}
}
