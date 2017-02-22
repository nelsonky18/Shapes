package org.cvtc.tests.substitutes;
/**
 * @author nelsonky18
 */
public class CuboidSub extends ShapeSub implements RenderSub {
	/**
	 * The width of this Cuboid instance.
	 */
	private float width = 0.0f;
	
	/**
	 * The height of this Cuboid instance.
	 */
	private float height = 0.0f;
	
	/**
	 * The depth of this Cuboid instance.
	 */
	private float depth = 0.0f;
	
	/**
	 * Gets the width of this Cuboid instance.
	 */
	public float getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of this Cuboid instance.
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	
	/**
	 * Gets the height of this Cuboid instance.
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of this Cuboid instance.
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	/**
	 * Gets the depth of this Cuboid instance.
	 */
	public float getDepth() {
		return depth;
	}
	
	/**
	 * Sets the depth of this Cuboid instance.
	 */
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	/**
	 * Initializes a new instance of a Cuboid.
	 */
	public CuboidSub(DialogSub messageBox) {
		super(messageBox);
	}
	
	///**
	// * Initializes a new instance of a Cuboid.
	// */
	//public Cuboid(float width, float height, float depth) {
	//	try {
	//		// The if statement checks if numbers less than 0 are entered because it
	//		// isn't possible to have a cuboid with negative numbers.
	//		if(width < 0 || height < 0 || depth < 0) {
	//			throw new Exception();
	//		} else {	
	//			// Set the dimensions of this Cuboid instance
	//			setWidth(width);
	//			setHeight(height);
	//			setDepth(depth);
	//		}
	//	} catch (Exception ex){
	//		// A message box appears telling the user that they need to enter positive numbers.
	//		JOptionPane.showMessageDialog(null, "Please enter positive numbers for the dimensions of your cuboid.");
	//	}
	//}
	
	/**
	 * This method returns the surface area for a cuboid.
	 */
	@Override
	public float surfaceArea() {
		// This is the equation for surface area for a cuboid.
		return getWidth() * getDepth() * getHeight() * (float)Math.PI;
	}
	
	/**
	 * This method returns the volume for a cuboid.
	 */
	@Override
	public float volume() {
		// This is the equation for the volume of a cuboid.
		return getWidth() * getDepth() * getHeight();
	}
	
	/**
	 * This method displays the dimensions of a cuboid.
	 */
	public String render() {
		String result = "0x00";
		return result;
	}
}