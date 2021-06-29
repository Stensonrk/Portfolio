/* Robert Stenson
 * June 28, 2020
 * Triangle.java
 * Subclass of TwoDimensionalShape...creates Triangle object and methods
 */

package Project1;

public class Triangle implements TwoDimensionalShape {
	
	//Creates variables
	int base, height;
	
	//Access base
	public int getBase() {
		return base;
	}
	
	//Set value for base
	public void setBase(int base) {
		this.base = base;
	}
	
	//Access height
	public int getHeight() {
		return height;
	}
	
	//Set value for height
	public void setHeight(int height) {
		this.height = height;
	}
	
	//Construct for Triangle object
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	//Sets triangle as 2D
	@Override
	public int numberOfDimensions() {
		// TODO Auto-generated method stub
		return 2;
	}

	//Calculates and returns area
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (height * base) / 2;
	}

}
