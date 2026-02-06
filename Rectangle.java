// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor: 
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  // second constructor: 
  public Rectangle() {
    this(1,1, 0,0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   this.originX += dx;
	   this.originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return this.width * this.height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (this.width + this.height);
  }
  
  //method:scale
  public void scale(double w_scale, double h_scale){
    this.width = this.width * w_scale;
    this.height = this.height * h_scale;
  }

  //method:scale
  public void scale(double w_scale){
    this.width = this.width * w_scale;
    this.height = this.height * w_scale;
  }


}
