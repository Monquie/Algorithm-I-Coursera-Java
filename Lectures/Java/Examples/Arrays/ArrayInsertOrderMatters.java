import javax.swing.JOptionPane;
import java.util.Arrays;
public class ArrayInsertOrderMatters {
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
	
		/* When order does matter. Move all of the "valid" elements
		   after the position "to the right" to make space and update size
         
         Assume we want to add in the value 999 to be the 2nd element in the array (index 1)
		*/
      int index = 1;
      if (currentSize < MAX_SIZE) {
   		for (int y = currentSize; y > index; y--) {
   			data[y] = data[y - 1];
            // Uncomment out the line below to see the values "shifting"
            // to the right through each iteration of the loop
            //JOptionPane.showMessageDialog(null, Arrays.toString(data));
   		}
   		data[index] = 999;
   		++currentSize;
      }
      else {
         JOptionPane.showMessageDialog(null, "Array is already full!");
      }

		JOptionPane.showMessageDialog(null, Arrays.toString(data)
		+ "\nNum Elements: " + currentSize);
   }
}

