package epam.HT6.Hometask6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class CustomArrayList {

	public static void main(String[] args) {
		int choice;
		String element, relement;
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("A");
		alist.add("B");
		alist.add("C");
		alist.add("D");
		alist.add("E");
		alist.add("F");
		alist.add("G");
		alist.add("H");
		alist.add("I");
		alist.add("J");
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
					 System.out.println("Element at index "+index+" is : "+alist.get(index));
					 break;
			case 2 : System.out.print("Enter the element : ");
					 element = scanner.next();
					 alist.add(element);
					 System.out.println("Element successfully added!");
					 break;
			case 3 : System.out.print("Enter the element to be removed : ");
					 relement = scanner.next();
					 alist.remove(relement);
					 System.out.println("Element successfully removed!");
					 break;
			case 4 : System.out.print("Elements are : ");
					 Iterator<String> iterator = alist.iterator();
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
