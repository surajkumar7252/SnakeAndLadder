/*
 * This is a Snake and Ladder Game UC 2.
 */
public class uc2 {



		
		 public static void main(String[] args) {
	   
	    int MAX =6,MIN=1;
		int  position=0;                                      // sets the counter and position as zero initially.
		
		System.out.println("YOUR POSITION AT THE START : "+ position);   //prints position at the start.
		
		int getDice=MIN+(int)Math.floor(Math.random()*((MAX-MIN)+1));            //gets a random number between 1 and 6.
		System.out.println("You Got:" +getDice);                         // prints the number obtained on rolling the dice .
		position= position + getDice;                                    //sets position after rolling the dice.
		
		System.out.println("Your current Position: "+ position);         //Prints the current position.
		
			
		
	}
	}




