package hotel;

import java.util.ArrayList;

public class Hotel {

	private String name;
	private int rating;
	private ArrayList<Price> prices;
	
	public Hotel(String name, int rating, ArrayList<Price> prices) {
		super();
		this.name = name;
		this.rating = rating;
		this.prices = prices;
	}

	public String getName() {
		return name;
	}
	
	public int getRating() {
		return rating;
	}
	
	public ArrayList<Price> getPrices() {
		return prices;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rating=" + rating + ", prices=" + prices + "]";
	}
}
