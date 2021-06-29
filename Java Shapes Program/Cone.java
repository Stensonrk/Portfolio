/* Robert Stenson
 * June 28, 2020
 * Cone.java
 * Subclass of ThreeDimensionalShape...creates the Cone object and methods
 */

package Project1;

public class Cone implements ThreeDimensionalShape {

	//Creates variables for Cone's dimensions
	int radius, height;
	
	//Method for accessing Cone's radius
	public int getRadius() {
		return radius;
	}
	
	//Method to give value for Cone's radius
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//Method to access Cone's height
	public int getHeight() {
		return height;
	}
	
	//Method to set value of Cone's height
	public void setHeight(int height) {
		this.height = height;
	}
	
	//Construct for Cone
	public Cone(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	//Classifies Cone as a 3D object
	@Override
	public int numberOfDimensions() {
		// TODO Auto-generated method stub
		return 3;
	}

	//Calculates and returns Volume of Cone
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return (Math.PI * radius * radius) * (height / 3);
	}

}
