package com.cts.scd.service;

import java.time.LocalDateTime;

public class GreetServiceTimeBasedImpl implements GreetService{

	@Override
	public String greet(String userName) {
		
		String greeting="";
		
		int h = LocalDateTime.now().getHour();
		
		if(h>=3 && h<=11)
			greeting="Good Morning";
		else if(h>=12 && h<=15)
			greeting="Good Noon";
		else
			greeting="Good Evening";
		
		return String.format("%s! %s!",greeting,userName);
	}

}
