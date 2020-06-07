import javax.swing.JOptionPane;
import java.util.Arrays;

public class GradeSummary {
	public static void main(String[] args) {
		String[] studentNames = getStudentNames();
		double[][] gradebook = getGradebook();
		
		// Print the number of students in the gradebook
		// printNumStudents(gradebook);
		
		// Print the number of tests entered in the gradebook
		// printNumTests(gradebook);
		
		// Print the number of grades entered in the gradebook
		// printNumGrades(gradebook);		

		// Display the grade summary
		// printGradeSummary(studentNames, gradebook);

		// Find the minimum grade entered
		// printMinimumGrade(gradebook);

		// Find the maximum grade entered
		// printMaximumGrade(gradebook);		
		
		// Print student grades
		 printStudentGrades(gradebook, studentNames, "Brittany");
	}
	
	private static String[] getStudentNames() {
		String[] studentNames = {
			"Alex", "Brittany", "Bryan", "Carolyn", "David",
			"Joe", "Kelly", "Lisa", "Mary", "Sam"
		};
		
		return studentNames;
	}
	
	private static double[][] getGradebook() {
		double[][] gradebook = {
			{ 87,  96,  70 },
			{ 68,  87,  90 },
			{ 94,  100, 90 },
			{ 100, 81,  82 },
			{ 83,  65,  85 },
			{ 78,  87,  65 },
			{ 85,  75,  83 },
			{ 91,  94,  100},
			{ 76,  72,  84 },
			{ 87,  93,  73 }						
		};
				
		return gradebook;
	}
	
	private static void printNumStudents(double[][] gradebook) {
		JOptionPane.showMessageDialog(null, "The number of students entered is: " + gradebook.length);
	}

	private static void printNumTests(double[][] gradebook) {
		JOptionPane.showMessageDialog(null, "The number of tests entered is: " + gradebook[0].length);
	}

	private static void printNumGrades(double[][] gradebook) {
		JOptionPane.showMessageDialog(null, "The number of grades entered is: " + gradebook.length * gradebook[0].length);
	}
	
	private static void printGradeSummary(String[] studentNames, double[][] gradebook) {
		String gradeSummary = "Grade Summary\n\n";
		
		for (int i = 0; i < gradebook.length; i++) {
			gradeSummary += studentNames[i] + "  ";
			double gradeAverage = 0;
			for (int j = 0; j < gradebook[0].length; j++) {
				gradeSummary += (int)gradebook[i][j] + "  |  ";
				gradeAverage += gradebook[i][j];
			}
			gradeSummary += "\n";
			gradeSummary += "Grade Average: " + String.format("%.2f", gradeAverage / gradebook[0].length);
			gradeSummary += "\n\n";
		}
		
		JOptionPane.showMessageDialog(null, gradeSummary);
	}
	
	private static void printMinimumGrade(double[][] gradebook) {
		JOptionPane.showMessageDialog(null, "The lowest grade earned is: " + (int)getMinimumGrade(gradebook));
	}
	
	private static double getMinimumGrade(double[][] gradebook) {
		double lowestGrade = gradebook[0][0];
		
		for (int i = 0; i < gradebook.length; i++) {
			for (int j = 0; j < gradebook[0].length; j++) {
				if (gradebook[i][j] < lowestGrade) {
					lowestGrade = gradebook[i][j];
				}
			}
		}	
		
		return lowestGrade;
	}

	private static void printMaximumGrade(double[][] gradebook) {
		JOptionPane.showMessageDialog(null, "The highest grade earned is: " + (int)getMaximumGrade(gradebook));
	}
	
	private static double getMaximumGrade(double[][] gradebook) {
		double highestGrade = gradebook[0][0];
		
		for (int i = 0; i < gradebook.length; i++) {
			for (int j = 0; j < gradebook[0].length; j++) {
				if (gradebook[i][j] > highestGrade) {
					highestGrade = gradebook[i][j];
				}
			}
		}	
		
		return highestGrade;
	}
	
	private static void printStudentGrades(double[][] gradebook, String[] studentNames, String studentName) {
		double[] studentGrades = getStudentGradesByName(gradebook, studentNames, studentName);
		
		if (studentGrades[0] != -1) {
			JOptionPane.showMessageDialog(null, "The grades for " + studentName + " are: " + Arrays.toString(studentGrades));		
		}
		else {
			JOptionPane.showMessageDialog(null, "The grades for " + studentName + " could not be found.");		
		}
	}
	
	
	private static double[] getStudentGradesByName(double[][] gradebook, String[] studentNames, String studentName) {
		double[] studentGrades = new double[gradebook[0].length];
		
		int arrayPosition = findStudent(studentNames, studentName);
		if (arrayPosition >= 0) {
			studentGrades = getIndividualStudentGrades(gradebook, arrayPosition);	
		}
		else {
			studentGrades[0] = -1;
		}
		
		return studentGrades;
	}
	
	private static int findStudent(String[] studentNames, String studentName) {
		int arrayPosition = -1;
		
      int x = 0;
      while (x < studentNames.length && arrayPosition == -1) {
         if (studentNames[x].equals(studentName)) {
				arrayPosition = x;
			}
         else {
            ++x;
         }      
      }
		
		return arrayPosition;
	}
	
	private static double[] getIndividualStudentGrades(double[][] gradebook, int arrayPosition) {
		return gradebook[arrayPosition];
	}	
}
