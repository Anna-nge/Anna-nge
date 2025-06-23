/*Name-Nang Nu Nu Aye
 * Id-6643005
 * Sec-545
 */
package FP_6643005;

public class NPC extends Character {
	@Override
    public void relocate() {
        System.out.println("NPC is recolated by quest only");
    }

	private String city;
	
	public void quest() {
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
