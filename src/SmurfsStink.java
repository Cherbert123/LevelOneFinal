import javax.swing.JOptionPane;

/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class SmurfsStink {

	private String name;

	SmurfsStink(String name) {
		this.name = name;
	}

	public SmurfsStink() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		JOptionPane.showMessageDialog(null, name + " is eating smurffberries");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if(name.equals("Papa")){
			JOptionPane.showMessageDialog(null, name + "'s hat is red");
		} else{
			JOptionPane.showMessageDialog(null, name + "'s hat is white");
		}
		return "";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if(name.equals("Smurfette")){
			JOptionPane.showMessageDialog(null, name + " is a girl");
		} else{
			JOptionPane.showMessageDialog(null, name + " is a boy");
		}
		return "";
	}

}



