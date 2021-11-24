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
public class HypotenuseUnitTest2 {

	@Test
	public void CalculcateHypotenuseTest2() {
		//Arrange 
		double expectedLength = 13.416407864998739;
		double actualLength;
		int length1 = 12;
		int length2 = 6;
		Hypotenuse ht = new Hypotenuse(length1, length2);
		
		//Act
		actualLength = ht.CalculateHypotenuse(length1, length2);
		
		//Assert
		assertTrue("Hypotenuse calculated incorrectly", expectedLength == actualLength);
	}
	

}
