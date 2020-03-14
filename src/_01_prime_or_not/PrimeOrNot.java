package _01_prime_or_not;
import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog(null, "Type any positive number?");
		int fortnite = Integer.parseInt(num);
		for(int mo = 2; mo < fortnite; mo++) {
			if(fortnite%mo==0) {
			JOptionPane.showMessageDialog(null, "It isn't prime");
			break;
		}
		}
		JOptionPane.showMessageDialog(null, "Wow," + fortnite + " is prime");
		

}}
