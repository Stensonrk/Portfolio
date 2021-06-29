/* Robert Stenson
 * June 28, 2020
 * Cube.java
 * Subclass of ThreeDimensionaShape...creates Cube object and methods
 */

package Project1;

public class Cube implements ThreeDimensionalShape {

	//Creates cube variables
	int side;
		
	//Access side variable
	public int getSide() {
		return side;
	}
	
	//Sets value for side
	public void setSide(int side) {
		this.side = side;
	}
	
	//Construct for Cube object
	public Cube(int side) {
		this.side = side;
	}
		
	//Sets Cube as 3D
	@Override
	public int numberOfDimensions() {
		// TODO Auto-generated method stub
		return 3;
	}

	//Calculates and returns Volume
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return (side * side) * (side * side) * (side * side);
	}

}
