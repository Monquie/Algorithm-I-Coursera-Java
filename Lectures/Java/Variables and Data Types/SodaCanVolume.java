/** 
   The purpose of this program is to compute the volume (in liters) of a six-pack
   of soda cans. There is no user input, but the program will output the number
   of liters in a six-pack of 12-ounce cans.
*/

public class SodaCanVolume {
   public static void main(String[] args) {
      int cansPerPack = 6;
      double canVolume = 0.355; // Number of liters in a 12-ounce can
      
      // Print number of liters in a 12-ounce can
      System.out.println("A six-pack of 12-ounce cans contains: ");
      System.out.print(cansPerPack * canVolume);
      System.out.println(" liters");
   }
}

