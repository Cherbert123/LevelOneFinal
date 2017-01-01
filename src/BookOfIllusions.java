import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}
	JFrame frame = new JFrame();
	JLabel label;
	int il = 1;
	// 1. Make a JFrame variable and initialize it using "new JFrame()"

	private void createBook() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		String illusion = "illusion1.jpg";
		String illusion2 = "illusion2.jpg";
		
		label = loadImageFromComputer(illusion);
		frame.add(label);
		frame.pack();
		frame.addMouseListener(this);
		// 2. make the frame visible
		// 3. set the size of the frame
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		// 7. use the "loadImage..." methods below to initialize your JLabel
		// 8. add your JLabel to the frame
		// 9. call the pack() method on the frame
		// 10. add a mouse listener to your frame (hint: use *this*)
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("clicked!");
		frame.remove(label);
		String illusion = "illusion1.jpg";
		String illusion2 = "illusion2.jpg";
		if(il == 1){
			il = 2;
			label = loadImageFromComputer(illusion2);
		}else{
			il = 1;
			label = loadImageFromComputer(illusion);
		}
		
		
		frame.add(label);
		frame.setVisible(true);
		frame.pack();
		// 11. Print "clicked!" to the console when the mouse is pressed
		// 12. remove everything from the frame that was added earlier
		// 13. load a new image like before (this is more than one line of code)
		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
