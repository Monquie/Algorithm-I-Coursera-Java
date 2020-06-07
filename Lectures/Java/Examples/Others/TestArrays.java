import java.util.Arrays; 
  
public class TestArrays { 
    public static void main(String[] args) 
    { 
  
        // Get the Array 
        int intArr[] = { 10, 20, 15, 22, 35, 18, 40, 43, 89, 95 }; 
        
        // Sort the Array
        Arrays.sort(intArr);
        
        // Print the Array
        for (int i=0; i<intArr.length; i++) 
            System.out.print(intArr[i] + " ");
            System.out.println();
      
        // Search for an element
        int intKey = 22; 
        System.out.println(intKey 
            + " found at index = "
            + Arrays.binarySearch(intArr, intKey)); 
        
        // Get the second Array 
        int intArr1[] = { 10, 15, 18, 20, 22, 35, 40, 43, 89, 95 }; 
  
        // Compare both arrays 
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.compare(intArr, intArr1)); 
            
      }
}