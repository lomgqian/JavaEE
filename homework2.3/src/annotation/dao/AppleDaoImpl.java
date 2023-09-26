package annotation.dao;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

import annotation.domain.Apple;
@Repository("appleDaoImpl")
public class AppleDaoImpl implements AppleDao{
	private Random random = new Random();
	@Override
	public Apple generateApple() {
		float price = random.nextFloat() * (10 - 3) + 3;
        float weight = random.nextFloat() * (300 - 100) + 100;
        String[] colours = {"ºìÉ«", "ÂÌÉ«", "°ëºì"};
        String colour = colours[random.nextInt(colours.length)];
        return new Apple(price, weight, colour);
	
	}
	@Override
	public List<Apple> getApples(){
		 List<Apple> apples = new ArrayList<>();
	        for (int i = 0; i < 10; i++) {
	            apples.add(generateApple());
	        }
	        return apples;	
	}
}
