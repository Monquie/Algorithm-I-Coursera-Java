import javax.swing.JOptionPane;

public class PrintTwoDimensionalArrayWithMethods {
	public static void main(String[] args) {
		String[] countries = getCountries();
		int[][] medalCounts = getMedalCounts();
		printMedalCount(countries, medalCounts);
	}
	
	private static String[] getCountries() {
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
		
		return countries;
	}
	
	private static int[][] getMedalCounts() {
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

		return medalCounts;
	}
	
	private static void printMedalCount(String[] countries, int[][] medalCounts) {
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