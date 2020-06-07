public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;

  /** Construct a default geometric object */
  protected GeometricObject() {
	System.out.println("superclass constructor");
  }

  /** Construct a geometric object with specified properties */
  protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
     so, the get method name is isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Abstract method findArea */
  public abstract double findArea();

  /** Abstract method findPerimeter */
  public abstract double findPerimeter();
}
