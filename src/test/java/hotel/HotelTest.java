package hotel;

import static org.junit.Assert.*;

import org.junit.Test;

public class HotelTest {

	@Test
	public void testToStringHotel() {
		Hotel hotel = Mocks.getLakewoodHotel().get(0);
		String actualHotel = hotel.toString();
		assertEquals("Invalid toString() Hotel", "Hotel [name=Lakewood, rating=3, prices=[Price [value=110.0, dayType=WEEK, customerType=REGULAR], Price [value=90.0, dayType=WEEKEND, customerType=REGULAR], Price [value=80.0, dayType=WEEK, customerType=REWARDS], Price [value=80.0, dayType=WEEKEND, customerType=REWARDS]]]", actualHotel);
	}
}
