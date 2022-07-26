// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
// 2. Write a Java program to iterate through all elements in a array list.
// 3. Write a Java program to insert an element into the array list at the first position.
// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
// 5. Write a Java program to update specific array element by given element.
// 6. Write a Java program to remove the third element from a array list.
// 7. Write a Java program to search an element in a array list.
// 8. Write a Java program to sort a given array list.
// 9. Write a Java program to copy one array list into another.
// 10. Write a Java program to shuffle elements in a array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();  // 1
		
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.add("White");
		list.add("Black");
		
		list.add(0, "Orange"); // 3
		list.set(3, "Purple"); // 5
		list.remove(2); // 6
		
		System.out.println("Index of Red is: " +list.indexOf("Red")); // 7
		
		Iterator<String> iter = list.iterator(); // 2
		while(iter.hasNext()) { 
			System.out.println(iter.next()); // 1
		}
		
		System.out.println("Element at index 4 is: " +list.get(4)); // 4
		
		Collections.sort(list); // 8
		Iterator<String> iter2 = list.iterator();
		System.out.println("List after sorting ");
		while(iter2.hasNext()) { 
			System.out.println(iter2.next()); 
		}
		System.out.println("\n");
		
		ArrayList<String> list2 = list; // 9
		Iterator<String> iter3 = list2.iterator();
		System.out.println("List after copying ");
		while(iter3.hasNext()) { 
			System.out.println(iter3.next()); 
		}
		System.out.println("\n ");

		Collections.shuffle(list2); // 10
		Iterator<String> iter4 = list2.iterator();
		System.out.println("List after shuffling ");
		while(iter4.hasNext()) { 
			System.out.println(iter4.next()); 
		}
		System.out.println("\n ");
		
		Collections.reverse(list2); // 11
		

	}

}
