import javax.swing.JOptionPane;

/*
	This program continuously captures numbers until a sentinel value is provided.
*/

public class ProcessingWithSentinel {
	public static void main(String[] args) {
      final String SENTINEL = "-1";
   
      // Priming read
      String inputValue = JOptionPane.showInputDialog(null, "Enter any number, or " + SENTINEL + " to quit");
      
      while (!inputValue.equals(SENTINEL)) {
         int value;            
         try {
            value = Integer.parseInt(inputValue);
         }
         // Catch any non-numeric values entered
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Sorry, you did not enter a valid value. Please try again.");
         }
         
         // Read in the next value
         inputValue = JOptionPane.showInputDialog(null, "Enter any number, or -1 to quit");
      }
	}
}

