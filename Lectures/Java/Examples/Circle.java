public class Circle extends GeometricObject{
  /** The radius of the circle */
  private double radius;

  /** Construct a circle with radius 1 */
  public Circle() {
    radius = 1.0;
  }

  /** Construct a circle with a specified radius */
  public Circle(double newRadius) {
    //super("Red", true);
	radius = newRadius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) {
    radius = (newRadius >= 0) ? newRadius : 0;
  }

  /** Return the area of this circle */
  public double findArea() {
    return radius * radius * 3.14159;
  }
  
  /** Return the Perimeter of this circle */
  public double findPerimeter() {
    return radius * 2 * 3.14159;
  }

public boolean equals(Object o) {
  if (o instanceof Circle) {
    return radius == ((Circle)o).radius;
  }
  else
    return false;
}

public int hashCode() {
  return (int)(radius * 1999711);
}
}
