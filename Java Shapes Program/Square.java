/* Robert Stenson
 * June 28, 2020
 * Square.java
 * Subclass of TwoDimensionalShape...creates Square object and methods
 */

package Project1;

public class Square implements TwoDimensionalShape {
	
	//Creates variable
	int side;
	
	//Access side
	public int getSide() {
		return side;
	}
	
	//Set value for side
	public void setSide(int side) {
		this.side = side;
	}
	
	//Construct for Square object
	public Square(int side) {
		this.side = side;
	}

	//Sets Square as 2D
	@Override
	public int numberOfDimensions() {
		// TODO Auto-generated method stub
		return 2;
	}

	//Calculates and returns area
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
