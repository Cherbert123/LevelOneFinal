import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

/*
1. have the tortoise start in the bottom left corner

2. draw a house of height 100 with grass after it. This shape: |**|_

3. extract the piece of code that draws the house into a method. Draw 10 houses.

4. Change the method to take int height as a parameter. Draw 9 houses of different heights

5. Make the method take a String instead of a height. 	
	
“small” 		60
“medium”	 	120
“large”			250

6. Make the method take a color as well as a height. The houses are drawn in that color.

[optional] Set the scene to night time by setting the background to black using Tortoise.getBackgroundWindow().setColor

7. Give the houses peaked roofs

8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”.

9. make large houses have flat rooves
*/





public class Houses {
	

	public static void main(String[] args) {
		Tortoise.setX(20);
		Tortoise.setY(415);
		for (int i = 0; i < 15; i++) {
			 Random ranNum = new Random();
			 int ran = ranNum.nextInt(3);
			
			House(ran, ranNum);
		}
		Tortoise.setX(20);
		Tortoise.setY(435);
		
			}
	public static void House(int ranHouse,Random ranNum){
		Tortoise.setSpeed(10);
		int Size = 0;
		String SizeString = "large";
		if (ranHouse == 0){
			SizeString = "small";
		} else if (ranHouse == 1){
			SizeString = "medium";
		} else if (ranHouse == 2){
			SizeString = "large";
		}
		
		if(SizeString.equals("small")){
			Size = 60;
		}else if(SizeString.equals("medium")){
			Size = 120;
		}else if(SizeString.equals("large")){
			Size = 250;
		}
		Tortoise.setPenColor(new Color(ranNum.nextInt(256),ranNum.nextInt(256),ranNum.nextInt(256)));
		Tortoise.move(Size);
		Tortoise.turn(45);
		Tortoise.move(30);
		Tortoise.turn(90);
		Tortoise.move(30);
		Tortoise.turn(45);
		Tortoise.move(Size);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(35);
		Tortoise.turn(-90);
	}

}
