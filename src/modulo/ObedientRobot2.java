package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot2 {
	public static void main(String[] args) {
	
		String shape = JOptionPane.showInputDialog("What shape do you want?");
		if(shape.equals("square")) {
		drawSquare();
		}
		if(shape.equals("circle")) {
		drawCircle();
		}
		if(shape.equals("triangle")) {
		drawTriangle();
		}
	}
	static void drawSquare() {
		Robot walle = new Robot();	
		walle.penDown();
		walle.setSpeed(100);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);		
		walle.move(100);
		walle.turn(90);	
		walle.move(100);
		walle.turn(90);
	}
	
	static void drawTriangle() {
		Robot walle = new Robot();	
		walle.penDown();
		walle.setSpeed(100);
		walle.move(100);
		walle.turn(120);
		walle.move(100);
		walle.turn(120);		
		walle.move(100);
		walle.turn(120);	
	}
	
	static void drawCircle() {
		Robot walle = new Robot();	
		walle.penDown();
		walle.setSpeed(100);
		for (int i = 0; i < 360; i++) {
		walle.move(1);
		walle.turn(1);
	}
	
	}
}
