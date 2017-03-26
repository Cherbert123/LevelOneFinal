import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UncontrolledRandomness implements ActionListener {
	String savedNum = "";
	Random ran = new Random();
	int random;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton green = new JButton();
	JButton red = new JButton();
	JButton yellow = new JButton();
	static UncontrolledRandomness setup = new UncontrolledRandomness();
	JButton blue = new JButton();
	int length = savedNum.length();
	int clicks = 0;
public static void main(String[] args) {
	
	setup.gui();
	setup.setup();
}
public void setup(){

	
		random = ran.nextInt(4);
		savedNum = savedNum + random;
		length = savedNum.length();
		if(random == 0){
			blue.setBackground(Color.blue);
		} else if(random == 1) {
			yellow.setBackground(Color.yellow);
		} else if(random == 2) {
			red.setBackground(Color.red);
		} else if(random == 3) {
			green.setBackground(Color.green);
		}
		System.out.println(savedNum);	
	
	
}
public void gui(){
	frame.add(panel);
	panel.add(green);
	green.setOpaque(true);
	green.addActionListener(this);
	red.addActionListener(this);
	yellow.addActionListener(this);
	blue.addActionListener(this);
	panel.add(red);
	red.setOpaque(true);
	panel.add(yellow);
	yellow.setOpaque(true);
	panel.add(blue);
	blue.setOpaque(true);
	frame.pack();
	frame.setVisible(true);frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(clicks < length){
	int ToClick = savedNum.charAt(clicks);
	if(e.getSource() == yellow && ToClick == 49){
		System.out.println("Yes");
	} else if(e.getSource() == blue && ToClick == 48){
		System.out.println("Yes");
	} else if(e.getSource() == red && ToClick == 50){
		System.out.println("Yes");
	} else if(e.getSource() == green && ToClick == 51){
		System.out.println("Yes");
	}
	} else {
		setup.setup();
	}
}
}
