package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffii {

	public static void main(String[] args) {
		Robot Luis = new Robot();
		Luis.setSpeed(50);
		Luis.setX(200);
		Luis.setY(250);
		Luis.turn(180);
		Luis.penDown();
		Luis.move(100);
		Luis.turn(-90);
		Luis.move(100);
		Luis.setX(375);
		Luis.turn(-90);
		Luis.move(100);
		Luis.turn(180);
		Luis.move(100);
		Luis.turn(-90);
		Luis.move(100);
		Luis.turn(-90);
		Luis.move(100);
		Luis.setX(550);
		Luis.turn(180);
		Luis.move(100);
		Luis.setX(600);
		Luis.turn(-90);
		Luis.move(100);
		Luis.turn(-90);
		Luis.move(50);
		Luis.turn(-90);
		Luis.move(100);
		Luis.turn(90);
		Luis.move(50);
		Luis.turn(90);
		Luis.move(100);

	}
}
