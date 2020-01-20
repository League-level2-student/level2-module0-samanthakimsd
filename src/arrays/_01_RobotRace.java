package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] r = new Robot[5];
		// 3. use a for loop to initialize the robots.
		int x = 100;
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing up

			r[i].setY(550);
			r[i].setX(x);
			x = x + 150;
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random randy = new Random();
		for (int j = 0; j < r.length; j++) {
			int y = randy.nextInt(50);
			r[j].move(y);}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		
		while(r[0].getY()<0 || r[1].getY()<0|| r[2].getY()<0|| r[3].getY()<0|| r[4].getY()<0) {
			for (int j = 0; j < r.length; j++) {
				int y = randy.nextInt(50);
				r[j].move(y);
				}
}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
