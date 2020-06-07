import javax.swing.JOptionPane;
import java.util.Arrays;

public class PrintTwoDimensionalArrayRowColumnTotals {
	public static void main(String[] args) {
		String[] countries =
		{
			"CDN",
			"CHN",
			"GER",
			"KOR",
			"JPN",
			"RUS",
			"USA"
		};
		
		int[][] medalCounts =
		{
			{ 1, 0, 1 },
			{ 1, 1, 0 },
			{ 0, 0, 1 },
			{ 1, 0, 0 },
			{ 0, 1, 1 },
			{ 0, 1, 1 },
			{ 1, 1, 0 }
		};
		
		final int COUNTRIES = medalCounts.length;
		final int MEDALS = medalCounts[0].length;
		
		/***** Print medal table *****/
		String medalCount = "";
		
		// Create array to store column totals
		int[] columnTotals = new int[MEDALS];
		
		// Add medal types
		medalCount += "           G   S   B     T\n";
		
		// Process the "i"th row
		for (int i = 0; i < COUNTRIES; i++) {
		
			// Add country name
			medalCount += countries[i] + "   ";		
		
			// For each row, reset the medalTotal
			int medalTotal = 0;
		
			// Process the "j"th column in the "i"th row
			for (int j = 0; j < MEDALS; j++) {
				medalCount += medalCounts[i][j] + "    ";
				// Maintain running total of individual row total
				medalTotal += medalCounts[i][j];
			}
			medalCount += medalTotal;
			// Start a new line at the end of the row
			medalCount += "\n";
		}
		
		medalCount += "-------------------------\n";
		medalCount += "TTL ";
		
		// Process the "j"th column
		for (int j = 0; j < MEDALS; j++) {
			int columnTotal = 0;
			// Process the "j"th column in the "i"th row
			for (int i = 0; i < COUNTRIES; i++) {
				// Maintain running total of individual column value
				columnTotal += medalCounts[i][j];
			}
			medalCount += "    " + columnTotal;
		}
		
		JOptionPane.showMessageDialog(null, medalCount);
	}
}