import javax.swing.JOptionPane;
public class OutputElementsWithSeparators {
	public static void main (String [] args) {
		double[] data = {1.0, 2.0, 4.0};
		String arrayData = "";
		
		for (int x = 0; x < data.length; x++) {
         // Don't add the separator before the first value
         if (x > 0) {
            arrayData += " | ";
         }
         arrayData += data[x];
		}
		JOptionPane.showMessageDialog(null, arrayData);
	}
}



