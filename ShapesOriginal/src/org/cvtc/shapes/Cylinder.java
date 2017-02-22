package org.cvtc.shapes;
/**
 * @author nelsonky18
 */
public class Cylinder extends Shape implements Render {
	/**
	 * The radius of this Cylinder instance.
	 */
	private float radius = 0.0f;
	
	/**
	 * The height of this Cylinder instance.
	 */
	private float height = 0.0f;
	
	/**
	 * Gets the radius of this Cylinder instance.
	 */
	public float getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius of this Cylinder instance.
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	/**
	 * Gets the height of this Cylinder instance.
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of this Cylinder instance.
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	/**
	 * Initializes a new instance of a Cylinder.
	 */
	public Cylinder(Dialog messageBox) {
		super(messageBox);
	}
	
	//**
	// * Initializes a new instance of a Cylinder.
	// */
	//public Cylinder(float radius, float height) {
	//	try {
	//		// The if statement checks if numbers less than 0 are entered because it
	//		// isn't possible to have a cylinder with negative numbers.
	//		if(radius < 0 || height < 0) {
	//			throw new Exception();
	//		} else {
	//			// Set the dimensions of this Cylinder instance
	//			setRadius(radius);
	//			setHeight(height);
	//		}
	//	} catch (Exception ex) {
	//		// A message box appears telling the user that they need to enter positive numbers.
	//		JOptionPane.showMessageDialog(null, "Please enter positive numbers for the dimensions of your cylinder.");
	//	}
	//}
	
	/**
	 * This method returns the surface area for a cylinder.
	 */
	@Override
	public float surfaceArea() {
		// This is the equation for surface area for a cylinder.
		return ((2 * (float)Math.PI) * getRadius() * getHeight()) +
			   (2 * (float)Math.PI) * getRadius() * getRadius();
	}
	
	/**
	 * This method returns the volume for a cylinder.
	 */
	@Override
	public float volume() {
		// This is the equation for the volume of a cylinder.
		return (float)Math.PI * getRadius() * getRadius() * getHeight();
	}
	
	/**
	 * This method displays the dimensions for a cylinder.
	 */
	public void render() {
		// The following prints out the dimensions for a cuboid.
		messageBox.show("CYLINDER: Radius: " + getRadius() + " Height: " + getHeight() + " Surface Area: " + surfaceArea() + " Volume: " + volume(), "Cylinder");
	}
}