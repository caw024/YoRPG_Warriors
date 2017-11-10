//Warriors
//APCS1 pf 8
//HW#28 --Ye olde Role Playing Game'
//2017-11-8

public class Monster {

    //Attributes
    private static String name;
    private static int life;
    private static int strength;
    private static int defense;
    private static double aRate;


    //Constructor
    public Monster() {
	name = "Ghost";
	life = 150;
	strength = (int) (Math.random() * 46) + 20 ;
	defense = 20;
	aRate = 1;
    }

    //returns boolean indicating living/dead
    public static boolean isAlive() {
	if (life == 0)
	    return false;
	return true;
    }

    //returns defense attribute
    public static int getDefense() {
	return defense;
    }

    //returns name attribute
    public static String getName() {
	return name;
    }

    //decreases life by parameter
    public static int lowerHP(int n) {
	return life -= n;
    }

    //calculates attack
    public static int attack(Protagonist prot) {
    	int damage; 
    	if (aRate < 0) 
    		damage = 0;
    	else 
    		damage = (int) (strength * aRate) - prot.getDefense();
    	prot.lowerHP(damage);
    	return damage;
    }

}
