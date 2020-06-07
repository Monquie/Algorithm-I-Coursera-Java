public class TestPolymorphismCasting {
  /** Main method */
  public static void main(String[] args) {
    // Declare and initialize two objects
    Object object1 = new Circle(1);
    Object object2 = new Cylinder(1, 1);

    // Display circle and cylinder
    displayObject(object1);
    displayObject(object2);
  }

  /** A method for displaying an object */
  public static void displayObject(Object object) {
    if (object instanceof Cylinder) {
      System.out.println("The cylinder area is " +
        ((Cylinder)object).findArea());
      System.out.println("The cylinder volume is " +
        ((Cylinder)object).findVolume());
    }
    else if (object instanceof Circle) {
      System.out.println("The circle area is " +
        ((Circle)object).findArea());
    }
  }
}
