import javax.swing.JOptionPane;

public class Gradebook {

	public static void main (String [] args) {
      final int MIN_GRADE = 0;
      final int MAX_GRADE = 100;
		final int[] MIN_GRADES = {90, 80, 70, 0};
		final char[] LETTER_GRADES = {'A', 'B', 'C', 'F'};
      final int MIN_STUDENTS = 1;
		final int MAX_STUDENTS = 100;

		int numStudents = getNumStudents(MIN_STUDENTS, MAX_STUDENTS);

		String[] names = new String[numStudents];
      getStudentNames(names);
      
      int[] grades = new int[numStudents];
		getStudentGrades(grades, names, MIN_GRADE, MAX_GRADE);
      
		displayFinalGradeReport(names, grades, MIN_GRADES, LETTER_GRADES);
   }

   private static int getNumStudents(int minStudentsAllowed, int maxStudentsAllowed) {
		int numStudents;
		
		do {
			try {
				numStudents = Integer.parseInt(JOptionPane.showInputDialog("How many students are in the class?"));
			}
			catch (NumberFormatException e) {
				numStudents = 0;
			}
			if (numStudents < minStudentsAllowed || numStudents > maxStudentsAllowed) {
				JOptionPane.showMessageDialog(null,
               "ERROR! Enter a number of students between " + minStudentsAllowed + " and " + maxStudentsAllowed);
			}
		}
		while (numStudents < minStudentsAllowed || numStudents > maxStudentsAllowed);
		
		return numStudents;
   }

   private static void getStudentNames (String[] studentNames) {
       for (int x = 0; x < studentNames.length; x++) {
           do {
              studentNames[x] = JOptionPane.showInputDialog("Enter the name of student #"+(x+1)+":");
              if (studentNames[x].equals("")) {
                 JOptionPane.showMessageDialog(null, "ERROR! Enter a name for the student.");
              }
           } while (studentNames[x].equals(""));
       }
   }

   private static void getStudentGrades (int[] studentGrades, String[] studentNames, int minGrade, int maxGrade) {
		for (int x = 0; x < studentGrades.length; x++) {
			studentGrades[x] = getStudentGrade(studentNames[x], minGrade, maxGrade);
		}
   }

   private static int getStudentGrade(String studentName, int minGrade, int maxGrade) {
		int grade;

		do {
			try {
				grade = Integer.parseInt(JOptionPane.showInputDialog(
               "Enter grade (between " + minGrade + " and " + maxGrade + ") for " + studentName + ":"));
			}
			catch (NumberFormatException e) {
				grade = minGrade - 1;
			}
			if (grade < minGrade || grade > maxGrade) {
				JOptionPane.showMessageDialog(null, "ERROR! Enter a grade between 0 and 100");
			}
		}
		while (grade < minGrade || grade > maxGrade);

		return grade;
   }

   private static void displayFinalGradeReport(String[] studentNames, int[] studentGrades,
      int[] minGrades, char[] letterGrades) {
		String gradeReport = "Name / Grade\n";
		for (int x = 0; x < studentNames.length; x++) {
			gradeReport += studentNames[x] + " / " + studentGrades[x] + "% ("
            + calculateLetterGrade(studentGrades[x], minGrades, letterGrades) + ")\n";
		}
		JOptionPane.showMessageDialog(null, gradeReport);
   }
	
   private static char calculateLetterGrade (int grade, int[] minGrades, char[] letterGrades) {
		char letterGrade = letterGrades[letterGrades.length - 1];
		
      boolean found = false;
      int x = 0;
      
      while (x < minGrades.length && !found) {
         if (grade >= minGrades[x]) {
				letterGrade = letterGrades[x];
				found = true;
			}
         else {
            ++x;
         }      
      }
		
		return letterGrade;
   }	
}