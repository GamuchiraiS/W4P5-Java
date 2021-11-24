package testing;
import java.util.*;

public class W4P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length1, length2;
		//prompt user for length 
		System.out.print("Please enter a length for the first side: ");
		//capture what the user inputs 
		length1 =  sc.nextInt();
		System.out.print("Please enter a length for the second side: ");
		//capture what the user inputs 
		length2 =  sc.nextInt();
		Hypotenuse hypo = new Hypotenuse(length1, length2);
		//call method
		hypo.CalculateHypotenuse(length1, length2);
		System.out.println("The hypotenuse = " + hypo.hypotenuse);
		sc.close();
	}

}
