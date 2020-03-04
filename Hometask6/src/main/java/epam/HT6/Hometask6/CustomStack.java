package epam.HT6.Hometask6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class CustomStack {

	public static void main(String[] args) {
		int choice;
		String element;
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.push("F");
		stack.push("G");
		stack.push("H");
		stack.push("I");
		stack.push("J");
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
					 System.out.println("Element at index "+index+" is : "+stack.elementAt(index));
					 break;
			case 2 : System.out.print("Enter the element : ");
					 element = scanner.next();
					 stack.push(element);
					 System.out.println("Element successfully added!");
					 break;
			case 3 : System.out.println("Element removed : "+ stack.peek());
					 stack.pop();
					 System.out.println("Element successfully removed!");
					 break;
			case 4 : System.out.print("Elements are : ");
					 Iterator<String> iterator = stack.iterator();
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
