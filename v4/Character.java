public class Character {
    
    protected int life;
    protected int strength;
    protected int defense;
    protected double aRate;

    public boolean isAlive() {
	if (life > 0)
	    return true;
	return false;
    }

    public int getDefense() {
	return defense;
    }

    public int lowerHP(int n) {
	return life -= n;
    }

    public int attack(Character n) {
	int damage = (int) (strength * aRate) - n.getDefense();
	return damage;
    }  
}
