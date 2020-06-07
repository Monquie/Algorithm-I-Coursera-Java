import javax.swing.JOptionPane;

public class TwoDimensionalArrayAddAll {
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
		
		/***** Get the total number of medals *****/
		int total = 0;
		
		for (int i = 0; i < COUNTRIES; i++) {
			for (int j = 0; j < MEDALS; j++) {
				total += medalCounts[i][j];
			}
		}
		JOptionPane.showMessageDialog(null, total);
		
	}
}