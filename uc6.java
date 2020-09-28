
/*
	 * This is a Snake and Ladder Game UC 6.
	 */
public class uc6 {
	
	
            public static void main(String[] args) {
		   
		    int MAX =6,MIN=1,max=3,min=1;
			int counter=0, position=0,getDice;                                      // sets the counter and position as zero initially.
			
			System.out.println("YOUR POSITION AT THE START : "+ position);   //prints position at the start.
			for(int c=0;position<=100;++c)                           //Main for loop begins.
			{
				++counter;
			 getDice=(int)(MIN+(Math.random()*((MAX-MIN)+1)));            //gets a random number between 1 and 6.
			System.out.println("You Got:" +getDice);                         // prints the number obtained on rolling the dice .
			position= position + getDice;                                    //sets position after rolling the dice.
			
			int option =(int) (min+Math.random()*((max - min) + 1));
			if(position>100)
			{
				position=position-getDice;break;
			}
			else
			{
				
			
			switch(option)
			{
			case 1 : System.out.println("This is a no play case");
				     position=position+0; 
			         break;
			case 2 : System.out.println("You met a snake");
			         position=position-getDice;
			         break;
			case 3: System.out.println("You got a ladder");
			        position=position+getDice;
			        break;
			}
			}
			if(position<0)
			{
				position=0;
			}
			
			
			System.out.println("Your current position"+ position);
			
			}
			System.out.println("Your current Position: "+ position);         //Prints the current position.
			
			System.out.println("Total Number of rolls: "+counter);	
			}
		}
		






