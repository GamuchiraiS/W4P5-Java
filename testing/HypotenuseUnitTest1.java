/**
 * 
 */
package testing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author gamuc
 *
 */
public class HypotenuseUnitTest1 {

	@Test
	public void CalculcateHypotenuseTest1() {
		//Arrange 
		double expectedLength = 5.0;
		double actualLength;
		double length1 = 3.0;
		double length2 = 4.0;
		Hypotenuse ht = new Hypotenuse(length1, length2);
		
		//Act
		actualLength = ht.CalculateHypotenuse(length1, length2);
		
		//Assert
		assertTrue("Hypotenuse calculated incorrectly", expectedLength == actualLength);
	}

}
