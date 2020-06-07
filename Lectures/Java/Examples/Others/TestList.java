import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
  public static void main(String[] args) {
    // Create a Array list
    List<String> list = new ArrayList<String>();
    
    // Add elements to the array list
    list.add("America"); // Add it to the list
    System.out.println("(1) " + list);

    list.add(0, "Canada"); // Add it to the beginning of the list
    System.out.println("(2) " + list);

    list.add("Russia"); // Add it to the end of the list
    System.out.println("(3) " + list);

    list.add("France"); // Add it to the end of the list
    System.out.println("(4) " + list);

    list.add(2, "Germany"); // Add it to the list at index 2
    System.out.println("(5) " + list);

    list.add(5, "Norway"); // Add it to the list at index 5
    System.out.println("(6) " + list);

    list.add(0, "Netherlands"); // Same as list.addFirst("Daniel")
    System.out.println("(7) " + list);

    // Remove elements from the list
    list.remove("Australia"); // Same as list.remove(0) in this case
    System.out.println("(8) " + list);

    list.remove(2); // Remove the element at index 2
    System.out.println("(9) " + list);

    list.remove(list.size() - 1); // Remove the last element
    System.out.println("(10) " + list);
    
    // Create Linked list from Array list
    LinkedList<String> linkedlist = new LinkedList<String>(list);
    
    linkedlist.add(2, "Vietnam"); // Add it to the list at index 2
    System.out.println("(11) " + linkedlist);
    
    linkedlist.add("Vietnam"); // Add it to the end of the list
    System.out.println("(12) " + linkedlist);
    
    linkedlist.remove(2); // Remove the element at index 2
    System.out.println("(13) " + linkedlist);

    linkedlist.remove("Vietnam"); // Remove elements
    System.out.println("(14) " + linkedlist);
  }
}
