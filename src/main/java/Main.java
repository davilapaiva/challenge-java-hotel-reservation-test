import java.util.ArrayList;
import java.util.Scanner;
import hotel.CustomerType;
import hotel.DayType;
import hotel.Hotel;
import hotel.HotelReservation;
import hotel.Price;


/*
 * ler uma entrada  
 * <tipo_do_cliente>: <data1>, <data2>, <data3>, ...
 * Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
 * Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)
 * Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Starting program...");
		
		ArrayList<Price> lakewoodPrices = new ArrayList<Price>();
		lakewoodPrices.add(new Price(110, DayType.WEEK, CustomerType.REGULAR));
		lakewoodPrices.add(new Price(90, DayType.WEEKEND, CustomerType.REGULAR));
		lakewoodPrices.add(new Price(80, DayType.WEEK, CustomerType.REWARDS));
		lakewoodPrices.add(new Price(80, DayType.WEEKEND, CustomerType.REWARDS));	
		Hotel lakewood = new Hotel("Lakewood", 3, lakewoodPrices);
	
		System.out.println("Lakewood Hotel: " + lakewood.toString());
		
		
		ArrayList<Price> bridgewoodPrices = new ArrayList<Price>();
		bridgewoodPrices.add(new Price(160, DayType.WEEK, CustomerType.REGULAR));
		bridgewoodPrices.add(new Price(60, DayType.WEEKEND, CustomerType.REGULAR));
		bridgewoodPrices.add(new Price(110, DayType.WEEK, CustomerType.REWARDS));
		bridgewoodPrices.add(new Price(50, DayType.WEEKEND, CustomerType.REWARDS));
		Hotel bridgewood = new Hotel("Bridgewood", 4, bridgewoodPrices);
		
		System.out.println("Bridgewood Hotel:" + bridgewood.toString());
		
		
		ArrayList<Price> ridgewoodPrices = new ArrayList<Price>();
		ridgewoodPrices.add(new Price(220, DayType.WEEK, CustomerType.REGULAR));
		ridgewoodPrices.add(new Price(150, DayType.WEEKEND, CustomerType.REGULAR));
		ridgewoodPrices.add(new Price(100, DayType.WEEK, CustomerType.REWARDS));
		ridgewoodPrices.add(new Price(40, DayType.WEEKEND, CustomerType.REWARDS));
		Hotel ridgewood = new Hotel("Ridgewood", 5, ridgewoodPrices);
		
		System.out.println("Ridgewood Hotel:" + ridgewood.toString());
		
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your entry: ");
		String input = reader.nextLine();
		
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		hotels.add(lakewood);
		hotels.add(bridgewood);
		hotels.add(ridgewood);
		
		HotelReservation reservation = new HotelReservation(hotels);
		String cheapestHotel = reservation.getCheapestHotel(input);
		
		System.out.println("The chepeast hotel is: " + cheapestHotel);
		
		reader.close();
		 
	}

}
