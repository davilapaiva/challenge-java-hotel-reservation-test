package hotel;

import java.util.ArrayList;

public class HotelReservation {
	
	private ArrayList<Hotel> hotels;

	public HotelReservation(ArrayList<Hotel> hotels) {
		super();
		this.hotels = hotels;
	}

	public String getCheapestHotel (String input) {
    	String customerSeparator = ":";
		String dateSeparator = ",";
		
		String[] splittedValues = input.split(customerSeparator);
		String customerTypeInput = splittedValues[0];
		String[] datesInput = splittedValues[1].split(dateSeparator);
		
		double lastHotelPrice = 0;
		int lastHotelRating = 0;
		String cheapestHotel = "";
		ArrayList<DayWeek> daysOfWeek = new ArrayList<DayWeek>();
		
		CustomerType customerType = CustomerType.valueOf(customerTypeInput.toUpperCase());

		for (String date : datesInput) {
			String spplitLeftParenthese = date.split("\\(")[1];
			String spplitRigthParenthese = spplitLeftParenthese.split("\\)")[0];
			daysOfWeek.add(DayWeek.valueOf(spplitRigthParenthese.toUpperCase()));
		}
				
		for (Hotel hotel : hotels) {
			double actualHotelPrice = 0;
			int actualHotelRating = hotel.getRating();
			
			for (DayWeek day : daysOfWeek) {
				ArrayList<Price> prices = hotel.getPrices();
				for(Price price : prices) {
					if (price.getCustomerType() == customerType && price.getDayType() == DayType.valueOf(day.getDayWeek())) {
						actualHotelPrice += price.getValue(); 
					}
				}
			}
			
			if (lastHotelPrice == 0 || actualHotelRating == 0) {
				lastHotelPrice = actualHotelPrice;
				cheapestHotel = hotel.getName();
				lastHotelRating = hotel.getRating();
			} else if (actualHotelPrice < lastHotelPrice) {
				lastHotelPrice = actualHotelPrice;
				cheapestHotel = hotel.getName();
				lastHotelRating = hotel.getRating();
			} else if (actualHotelPrice == lastHotelPrice && actualHotelRating > lastHotelRating) {
				lastHotelPrice = actualHotelPrice;
				cheapestHotel = hotel.getName();
				lastHotelRating = hotel.getRating();
			}
		}
    	
        return cheapestHotel;
    }
}
