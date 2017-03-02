package com.steeka.atmospot.persistence;

import java.util.Calendar;

import org.junit.Test;

import com.steeka.atmospot.persistence.Temperature;
import com.steeka.atmospot.persistence.TemperatureHome;


public class TemperatureHomeIntegrationTest {

	protected void setUp() throws Exception {
	  //  entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
	}
	
	@Test
	public void test() {
		java.util.Date date = Calendar.getInstance().getTime();
		Temperature t = new Temperature (4, (short)18);
		t.setTimestamp(date);
		
		TemperatureHome th = new TemperatureHome();
		th.persist(t);
		//
		
	}

}
