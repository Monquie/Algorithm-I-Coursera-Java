import javax.swing.JOptionPane;
import java.util.Arrays;
public class ArrayCopy {
   public static void main(String args[]){
	   double[] data = {32.0, 54.0, 67.5, 29.0, 35.0, 47.5};

      double[] prices = data; // prices is only a reference value, BAD!
   
      // copyOf creates a new copy of the array contents and gives
      // a reference value for prices to be set
      double[] prices = Arrays.copyOf(data, data.length);	
   }
}

