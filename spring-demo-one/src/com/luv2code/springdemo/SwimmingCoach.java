package com.luv2code.springdemo;

public class SwimmingCoach implements Coach {
	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "swim 2hrs freestyle";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "swim fortune: " +fortuneService.getFortune();
	}

}
