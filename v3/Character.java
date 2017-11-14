public class Character {
    
    protected static int life;
    protected static int strength;
    protected static int defense;
    protected static double aRate;

    public static boolean isAlive() {
	if (life > 0)
	    return true;
	return false;
    }

    public static int getDefense() {
	return defense;
    }

    public static int lowerHP(int n) {
	return life -= n;
    }

    public static int attack(Character n) {
	int damage = (int) (strength * aRate) - n.getDefense();
	return damage;
    }  
}
