/* Name-Nang Nu Nu Aye
 * Id-6643005
 * Section-545
 */
package Worksheet_9;
public class GameDemo {

	public static void main(String[] args) {
		Mage mg= new Mage("Gandalf",100);
		mg.attack();
		mg.castSpell();
	}

}
abstract class GameCharacter{
	protected String name;
	protected int health;
	
	public GameCharacter(String name,int health) {
		this.name= name;
		this.health= health;
	}
	public abstract void attack();
 }
class Mage extends GameCharacter{
	public Mage(String name, int health) {
		super(name,health);
	}
	
	@Override
	public void attack() {
		System.out.println(name+"attacks with magic!");
	}
	public void castSpell() {
		System.out.println(name+"casts a powerful spell!");
	}
}