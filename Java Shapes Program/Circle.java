/* Robert Stenson
 * June 28, 2020
 * Circle.java
 * Subclass of TwoDimensionalShape...contains methods pertaining to Circle
 */

package Project1;

public class Circle implements TwoDimensionalShape {

	//Creates variable for circle's radius
	int radius;
	
	//Sets construct radius to object radius
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//Method to access radius of class
	public int getRadius() {
		return radius;
	}
	
	//Method changes value of radius
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//Sets Circle as 2D object
	@Override
	public int numberOfDimensions() {
		// TODO Auto-generated method stub
		return 2;
	}

	//Method to calculate and return area of Circle
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}
