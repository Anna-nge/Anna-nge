/*
 * Name- Nang Nu Nu Aye
 * ID- 6643005
 * Section- 542
 */
package classEx6;

public class RationalNumberDriver {

	public static void main(String[] args) {
		RationalNumber rn1= new RationalNumber(3,6);
		RationalNumber rn2= new RationalNumber(1,2);
	rn1.reduce();
	System.out.println("The fraction 1 is "+ rn1.toString());
	System.out.println("The fraction 1 point is "+ rn1.toDouble());
	
	rn2.reduce();
	System.out.println("The fraction 2 is "+ rn2.toString());
	System.out.println("The fraction 2 point is "+ rn2.toDouble());
	
	rn1.add(rn2);
	System.out.println("The add two fraction is "+ rn1.toString());
	System.out.println("The fraction point is "+ rn1.toDouble());
	
	rn1.subtract(rn2);
	System.out.println("The subtract two fraction is "+ rn1.toString());
	System.out.println("The fraction point is "+ rn1.toDouble());
	
	rn1.multiply(rn2);
	System.out.println("The multiply two fraction is "+ rn1.toString());
	System.out.println("The fraction point is "+ rn1.toDouble());
	
	rn1.divide(rn2);
	System.out.println("The divided two fraction is "+ rn1.toString());
	System.out.println("The fraction point is "+ rn1.toDouble());
	
	rn1.invert();
	System.out.println("The invert the fraction is "+ rn1.toString());
	System.out.println("The fraction point is "+ rn1.toDouble());
	}
}
