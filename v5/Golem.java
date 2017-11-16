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
	life = 150;
	strength = 5;
	defense = 20;
	aRate = 2.5;
    }

    //returns name attribute
    public String getName() {
	return name;
    }
    
    public String about() {
	return "This monster is a Golem with " + life + " HP, " + aRate + "attack rate, and "  + defense + " defense.";
    }  
}
