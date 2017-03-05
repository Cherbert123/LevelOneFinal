import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Reversery implements ActionListener {
	JButton butt = new JButton("Reverse");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JTextField input = new JTextField(19);
public static void main(String[] args) {
	Reversery start = new Reversery();
	start.setup();
	
}
public void setup(){
	frame.add(panel);
	panel.add(input);
	input.setEditable(true);
	panel.add(butt);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	butt.addActionListener(this);
}
public void actionPerformed(ActionEvent arg0) {
	System.out.println("Working");
	String word = input.getText(); 
	String Wreturn = "";
	for (int i = word.length() - 1 ; i >= 0; i--) {
	 Wreturn = Wreturn + word.charAt(i);
		
	}
	JOptionPane.showMessageDialog(null, Wreturn);
	
}
}
