/*Name-Nang Nu Nu Aye
 * Id-6643005
 * Sec-545
 */
package FP_6643005;

public class Character  {
	private String name;
    private String gender;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void relocate() {
        // Base relocate method to be overridden
    }

	public void levelUp() {
		// TODO Auto-generated method stub
		
	}

	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
}


