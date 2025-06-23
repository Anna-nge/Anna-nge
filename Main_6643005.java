/*Name-Nang Nu Nu Aye
 * Id-6643005
 * Sec-545
 */
package FP_6643005;

public class Main_6643005 {
	public static void main(String[] args) {
		MC lumine= new MC();
		lumine.setName("Lumine");
		lumine.setGender("Female");
		lumine.levelUp();
		
		Weapon mist_splitter= new Weapon();
		mist_splitter.setName("Mist Splitter reforged");
				lumine.setWeapon(mist_splitter);
		String output= "Name: "+lumine.getName()+
					   "\nGender: "+lumine.getGender()+
					   "\nWeapon: "+lumine.getWeapon().getName()+
					   "\nLevel: "+lumine.getLevel();
		System.out.println(output);

	}

}
