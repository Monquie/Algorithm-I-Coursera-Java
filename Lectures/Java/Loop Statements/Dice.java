import javax.swing.JOptionPane;

public class Dice {
	public static void main(String[] args) {
      final int NUM_DIE_ROLLS = 10;
		String table = "";
		
		// Store table header in variable
		table += "Dice Rolls\n";
		// Loop through a set number of die rolls
		for (int i=1; i <= NUM_DIE_ROLLS; i++) {
		
			// Generate two random numbers between 1 and 6
			int d1 = (int) (Math.random() * 6) + 1;
			int d2 = (int) (Math.random() * 6) + 1;
			table += d1 + " " + d2 + "\n";
		}	
		
		// Print the table
		JOptionPane.showMessageDialog(null, table);
	}
}

