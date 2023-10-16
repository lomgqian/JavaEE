package com.yourpackage.dao;

import java.util.Random;

import org.springframework.stereotype.Repository;

import com.yourpackage.domain.Apple;
@Repository
public class AppleDaoImpl {
	private Random random = new Random();
    public Apple generateApple() {
    	float price = random.nextFloat() * (10 - 3) + 3;
        float weight = random.nextFloat() * (300 - 100) + 100;
        return new Apple(price, weight);
    }

    public Apple getApple() {
        return generateApple();
    }
}
