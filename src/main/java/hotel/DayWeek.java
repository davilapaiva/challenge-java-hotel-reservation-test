package hotel;

public enum DayWeek {
	MON ("WEEK"),
	TUES("WEEK"),
	WED ("WEEK"),
	THUR("WEEK"),
	FRI ("WEEK"),
	SAT ("WEEKEND"),
	SUN ("WEEKEND");

	private String dayWeek;

	DayWeek(String dayWeek) {
		this.dayWeek = dayWeek;
	}
	
	public String getDayWeek() {
		return dayWeek;
	}

}
