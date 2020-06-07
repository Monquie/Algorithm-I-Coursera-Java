import javax.swing.JOptionPane;

public class UnintendedIntegerDivision {
   public static void main(String[] args) {
      final int NUM_GRADES = 3;
      int grade1 = Integer.parseInt(JOptionPane.showInputDialog("Enter grade 1:"));
      int grade2 = Integer.parseInt(JOptionPane.showInputDialog("Enter grade 2:"));
      int grade3 = Integer.parseInt(JOptionPane.showInputDialog("Enter grade 3:"));
      
      double average = (grade1 + grade2 + grade3) / NUM_GRADES;     
      
      JOptionPane.showMessageDialog(null, "Grade: " + average);    
   }
}

