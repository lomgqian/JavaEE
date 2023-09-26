package dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import domain.Apple;

public class AppleDao {
	private Random random = new Random();
	public Apple generateApple() {
		float price = random.nextFloat() * (10 - 3) + 3;
        float weight = random.nextFloat() * (300 - 100) + 100;
        String[] colours = {"ºìÉ«", "ÂÌÉ«", "°ëºì"};
        String colour = colours[random.nextInt(colours.length)];
        return new Apple(price, weight, colour);
	
	}
	public List<Apple> getApples(){
		 List<Apple> apples = new ArrayList<>();
	        for (int i = 0; i < 10; i++) {
	            apples.add(generateApple());
	        }
	        return apples;	
	}
}
