/* Robert Stenson
 * June 28, 2020
 * Torus.java
 * Subclass of ThreeDimensionalShape...creates Torus object and methods
 */

package Project1;

public class Torus implements ThreeDimensionalShape {
	
	//Creates variables...minor is outside to midway. Major is midway to center
	int majorRadius, minorRadius;
	
	//Access majorRadius
	public int getMajor() {
		return majorRadius;
	}
	
	//Set value of majorRadius
	public void setMajor(int majorRadius) {
		this.majorRadius = majorRadius;
	}
	
	//Access minorRadius
	public int getMinor() {
		return minorRadius;
	}
	
	
	//Set value of minorRadius
	public void setMinor(int minorRadius) {
		this.minorRadius = minorRadius;
	}

	//Construct for Torus object
	public Torus(int majorRadius, int minorRadius) {
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}
	
	//Set torus as 3D object
	@Override
	public int numberOfDimensions() {
		// TODO Auto-generated method stub
		return 3;
	}

	//Calculates and returns volume
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return (Math.PI * minorRadius * minorRadius) * (2 * Math.PI * majorRadius);
	}

}
