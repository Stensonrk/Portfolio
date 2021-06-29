/* Robert Stenson
 * June 28, 2020
 * Cylinder.java
 * Subclass of ThreeDimensionalShape...creates Cylinder object and methods
 */
package Project1;

public class Cylinder implements ThreeDimensionalShape {

	//Creates variables for cylinder
	int radius, height;
	
	//Access radius
	public int getRadius() {
		return radius;
	}
	
	//Set value of radius
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//Access height
	public int getHeight() {
		return height;
	}
	
	//Set value of height
	public void setHeight(int height) {
		this.height = height;
	}
	
	//Construct for Cylinder object
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	//Sets Cylinder as 3D object
	@Override
	public int numberOfDimensions() {
		// TODO Auto-generated method stub
		return 3;
	}

	//Calculates and returns volume
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return Math.PI * radius * height;
	}

}
