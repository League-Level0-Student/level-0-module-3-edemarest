import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		
		String sign = JOptionPane.showInputDialog("What is your star sign?");
		
		if (sign.contentEquals("Aries")) {
			JOptionPane.showMessageDialog(null, "Those born under the Aries zodiac sign \n often have an exciting and enthusiastic energy. \n They often seek new and challenging adventures that can push their limits. \n They are driven, ambitious and curious, and aries \n tends to have a strong sense of justice. They love competition, \n in all its forms. They are generally quite optimistic, and they \n love being placed in leadership positions.");
		}
		
	}
}
