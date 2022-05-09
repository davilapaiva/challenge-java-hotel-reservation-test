package hotel;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void testLakewoodHotel() {
		ArrayList<Hotel> hotel = Mocks.getLakewoodHotel();
		HotelReservation reservation = new HotelReservation(hotel);
		String actualChepeastHotel = reservation.getCheapestHotel("Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)");
		assertEquals("Invalid cheapeast Lakewood Hotel", "Lakewood", actualChepeastHotel);
	}
	
	@Test
	public void testBridgewoodHotel() {
		ArrayList<Hotel> hotel = Mocks.getBridgewoodHotel();
		HotelReservation reservation = new HotelReservation(hotel);
		String actualChepeastHotel = reservation.getCheapestHotel("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)");
		assertEquals("Invalid cheapeast Bridgewood Hotel", "Bridgewood", actualChepeastHotel);
	}
	
	@Test
	public void testRidgewoodHotel() {
		ArrayList<Hotel> hotel = Mocks.getRidgewoodhotel();
		HotelReservation reservation = new HotelReservation(hotel);
		String actualChepeastHotel = reservation.getCheapestHotel("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
		assertEquals("Invalid cheapeast Ridgewood Hotel", "Ridgewood", actualChepeastHotel);
	}
}
