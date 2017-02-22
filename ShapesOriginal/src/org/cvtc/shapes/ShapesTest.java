package org.cvtc.shapes;
/**
 * @author nelsonky18
 */
public class ShapesTest {
	/**
	 * This is the main method, where you can create instances of various Shape objects.
	 * Currently, you can create Cuboid, Cylinder, and Sphere shapes.
	 */
	public static void main(String[] args) {
		try {
			Dialog messageBox = new MessageBox();
			
			// This creates a new cuboid object with given parameters.
			Cuboid cuboid = new Cuboid(messageBox);
			
			// This creates a new cylinder object with given parameters.
			Cylinder cylinder = new Cylinder(messageBox);
			
			// This creates a new sphere object with given parameters.
			Sphere sphere = new Sphere(messageBox);
			
			// This displays the dimensions of the cuboid object.
			cuboid.render();
			
			// This displays the dimensions of the cylinder object.
			cylinder.render();
			
			// This displays the dimensions of the sphere object.
			sphere.render();
		} catch (Exception ex) {
			
		}
	}
}