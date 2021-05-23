package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
		"good fortune",
		"medium fortune",
		"bad fortune"
	};
	private Random r=new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return data[r.nextInt(data.length)];
	}

}
