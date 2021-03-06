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
	strength = 5;
	defense = 5;
	aRate = 2.5;
    }

    //returns name attribute
    public String getName() {
	return name;
    }

    public String about() {
	return "This monster is a Troll with " + life + " HP, " + aRate + "attack rate, and " + defense + " defense.";

    }
}
