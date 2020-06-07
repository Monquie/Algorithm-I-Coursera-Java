import javax.swing.JOptionPane;

/*
	This program ensures an integer less than 100 is entered.
*/

public class EnterIntegerBelowValue {
	public static void main(String[] args) {
      final int MAXIMUM_VALUE = 100;
   
      int value;
      
      do {
         try {
            value = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer < " + MAXIMUM_VALUE));
         }
         // Catch any non-numeric values entered, and set the value equal to something out of range
         catch (NumberFormatException e) {
            value = MAXIMUM_VALUE;         
         }
         if (value >= MAXIMUM_VALUE) {
            JOptionPane.showMessageDialog(null, "Sorry, you did not enter a valid value. Please try again.");         
         }
      } while (value >= MAXIMUM_VALUE);
	}
}

