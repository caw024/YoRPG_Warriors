public class Archer extends Protagonist{

    //Constructor
    public Archer(String newname) {
	super(newname);
<<<<<<< HEAD
	aRate = 5;
    }

public String about() {
return "The Archer has twice the attack rate as the other characters.";
}

public void normalize() {
aRate = 5;
defense = 5;
}

public void specialize() {
aRate += 2.5;
=======
	aRate = 10;
    }

    public String about() {
	return "The Archer has twice the attack rate as the other characters.";
    }

    public void normalize() {
	aRate = 10;
	defense = 5;
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
