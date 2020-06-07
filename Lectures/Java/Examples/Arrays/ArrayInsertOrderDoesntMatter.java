import javax.swing.JOptionPane;
import java.util.Arrays;
public class ArrayInsertOrderDoesntMatter {
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
		
		JOptionPane.showMessageDialog(null, Arrays.toString(data)
		+ "\nNum Elements: " + currentSize);

		// When order doesn't matter. Add element to end of array
		// and increment the size
      if (currentSize < MAX_SIZE) {    		
   		data[currentSize] = 999;
   		++currentSize;
      }		

		JOptionPane.showMessageDialog(null, Arrays.toString(data)
		+ "\nNum Elements: " + currentSize);
   }
}
