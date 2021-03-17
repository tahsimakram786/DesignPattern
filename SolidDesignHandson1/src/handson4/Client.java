package handson4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Client {
	@Test 
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() { 
		Movable bugattiVeyron = new Veyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertTrue(bugattiVeyronAdapter.speed() == 384);
	}
}
