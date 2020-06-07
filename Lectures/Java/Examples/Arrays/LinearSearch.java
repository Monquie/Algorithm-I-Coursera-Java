import javax.swing.JOptionPane;
public class LinearSearch {
   public static void main(String args[]){
		int[] data = {1, 2, 4};
		int searchValue = 2;
		int index = 0;
		boolean found = false;
		
		while (!found && index < data.length) {
			if (data[index] == searchValue) {
				found = true;
			}
			else {
				++index;
			}
		}
		if (found) {
			JOptionPane.showMessageDialog(null, "Found at index: " + index);
		}
		else {
			JOptionPane.showMessageDialog(null, "Not found");
		}
	
   }
}

