//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		
		//3. Ask the user what color they would like the robot to draw
		
		//5. Use an if/else statement to set the pen color that the user requested

        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)

		
		Robot walle = new Robot();
		
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		
		if (color.equals("red")) {
		walle.setPenColor(Color.RED);
		walle.setPenWidth(10);
		walle.penDown();
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		}
		if (color.equals("orange")) {
		walle.setPenColor(Color.ORANGE);
		walle.setPenWidth(10);
		walle.penDown();
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		}
		if (color.equals("yellow")) {
		walle.setPenColor(Color.YELLOW);
		walle.setPenWidth(10);
		walle.penDown();
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		}
		if (color.equals("green")) {
		walle.setPenColor(Color.GREEN);
		walle.setPenWidth(10);
		walle.penDown();
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		}
		if (color.equals("blue")) {
		walle.setPenColor(Color.BLUE);
		walle.setPenWidth(10);
		walle.penDown();
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		}
		if (color.equals("pink")) {
		walle.setPenColor(Color.PINK);
		walle.setPenWidth(10);
		walle.penDown();
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		}
		
		else {
			walle.setRandomPenColor();
			walle.setPenWidth(10);
			walle.penDown();
			walle.move(100);
			walle.turn(90);
			walle.move(100);
			walle.turn(90);
			walle.move(100);
			walle.turn(90);
			walle.move(100);
			walle.turn(90);
		}

	}
}
