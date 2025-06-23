/*
 * Name- Nang Nu Nu Aye
 * ID- 6643005
 * Section- 542
 */
package classEx6;

public class RationalNumber {
	private int numerator;
	private int denominator;
	public RationalNumber() {
		this.numerator= 0;
		this.denominator=1;
	}
	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		if(denominator <=0)
			this.denominator=1;
		else
			this.denominator= denominator;			
	}
	public void add(RationalNumber r) {
		this.numerator= (this.numerator*r.denominator)+(this.denominator*r.numerator);
		this.denominator= this.denominator* r.denominator;
	}
	public void subtract(RationalNumber r) {
		this.numerator= (this.numerator*r.denominator)-(this.denominator*r.numerator);
		this.denominator= this.denominator*r.denominator;
	}
	public void multiply(RationalNumber r) {
		this.numerator= this.numerator*r.numerator;
		this.denominator= this.denominator* r.denominator;
	}
	public void divide(RationalNumber r) {
		this.numerator= this.numerator * r.numerator;
		this.denominator= this.denominator* r.denominator;		
	}
	public void invert() {
		int a= this.numerator;
		this.numerator= this.denominator;
		this.denominator= a;
	}
	public double toDouble() {
		return(double)this.numerator/ this.denominator;
	}
	public void reduce() {
		int n= this.gcd(this.numerator, this.denominator);
		this.numerator /=n;
		this.denominator /=n;
	}
	@Override
	public String toString() {
		return(this.numerator+"/"+this.denominator);
	}
	private int gcd(int a,int b) {
		int g=1;
		for(int n=1; n<=a && n<=b; n++) {
			if(a % n== 0 && b % n ==0)
				g = n;
		}
		return g;
	}
}
