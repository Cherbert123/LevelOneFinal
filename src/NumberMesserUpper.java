import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberMesserUpper implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton doubler = new JButton("Double");
	JButton squarer = new JButton("Square");
	JTextField enter = new JTextField(16);
public static void main(String[] args) {
	NumberMesserUpper setup = new NumberMesserUpper();
	setup.setup();
	
}
public void setup(){
	frame.add(panel);
	panel.add(enter);
	panel.add(doubler);
	panel.add(squarer);
	frame.pack();
	enter.setEditable(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	doubler.addActionListener(this);
	squarer.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == doubler){
		
		String num = "" + Integer.parseInt(enter.getText()) * 2;
		enter.setText(num);
	} else if (e.getSource() == squarer){
		String num = "" + Integer.parseInt(enter.getText()) * Integer.parseInt(enter.getText());
		enter.setText(num);
	}
	
}
}
