import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		
		String firstres = JOptionPane.showInputDialog("Are you happy?");
		
		if (firstres.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");	
		}
		if (firstres.equals("no")) {
			String secondres = JOptionPane.showInputDialog("Do you want to be happy?");
			if (secondres.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			if (secondres.contentEquals("no")) {
				JOptionPane.showMessageDialog(null,  "Keep doing whatever you're doing");
			}
		}
		
		
		
	
		
	}
	
}
