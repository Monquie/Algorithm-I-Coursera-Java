import javax.swing.JOptionPane;

// This program prints a table of powers of x

public class PowerTable {
	public static void main(String[] args) {
		final int NMAX = 4;
		final double XMAX = 10;
		
      String report = "";
      
		//Print table head
		// First row
		for (int n=1; n<=NMAX; n++) {
			report += String.format("%10d", n);
		}
		report += "\n";
		
		// Second row
		for (int n=1; n<=NMAX; n++) {
			report += String.format("%10s", "x ");
		}
		report += "\n";
				
		//Print table body
		
		//Loop through each row
		for (double x = 1; x <= XMAX; x++) {
			//Loop through each column in each row
			for (int n = 1; n<= NMAX; n++) {
				report += String.format("%10.0f", Math.pow(x, n));
			}
			report += "\n";
		}
      JOptionPane.showMessageDialog(null, report);	
	}
}

