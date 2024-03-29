// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class Starz {

	public static void main(String[] args) {
		
		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
		int X=0;
		int Y=250;
		Tortoise.penUp();
		Tortoise.setX(X);
		Tortoise.setY(Y);
		Tortoise.show();
		Tortoise.setSpeed(10);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		Tortoise.penDown();
		for(int i=0; i<5; i++) {
			Tortoise.turn(144);
			Tortoise.move(30);
		}
		
		// 3. Set the size of the star to 30.
		while(1==1) {
			Tortoise.penUp();
			X+=50;
			Tortoise.setX(X);
			Tortoise.penDown();
			for(int i=0; i<5; i++) {
				Tortoise.turn(144);
				Tortoise.move(30);
			}
		}
		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}


