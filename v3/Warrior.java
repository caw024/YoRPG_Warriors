//Team Warriors
//APCS1 pd 8
//HW #31 -- Ye Olde Role Playing Game, Expanded 
//2017-11-13

public class Warrior extends Protagonist {

    //Attributes
    protected static String name;
    protected static int life;
    protected static int strength;
    protected static int defense;
    protected static double aRate;

    //Constructor
    // public Warrior(String newname) {
    // 	name = newname;
    // 	life = 100;
    // 	strength = 20;
    // 	defense = 5;
    // 	aRate = 2.5;
    // }

    //returns boolean indicating living/dead
    public static boolean isAlive() {
	if (life <= 0)
	    return false;
	return true;
    }

    //returns value of defense attribute
    public static int getDefense() {
	return defense;
    }

    //returns value of name attribute
    public static String getName() {
	return name;
    }

    //descreases life by parameter
    public static int lowerHP(int n) {
	life -= n;
	if (life <= 0)
	    return 0;
	return life;
    }

    //calculates attack
    //how to access mDefense (Monster defense)
    public static int attack(Monster grr) {
	 
	int damage = (int) (strength * aRate) - grr.getDefense();
	if (damage <= 0)
	    return 0;
	grr.lowerHP(damage);
     	return damage;
    }

    //prepares Protagonist for special attack
    public static void specialize() {
	aRate += 2.5;
	if (defense <= 0)
	    defense = 0;
	else
	    defense -= 1;
    }

    //prepares Protagonist for normal attack
    public static void normalize() {
	aRate = 2.5;
	defense = 5;
    }
}
