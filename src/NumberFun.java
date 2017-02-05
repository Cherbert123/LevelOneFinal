import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumberFun implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton addi = new JButton();
	JButton sub = new JButton();
	JButton random = new JButton();
	JLabel numberDis = new JLabel();
	int num = 1;
	Random ran = new Random();

	public static void main(String[] args) {
		NumberFun f = new NumberFun();
		f.setup();
	}

	public void setup() {

		frame.add(panel);
		panel.add(addi);
		panel.add(sub);
		panel.add(random);
		panel.add(numberDis);
		frame.setVisible(true);
		frame.pack();
		addi.addActionListener(this);
		sub.addActionListener(this);
		random.addActionListener(this);
		addi.setText("Add!");
		sub.setText("Subtract!");
		random.setText("Randomize");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == addi) {
			num++;
			String s = "" + num;
			numberDis.setText(s);
		}
		if (buttonPressed == sub) {
			num--;
			String s = "" + num;
			numberDis.setText(s);
		}
		if (buttonPressed == random) {
			num = ran.nextInt();
			String s = "" + num;
			numberDis.setText(s);
		}
	}
}
