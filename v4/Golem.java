//Team Warriors
//APCS1 pd 8
//HW #31 -- Ye Olde Role Playing Game, Expanded 
//2017-11-13

public class Golem extends Monster{

    //Attributes
    protected String name;
    protected int life;
    protected int strength;
    protected int defense;
    protected double aRate;


    //Constructor
    public Golem() {
	name = "Golem";
	life = 100;
	strength = (int) (Math.random() * 20) + 20 ;
	defense = 0;
	aRate = 1.5;
    }

    //returns boolean indicating living/dead
    public boolean isAlive() {
	if (life <= 0)
	    return false;
	return true;
    }

    //returns defense attribute
    public int getDefense() {
	return defense;
    }

    //returns name attribute
    public String getName() {
	return name;
    }

    //decreases life by parameter
    public int lowerHP(int n) {
	return life -= n;
    }

    //calculates attack
    public int attack(Protagonist prot) {
    	int damage; 
    	if (aRate < 0) 
    		damage = 0;
    	else 
    		damage = (int) (strength * aRate) - prot.getDefense();
    	prot.lowerHP(damage);
    	return damage;
    }
    /*
    public String about() {
	String abt = "";
	abt += "This monster is a Golem with " + life + " HP, " + aRate + "attack rate, and "  + defense + " defense.";
	return abt;
    }
    */
}
