import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWOrld {

public static void main(String[] args) {
	Random rand = new Random();
	Random rand2 = new Random();
	int r = rand.nextInt(8);
	int r2 = rand2.nextInt(8);
	int x = 0;
	int y = 0;
	World world = new World();
	world.show();
	Bug bug = new Bug();
	Flower flower = new Flower();
	Flower flower2 = new Flower();
	Location loc = new Location(r,r2);
	Location loc2 = new Location(r + 1,r2 + 1);
	Location loc3 = new Location(r - 1,r2 - 1);
	Location loc4 = new Location(r + 1,r2 - 1);
	Location loc5 = new Location(r - 1,r2 + 1);
	Location Floweys = new Location(x,y);
	for (int i = 0; i < 10; i++) {
		flower.setColor(Color.RED);
		for (int i2 = 0; i2 < 11; i2++) {
			world.add(Floweys, flower);
			Floweys = new Location(x,y+i2);
			
		}
		Floweys = new Location(x = x + 1,y = 0);
		flower2.setColor(Color.WHITE);
		for (int i2 = 0; i2 < 11; i2++) {
			world.add(Floweys, flower2);
			Floweys = new Location(x,y+i2);
			
		}
		Floweys = new Location(x = x + 1,y = 0);
		
		
		
	}
	

	
	
	world.add(loc, bug);
	world.add(loc2, bug);
	world.add(loc3, bug);
	world.add(loc4, bug);
	world.add(loc5, bug);
}
}
