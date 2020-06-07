import javax.swing.JOptionPane;
import java.util.Arrays;
public class ArrayRemoveOrderDoesntMatter {
   public static void main(String args[]){
      // Build a partially filled array with a maximum of 5 values
      final int MAX_SIZE = 5;
		int[] data = new int[MAX_SIZE];
		int currentSize = 0;
      
      // Populate 4 values
		for (int x = 0; x < 4; x++) {
			data[x] = x * 5;
			++currentSize;
		}
		
      // Print the array contents and number of values entered
		JOptionPane.showMessageDialog(null, Arrays.toString(data)
		+ "\nNum Elements: " + currentSize);

		// When order doesn't matter. Replace element to delete
		// in array with last element entered. Decrement the size of array		
		data[1] = data[currentSize - 1];
		--currentSize;
		
      // Print the array contents and number of values entered
      JOptionPane.showMessageDialog(null, Arrays.toString(data)
		+ "\nNum Elements: " + currentSize);
   }
}

