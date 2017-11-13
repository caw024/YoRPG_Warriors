public class Character {
    
    public static int life;
    public static int strength;
    public static int defense;
    public static double aRate;

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

    public static int attack(Character n) java{
	int damage = (int) (strength * aRate) - n.getDefense();
	return damage;
    }  
}
