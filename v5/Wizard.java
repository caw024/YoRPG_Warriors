public class Wizard extends Protagonist {

    //Constructor
    public Wizard(String newname) {
	super(newname);
	defense = 15;
    }

    public String about() {
	return "The wizard has three times the defense as other characters.";
    }

    public void normalize() {
	aRate = 5;
	defense = 15;
    }

    public void specialize() {
	aRate += 2.5;
	if (defense <= 0)
	    defense = 0;
	else
	    defense -= 1;

    }
}
