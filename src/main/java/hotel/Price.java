package hotel;

public class Price {
	private double value;
	private DayType dayType;
	private CustomerType customerType;	
	
	public Price(double value, DayType dayType, CustomerType customerType) {
		super();
		this.value = value;
		this.dayType = dayType;
		this.customerType = customerType;
	}

	public double getValue() {
		return value;
	}
	
	public DayType getDayType() {
		return dayType;
	}
	
	public CustomerType getCustomerType() {
		return customerType;
	}

	@Override
	public String toString() {
		return "Price [value=" + value + ", dayType=" + dayType + ", customerType=" + customerType + "]";
	}
	
}
