import javax.swing.JOptionPane;

/*
	This program describes the destruction that may occur based on a Ricther scale value
*/

public class Richter {
	public static void main(String[] args) {
		double scaleValue = Double.parseDouble(JOptionPane.showInputDialog("Enter the Ricther value:"));
		String message;
      
		if (scaleValue >= 8.0) { // Handle this 'special case' first
         message = "Most structures Fall";
      }
		else if (scaleValue >= 7.0) {
         message = "Many buildings destroyed";
      }
		else if (scaleValue >= 6.0) {
         message = "Many buildings damaged, some collapse";
      }
		else if (scaleValue >= 4.5) {
         message = "Damage to poorly constructed buildings";
      }
      else { // so that the 'general case' can be handled last
         message = "No destruction of buildings";
      }
                  
		JOptionPane.showMessageDialog(null, message);
	}
}