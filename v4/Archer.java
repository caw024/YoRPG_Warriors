//Team Warriors
//APCS1 pd 8
//HW #31 -- Ye Olde Role Playing Game, Expanded 
//2017-11-13

public class Archer extends Protagonist {

    //Constructor
    public Archer(String newname) {
	super(newname);
	strength = 20;
    }

    public void specialize() {
	aRate += 2.5;
	if (defense <= 0)
	    defense = 0;
	else
	    defense -= 1;
    }
}
