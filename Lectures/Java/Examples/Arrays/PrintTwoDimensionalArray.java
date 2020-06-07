import javax.swing.JOptionPane;

public class PrintTwoDimensionalArray {
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

		// Calculate the rows and columns in 2D array
		final int COUNTRIES = medalCounts.length;
		final int MEDALS = medalCounts[0].length;
		
		/***** Print medal table *****/
		String medalCount = "";
		
		// Add medal types
		medalCount += "           G   S   B\n";
		
		// Process the "i"th row
		for (int i = 0; i < COUNTRIES; i++) {
		
			// Add country name
			medalCount += countries[i] + "   ";

			// Process the "j"th column in the "i"th row
			for (int j = 0; j < MEDALS; j++) {
				medalCount += medalCounts[i][j] + "    ";
			}
			// Start a new line at the end of the row
			medalCount += "\n";
		}
		JOptionPane.showMessageDialog(null, medalCount);
	}
}