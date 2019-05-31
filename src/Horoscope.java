import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		
		String sign = JOptionPane.showInputDialog("What is your star sign?");
		
		if (sign.contentEquals("Aries")) {
			JOptionPane.showMessageDialog(null, "Those born under the Aries zodiac sign "
					+ "\n often have an exciting and enthusiastic energy. \n They often "
					+ "seek new and challenging adventures that can push their limits. "
					+ "\n They are driven, ambitious and curious, and aries \n tends"
					+ " to have a strong sense of justice. They love competition, "
					+ "\n in all its forms. They are generally quite optimistic, "
					+ "and they \n love being placed in leadership positions.");
		}
		if (sign.contentEquals("Taurus")) {
			JOptionPane.showMessageDialog(null, "Smart, ambitious, and trustworthy, Taurus is the anchor of the Zodiac. \n Amazing friends, colleagues, and partners, Taureans value honesty above all else and are proud \n that their personal relationships tend to be drama free. Bulls get the reputation of being stubborn, but they're \n not always stuck in their ways. This searching sign is willing to see another point of view, but they won't \n flip-flop on an opinion just to make someone else happy. \n They will shift their thinking only if they truly have a change of heart.");
		}
		if (sign.contentEquals("Gemini")) {
			JOptionPane.showMessageDialog(null, "Smart, passionate, and dynamic, Gemini is characterized by the Twins, Castor and Pollux, \n and is known for having two different sides they can display to the world. Expert communicators, \n Gemini is the chameleon of the Zodiac, adept at blending into different groups based on the vibe and energy they perceive. \n While they're also amazing at showcasing surface traits, the Gemini well runs deep, \n which is why the Twins are one of the Zodiac's most emotionally intelligent signs.");
		}
		if (sign.contentEquals("Cancer")) {
			JOptionPane.showMessageDialog(null, "Emotional, intuitive, and practically psychic; ruled by the moon \n and characterized by the crab, Cancer has so much going on in its watery depths. \n Cancers may seem prickly and standoffish at first meeting, once they make the decision to become \n friends with someone, that person has a friend for life.");
		}
		if (sign.contentEquals("Leo")) {
			JOptionPane.showMessageDialog(null, "Bold, intelligent, warm, and courageous, fire sign Leo is a natural leader of the Zodiac, \n ready to blaze a trail, vanquish injustice, \n and make a name for themselves along the way.");
		}
		if (sign.contentEquals("Virgo")) {
			JOptionPane.showMessageDialog(null, "Smart, sophisticated, and kind, Virgo gets the job done without complaining. ");
		}
		if (sign.contentEquals("Libra")) {
			JOptionPane.showMessageDialog(null, "Intelligent, kind, and always willing to put others before themselves, Libras value harmony in all forms. ");
		}
		if (sign.contentEquals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Passionate, independent, and unafraid to blaze their own trail no matter what others think, Scorpios make a statement wherever they go.");
		}
		if (sign.contentEquals("Saggitarius")) {
			JOptionPane.showMessageDialog(null, "Independent and strong-willed, Sagittarius personalities are all about going off the beaten path.");
		}
		else {
			JOptionPane.showMessageDialog(null, "That's not a star sign, or I was too lazy to add it");
		}
	}
}
