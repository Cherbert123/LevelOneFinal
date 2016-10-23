import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigConverterRunner  implements ActionListener{
	PigLatinConverter thing = new PigLatinConverter();
	JTextField input = new JTextField();
	JTextField output = new JTextField();
public static void main(String[] args) {
	
	PigConverterRunner runner = new PigConverterRunner();
	
}
public PigConverterRunner(){
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trans = new JButton("Translate");
	frame.add(panel);
	input.setColumns(20);
	output.setColumns(20);
	output.setEditable(false);
	trans.addActionListener((ActionListener) this);
	panel.add(input);
	panel.add(trans);
	panel.add(output);
	frame.setVisible(true);
	frame.setTitle("Pig Latin Converter");
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
String out = thing.translate(input.getText());
output.setText(out);
}
	
	
}
