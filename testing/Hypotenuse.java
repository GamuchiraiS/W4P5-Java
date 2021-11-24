/**
 * 
 */
package testing;

/**
 * @author gamuc
 *
 */
public class Hypotenuse {
	public double length1, length2, hypotenuse;
	
	public Hypotenuse(double l1, double l2) {
		length1 = l1; 
		length2 = l2;
		hypotenuse = 0.00;
	}
	
	//method to calculate the hypotenuse
	public double CalculateHypotenuse(double length1, double length2) {
		/*squares length1 and length2
		 * Adds the result.
		 * Then takes the square root of the result 
		 * And assigns it to hypotenuse.
		 * After, we return the value of hypotenuse
		 */
		hypotenuse = Math.sqrt(Math.pow(length1, 2) + Math.pow(length2, 2));
		return hypotenuse;
	}
}
