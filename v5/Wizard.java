public class Wizard extends Protagonist {

    //Constructor
    public Wizard(String newname) {
	super(newname);
<<<<<<< HEAD
	defense = 20;
    }

public String about() {
return "The wizard has four times the defense as other characters.";
}

public void normalize() {
aRate = 2.5;
defense = 20;
}

public void specialize() {
aRate += 2.5;
=======
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
>>>>>>> b22656d350b9087ed38a0ca2a5a6a0ceb6487d61
	if (defense <= 0)
	    defense = 0;
	else
	    defense -= 1;

<<<<<<< HEAD
}
=======
    }
>>>>>>> b22656d350b9087ed38a0ca2a5a6a0ceb6487d61
}
