package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	

	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.

	 Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}

		Thread r1 = new Thread(() -> runner(robots[0]));
	Thread r2 = new Thread(() -> runner(robots[1]));
	Thread r3 = new Thread(() -> runner(robots[2]));
	Thread r4 = new Thread(() -> runner(robots[3]));
	Thread r5 = new Thread(() -> runner(robots[4]));
		
		
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i].setX(i * 100 + 50);
			robots[i].setY(520);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean raceComplete = false;
		while (raceComplete == false) {
			/*
			 * for (int i = 0; i < robots.length; i++) { Random rand = new Random(); int
			 * random = rand.nextInt(49); robots[i].setSpeed(6); robots[i].move(random);
			 */
			for (int i = 0; i < robots.length; i++) {
				if (robots[i].getY() < 20) {
					raceComplete = true;

					System.out.println("The robot " + i + " has won!");
					break;
				}
			}

			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start();

		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}

	public static void runner(Robot r) {
		Random rand = new Random();
		int m = rand.nextInt(50);
		r.move(m);

	}

}
