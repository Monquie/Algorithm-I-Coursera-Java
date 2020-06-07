import java.util.*;

public class TestCollections {
	public static void main(String args[]) {
		// Create a list of three strings
		List<String> list = Collections.nCopies(3, "red");

		// Create an array list of three elements
		ArrayList<String> arrayList = new ArrayList<String>(list);
		System.out.println("The initial list is: " + arrayList);
		Collections.fill(arrayList, "yellow");
		System.out.println("After filling with yellow: " + arrayList);

		// Add three new elements to the end of the list
		arrayList.add("white");
		arrayList.add("black");
		arrayList.add("orange");
		System.out.println("After adding new elements: " + arrayList);

		// Shuffle the list
		Collections.shuffle(arrayList);
		System.out.println("After shuffling: " + arrayList);

		// Reverse the list
		Collections.reverse(arrayList);
		System.out.println("After reversing: " + arrayList);

		// Find the minimum and maximum elements
		System.out.println("Minimum element: " + 
			Collections.min(arrayList));
		System.out.println("Maximum element: " + 
			Collections.max(arrayList));

		// Sort the list
		Collections.sort(arrayList);
		System.out.println("After sorting: " + arrayList);

		// Find an element in the list
		System.out.println("Binary search for white: " + 
			Collections.binarySearch(arrayList, "white"));
	} // main
} // TestCollections