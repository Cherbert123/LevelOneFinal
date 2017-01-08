import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton joke = new JButton("Joke");
	JButton punch = new JButton("Punchline");

	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.build();

	}

	public void build() {
		frame.add(panel);
		panel.add(joke);
		panel.add(punch);
		frame.setVisible(true);
		frame.pack();
		joke.addActionListener(this);
		punch.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == joke) {
			JOptionPane.showMessageDialog(null, "What is first in earth and second in heaven");
		}
		else if (buttonPressed == punch) {
			JOptionPane.showMessageDialog(null, "E");
		}
	}
}
