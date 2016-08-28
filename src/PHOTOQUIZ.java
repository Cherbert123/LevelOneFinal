 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PHOTOQUIZ {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		String Pic = "https://www.cesarsway.com/sites/newcesarsway/files/styles/large_article_preview/public/How%20to%20calm%20a%20hyper%20dog.jpg?itok=Vg7ueySi";
		Component PicImage;
		PicImage = createImage(Pic);
		quizWindow.add(PicImage);
		quizWindow.pack();
		String Answer = JOptionPane.showInputDialog("What Animal is this?");
		if (Answer.equals("Dog")){
			String Pic2 = "https://i1.sndcdn.com/artworks-000053665321-q3fay5-t500x500.jpg";
			Component Pic2Image;
			Pic2Image = createImage(Pic2);
			quizWindow.remove(PicImage);
			quizWindow.add(Pic2Image);
			quizWindow.pack();
			Answer = JOptionPane.showInputDialog("Correct! What is this?");
			if (Answer.equals("Spork")){
				String Pic3 = "http://www.myw-cms.it/amm/immagini/0002/prodotti/4543_imgscheda_hamburger-png.PNG";
				Component Pic3Image;
				Pic3Image = createImage(Pic3);
				quizWindow.remove(Pic2Image);
				quizWindow.add(Pic3Image);
				quizWindow.pack();
				Answer = JOptionPane.showInputDialog("Correct! What is this?");
				if(Answer.equals("Hamburger")){
					JOptionPane.showMessageDialog(null, "Correct! You Win!");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect, Try again.");
				}

				
			} else{
				JOptionPane.showMessageDialog(null, "Incorrect, Try again.");
			}

			
		} else{
			JOptionPane.showMessageDialog(null, "Incorrect, Try again.");
		}
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		// 10. find another image and create it (might take more than one line of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





