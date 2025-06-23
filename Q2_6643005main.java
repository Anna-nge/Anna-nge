/*Name-Nang Nu Nu Aye
 * Id-6643005
 * Sec-545
 */
package Quiz2_6643005;

public class Q2_6643005main {

	public static void main(String[] args) {
		Ps ps= new Ps();
		ps.setName("PS5");
		ps.setCPU("AMD Zen 2");
		ps.setMemory(16);
		ps.play();
		
		
		System.out.println("");
		
		Xbox xbox= new Xbox();
		xbox.setName("Xbox S");
		xbox.setCPU("AMD Zen2");
		xbox.setMemory(8);
		xbox.play();
		
		
	}

}
