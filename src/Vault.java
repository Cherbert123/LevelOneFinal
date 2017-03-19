import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	Random random = new Random();
	int partOne = random.nextInt(999);
	int partTwo = random.nextInt(9999);
	int partThree = random.nextInt(99);
public static void main(String[] args) {
Vault vault = new Vault();
vault.setup();
}
public void setup(){
	for (int i = 0; i <= partOne ; i++) {
		System.out.println(i + "-" + "****-**");
	}
	for (int i = 0; i <= partTwo; i++){
		System.out.println(partOne + "-" + i + "-**");
	}
	for (int i = 0; i <= partThree; i++) {
		System.out.println(partOne + "-" + partTwo + "-" + i);
	}
	
	JOptionPane.showMessageDialog(null, partOne + "-" + partTwo + "-" + partThree);

}
}
