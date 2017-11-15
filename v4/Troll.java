//Team Warriors
//APCS1 pd 8
//HW #31 -- Ye Olde Role Playing Game, Expanded 
//2017-11-13

/*
public class Troll extends Monster {

    //Constructor
    public Troll() {
	strength = 20;
    }
}
*/public class Troll extends Monster{

    //Attributes
    protected String name;
    protected int life;
    protected int strength;
    protected int defense;
    protected double aRate;


    //Constructor
    public Troll() {
	name = "Troll";
	life = 150;
	strength = (int) (Math.random() * 10) + 20 ;
	defense = 15;
	aRate = 1;
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
	abt += "This monster is a Troll with " + life + " HP, " + aRate + "attack rate, and " + defense + " defense.";
	return abt;
    }
    */

}
