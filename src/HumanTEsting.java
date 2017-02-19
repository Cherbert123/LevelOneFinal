import java.util.Random;

import javax.swing.JOptionPane;

public class HumanTEsting {
public static void main(String[] args) {
	int tries = 0;
	Random random = new Random();
	String UserNum1 = JOptionPane.showInputDialog("Type a Random Number Between 0 and 100");
	int user1 = Integer.parseInt(UserNum1);
	String UserNum2 = JOptionPane.showInputDialog("Type Another Random Number Between 0 and 100");
	int user2 = Integer.parseInt(UserNum1);
	String UserNum3 = JOptionPane.showInputDialog("Type Another (Please?) Random Number Between 0 and 100");
	int user3 = Integer.parseInt(UserNum1);
	if (user1 < 101 & user2 < 101 & user3 < 101) {
	for (int i = 0; i < 1000000 ; i++) {
		int rand = random.nextInt(101);
			if(user1 ==rand || user2 == rand || user3 == rand){
				tries = tries + 1;
				
			}
		}
		JOptionPane.showMessageDialog(null, "You Win?    Wins Out Of A Million: " + tries);
	}
	
	
	
}
}
