import javax.swing.JOptionPane;
import java.util.Arrays;
public class ArrayRemoveOrderMatters {
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
		
		// When order does matter. Move all of the "valid" elements
		// after the INDEX position "to the left" and update size
      int index = 1;
      // Check to make sure the delete is valid!
      if (index >= 0 && index < currentSize) {
   		for (int y = index; y < currentSize - 1; y++) {
   			data[y] = data[y + 1];
            // Uncomment out the line below to see the values "shifting"
            // to the left through each iteration of the loop
            //JOptionPane.showMessageDialog(null, Arrays.toString(data));
   		}
   		--currentSize;
      }
      else {
         JOptionPane.showMessageDialog(null, "Invalid index!");
      }		

		JOptionPane.showMessageDialog(null, Arrays.toString(data)
		+ "\nNum Elements: " + currentSize);
   }
}


