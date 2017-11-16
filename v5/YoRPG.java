/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/


import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Protagonist and a Monster will be instantiated...
    private Protagonist pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Protagonist
      =============================================*/
    public void newGame()
    {
	String s;
	String name = "";
	int i = 1;
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	//instantiate the player's character
    
	try {
	    System.out.println( "\nWhat are you?" );
	    System.out.println( "\t1: Warrior" );
	    System.out.println("\t2: Wizard");
	    System.out.println("\t3: Archer");
	    i = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	if (i == 1)
	    pat = new Warrior(name);
	if (i == 2)
	    pat = new Wizard(name);
		if (i == 3)
	    pat = new Archer(name);
    

    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Protagonist pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;
	int d1 = 0;
	int d2 = 0;
	boolean flee = true;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    if ( (int) (Math.random() * 3) < 3){
		smaug = new Zombie();
	    }

	    while((smaug.isAlive() && flee) && pat.isAlive() ) {


		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {

		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );


		    System.out.println( "\nHow to deal with Monster:" );
		    System.out.println( "\t1: Special\n\t2: Normal\n\t3: Flee (1/4)\n\t4. Intimidate (1/3)" );
		    i = Integer.parseInt( in.readLine() );
		}
		
		if ( i == 1 ){
		    pat.specialize();
		    d1 = pat.attack( smaug );
		    d2 = smaug.attack( pat );
		}
		
		if ( i == 2 ){
		    pat.normalize();
		    d1 = pat.attack( smaug );
		    d2 = smaug.attack( pat );
		}
		
		if ( i == 3 ){
		    if ((int)(Math.random()*4 )== 2){
			System.out.println("\nFlee success");
			d1 = 0;
			d2 = 0;
			flee = false;
		    }
		    else{
			d1 = 0;
			d2 = smaug.attack( pat );
			System.out.println("\nThy cowardice has cost you");
		    }
		}

	        if (i == 4){
		    if ((int)(Math.random()*3) == 1){
			System.out.println("\nScary face is on point!");
			d1 = pat.attack( smaug );
			d2 = 0;
		    }
		    
		    else{
			d1 = 0;
			d2 = smaug.attack( pat );
			System.out.println("\nScary face needs more work.");
		    }
		}
		    
		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "\n" + smaug.getName() + " smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args )
    {
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...

    
	//loading...
	YoRPG game = new YoRPG();
  
	int encounters = 0;
    
	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );
	 
    }//end main

}//end class YoRPG


