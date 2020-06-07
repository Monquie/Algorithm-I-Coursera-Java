import javax.swing.JOptionPane;

public class TwoDimensionalArrayVariableLength {
	public static void main(String[] args) {

		/**** Example 1 *****/		
		int[][] pyramidArray1 = new int[3][];
		for (int i = 0; i < pyramidArray1.length; i++) {
			pyramidArray1[i] = new int[i + 1];
		}
		
		
		/**** Example 2 *****/
		int[][] pyramidArray2 = {
			{2},
			{2, 4},
			{2, 4, 6},
			{2, 4, 6, 8}
		};
		
		String pyramidArray2Output = "";
		
		for (int i = 0; i < pyramidArray2.length; i++) {
			for (int j = 0; j < pyramidArray2[i].length; j++) {
				pyramidArray2Output += pyramidArray2[i][j] + "  ";
			}
			pyramidArray2Output += "\n";
		}
		
		JOptionPane.showMessageDialog(null, "The pyramid array output\n" + pyramidArray2Output);
	}
}