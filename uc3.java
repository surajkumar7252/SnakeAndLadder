/*
 * This is a Snake and Ladder Game UC 3.
 */
public class uc3 {


	
		
		
	    public static void main(String[] args) {
	   
	    int MAX =6,MIN=1,max=3,min=1;
		int  position=0;                                      // sets the counter and position as zero initially.
		
		System.out.println("YOUR POSITION AT THE START : "+ position);   //prints position at the start.
		
		int getDice=MIN+(int)Math.floor(Math.random()*((MAX-MIN)+1));            //gets a random number between 1 and 6.
		System.out.println("You Got:" +getDice);                         // prints the number obtained on rolling the dice .
		position= position + getDice;                                   //sets position after rolling the dice.
		int option =(int) (min+Math.random()*((max - min) + 1));
		
		switch(option)
		{
		case 1 : position=position+0; 
		         break;
		case 2 : System.out.println("You met a snake");
		         position=position-getDice;
		         break;
		case 3: System.out.println("You got a ladder");
		        position=position+getDice;
		        break;
		}
		System.out.println("Your current Position: "+ position);         //Prints the current position.
		
			
		}
	}
	




