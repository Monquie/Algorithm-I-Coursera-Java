import javax.swing.JOptionPane;

public class FindMaximum {
	public static void main(String[] args) {
		int highestNumber;
		boolean firstNumberEntered = false;

      int firstNumber = 0;
      
      // Continue to prompt the user until a valid first number is entered
      do {
         // Get the first number. This program assumes at least one number must be entered.
         // If this is not the case, the structure will need to change
         String firstNumberInput = JOptionPane.showInputDialog("Enter the first number: ");

         try {
            firstNumber = Integer.parseInt(firstNumberInput);
            // Once any number is entered by the user, set a boolean flag
            firstNumberEntered = true;
         }
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number! Please try again.");
         }
      } while (!firstNumberEntered);

      // Set the highestNumber to be the first number entered
      highestNumber = firstNumber;
      
      // Priming read to gather additional numbers until the user indicates they are finished
      String numberInput = JOptionPane.showInputDialog("Enter another number, or Q to quit");
		while (!numberInput.equalsIgnoreCase("Q")) {
		   int number;
         	
			try {
            number = Integer.parseInt(numberInput);
            if (number > highestNumber) {
               highestNumber = number;
            }
         }
			// Catch any bad values entered
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid number!");
			}
         // Prompt again before going back to while loop
         numberInput = JOptionPane.showInputDialog("Enter another number, or Q to quit");         
		}
      JOptionPane.showMessageDialog(null, "The highest number was: " + highestNumber);
	}
}

