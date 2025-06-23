/*Name-Nang Nu Nu Aye
 * Id-6643005
 * Sec-545
 */
package FP_6643005;

 class MC extends Character implements Playable {
	private int level = 1; // Starting level
    private Weapon weapon;
    
    @Override
    public void relocate() {
        System.out.println("Main character is relocated by player and quest");
    }
    
    @Override
    public void levelUp() {
        level++; // Increase level by one
    }
    
    @Override
    public int getLevel() {
        return level; // Return the current level
    }
    
    public Weapon getWeapon() {
        return weapon;
    }
    
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}



