
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "April 25th";
		String dadsBirthday = "November 15th";
		String myBirthday = "November 28";

		// 2. Find out which birthday the user wants and and store their response in a variable
		
		String response = JOptionPane.showInputDialog("What birthday do you want to see?");
		
		if (response.equals("Mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		if (response.equals("Dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		if (response.equals("Ella")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry I don't remember that person's birthday!");
		}
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
