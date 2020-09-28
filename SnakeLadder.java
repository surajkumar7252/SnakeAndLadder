
/*
 * This is a Snake and Ladder Game.
 */
public class SnakeLadder {
	
		
		
	    public static void main(String[] args) {
	   
	    int MAX =6,MIN=1;
		int counter=0 , position=0;                                      // sets the counter and position as zero initially.
		int snake[]= {25,29,42,63,64,70,94,96,99};                       //Fixes the start point of Snake.
		int snakeFall[]= {4,10,22,59,37,49,73,47,78};                    //Fixes the end point of Snake.
		int ladder[]= {2,8,26,31,38,41,56,69,79};                        //Fixes the start point of Ladder.
		int ladderClimb[]= {23,14,35,86,44,60,77,90,81};                 //Fixes the End Point of Ladder.
		
		System.out.println("YOUR POSITION AT THE START : "+ position);   //prints position at the start.
		for(counter=0;position!=100;++counter)                           //Main for loop begins.
		{
		int getDice=MIN+(int)Math.floor(Math.random()*((MAX-MIN)+1));            //gets a random number between 1 and 6.
		System.out.println("You Got:" +getDice);                         // prints the number obtained on rolling the dice .
		position= position + getDice;                                    //sets position after rolling the dice.
		if(position==100)                                                //checks if the End is reached.
		{
			System.out.println("Game Over");
			break;
		}
		if(position>100)                                                 //checks if position is greater than 100,if true,sets the position value prior to rolling.
		{
			position=position-getDice;
		}
		for(int i=0;i<9;i++)                                            // checks if the position we got has any snake or ladder.
		{
			if(position==snake[i])
			{
				position = snakeFall[i];                                // sets the position after snake bite.
				System.out.println("Poor Boy, A snake welcomed you.");
			}
			if(position==ladder[i])
			{
				position = ladderClimb[i];                               //sets the position after Ladder.
				System.out.println("Hurray,Its a Ladder");
			}
		}
		
		System.out.println("Your current Position: "+ position);         //Prints the current position.
		
			
		}System.out.println("You took "+ counter+" steps to reach 100" );  //Prints the total number of rolls that we rolled.
		
	}
	}


