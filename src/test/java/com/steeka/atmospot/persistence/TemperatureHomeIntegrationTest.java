package com.steeka.atmospot.persistence;

import static org.junit.Assert.*;
import com.steeka.atmospot.persistence.Temperature;
import com.steeka.atmospot.persistence.TemperatureHome;
import java.util.Calendar;

import org.junit.Test;

public class TemperatureHomeIntegrationTest {

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
