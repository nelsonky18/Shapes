package org.cvtc.shapes;
/**
 * @author nelsonky18
 */
public class Sphere extends Shape implements Render {
	/**
	 * The radius of this Sphere instance.
	 */
	private float radius = 0.0f;
	
	/**
	 * Gets the radius of this Sphere instance.
	 */
	public float getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius of this Sphere instance.
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	/**
	 * Initializes a new instance of a Sphere.
	 */
	public Sphere(Dialog messageBox) {
		super(messageBox);
	}
	
	///**
	// * Initializes a new instance of a Sphere.
	// */
	//public Sphere(float radius) {
	//	try {
	//		// The if statement checks if numbers less than 1 are entered because it
	//		// isn't possible to have a sphere with negative numbers.
	//		if(radius < 0) {
	//			throw new Exception();
	//		} else {
	//			// Set the dimensions of this Sphere instance
	//			setRadius(radius);
	//		}
	//	} catch (Exception ex) {
	//		// A message box appears telling the user that they need to enter positive numbers.
	//		JOptionPane.showMessageDialog(null, "Please enter positive numbers for the dimensions of your cuboid.");
	//	}
	//}
	
	/**
	 * This method returns the surface area for a sphere.
	 */
	@Override
	public float surfaceArea() {
		// This is the equation for surface area for a sphere.
		return (float)4 * (float)Math.PI * getRadius() * getRadius();
	}
	
	/**
	 * This method returns the volume for a sphere.
	 */
	@Override
	public float volume() {
		// This is the equation for the volume of a sphere.
		return (float)1.25 * (float)Math.PI * getRadius() * getRadius() * getRadius();
	}
	
	/**
	 * This method displays the dimensions for a sphere.
	 */
	public void render() {
		// The following prints out the dimensions for a sphere.
		messageBox.show("SPHERE: Radius: " + getRadius() + " Surface Area: " + surfaceArea() + " Volume: " + volume(), "Sphere");
	}
}