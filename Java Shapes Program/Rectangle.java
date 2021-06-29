/* Robert Stenson
 * June 28, 2020
 * Rectangle.java
 * Subclass of TwoDimensionalShape...creates Cube object and methods
 */

package Project1;

public class Rectangle implements TwoDimensionalShape {

	//Creates variables
	int length, width;
	
	//Access length
	public int getLength() {
		return length;
	}
	
	//Set length value
	public void setLength(int length) {
		this.length = length;
	}
	
	//Access width
	public int getWidth() {
		return width;
	}
	
	//Set width value
	public void setWidth(int width) {
		this.width = width;
	}
	
	//Construct for Rectangle object
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	//Sets Rectangle as 2D
	@Override
	public int numberOfDimensions() {
		// TODO Auto-generated method stub
		return 2;
	}

	//Calculates and returns area
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
