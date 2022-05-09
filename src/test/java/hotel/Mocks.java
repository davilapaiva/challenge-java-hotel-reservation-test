package hotel;

import java.util.ArrayList;

public class Mocks {

	public static ArrayList<Hotel> getLakewoodHotel() {
		ArrayList<Price> lakewoodPrices = new ArrayList<Price>();
		lakewoodPrices.add(new Price(110,DayType.WEEK,CustomerType.REGULAR));
		lakewoodPrices.add(new Price(90,DayType.WEEKEND,CustomerType.REGULAR));
		lakewoodPrices.add(new Price(80,DayType.WEEK,CustomerType.REWARDS));
		lakewoodPrices.add(new Price(80,DayType.WEEKEND,CustomerType.REWARDS));	
		ArrayList<Hotel> lakewood = new ArrayList<Hotel>();
		lakewood.add(new Hotel("Lakewood", 3, lakewoodPrices));
		return lakewood;
	}

	public static ArrayList<Hotel> getBridgewoodHotel() {
		ArrayList<Price> bridgewoodPrices = new ArrayList<Price>();
		bridgewoodPrices.add(new Price(160,DayType.WEEK,CustomerType.REGULAR));
		bridgewoodPrices.add(new Price(60,DayType.WEEKEND,CustomerType.REGULAR));
		bridgewoodPrices.add(new Price(110,DayType.WEEK,CustomerType.REWARDS));
		bridgewoodPrices.add(new Price(50,DayType.WEEKEND,CustomerType.REWARDS));
		ArrayList<Hotel> bridgewood = new ArrayList<Hotel>();
		bridgewood.add(new Hotel("Bridgewood", 4, bridgewoodPrices));
		return bridgewood;
	}

	public static ArrayList<Hotel> getRidgewoodhotel() {
		ArrayList<Price> ridgewoodPrices = new ArrayList<Price>();
		ridgewoodPrices.add(new Price(220,DayType.WEEK,CustomerType.REGULAR));
		ridgewoodPrices.add(new Price(150,DayType.WEEKEND,CustomerType.REGULAR));
		ridgewoodPrices.add(new Price(100,DayType.WEEK,CustomerType.REWARDS));
		ridgewoodPrices.add(new Price(40,DayType.WEEKEND,CustomerType.REWARDS));
		ArrayList<Hotel> ridgewood = new ArrayList<Hotel>();
		ridgewood.add(new Hotel("Ridgewood", 5, ridgewoodPrices));
		return ridgewood;
	}
}
