/* Robert Stenson
 * June 28, 2020
 * Sphere.java
 * Subclass of ThreeDimensionalShape...creates Sphere object and methods
 */

package Project1;

public class Sphere implements ThreeDimensionalShape {

	//Creates variable
	int radius;
	
	//Access radius
	public int getRadius() {
		return radius;
	}
	
	//Set value for radius
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//Construct for Sphere object
	public Sphere(int radius) {
		this.radius = radius;
	}
	
	//Sets Sphere as 3D
	@Override
	public int numberOfDimensions() {
		// TODO Auto-generated method stub
		return 3;
	}

	//Calculates and returns volume
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return (4/3) * Math.PI * radius * radius * radius;
	}

}
