import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dicey implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton joke = new JButton("Roll a Dice");

public static void main(String[] args) {
	Dicey cc = new Dicey();
	cc.build();

}

public void build() {
	frame.add(panel);
	panel.add(joke);
	frame.setVisible(true);
	frame.pack();
	joke.addActionListener((ActionListener) this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if (buttonPressed == joke) {
		Random ran = new Random();
		int rand = ran.nextInt(6);
		rand++;
		JOptionPane.showMessageDialog(null, "The Dice Landed On: " + rand);
	}
	
}
}
