import javax.swing.JOptionPane;

public class FormattedOutput {
	public static void main(String[] args) {
		double pricePerLiter = 1.21997;

		// Setup a new variable of type: String
		// and format the value to two decimal places which can be used in output
		JOptionPane.showMessageDialog(null, String.format("$%.2f", pricePerLiter));
	}
}


