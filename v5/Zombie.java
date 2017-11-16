//Warriors
//APCS1 pf 8
//HW#28 --Ye olde Role Playing Game'
//2017-11-8

public class Zombie extends Monster{

    //Attributes
    protected String name;
    protected int life;
    protected int strength;
    protected int defense;
    protected double aRate;


    //Constructor
    public Zombie() {
	name = "Zombie";
	life = 200;
	strength = (int) (Math.random() * 30) + 20 ;
	defense = 10;
	aRate = 1;
    }

    //returns name attribute
    public String getName() {
	return name;
    }

    public String about() {
	return "This monster is a Zombie with " + life + " HP, " + aRate + "attack rate, and " + defense + "defense.";
    }
}