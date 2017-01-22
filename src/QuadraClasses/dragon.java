package QuadraClasses;
import java.util.Random;

import javax.swing.JOptionPane;

public class dragon {
String name;
int longestBreath;
String type;
Random rand=new Random();
int randInt =rand.nextInt(10);
public dragon(String name, int longestBreath,String type){
	this.name=name;
	this.longestBreath=longestBreath;
	this.type=type;
}
public boolean killAKnight(){
	if (longestBreath> randInt) {
		JOptionPane.showMessageDialog(null, name+"succeeded int killing a level "+randInt+" knight.");
		return true;
	}
	else{
	return false; 
	}
}
}
