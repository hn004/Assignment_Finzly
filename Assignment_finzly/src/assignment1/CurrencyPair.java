package assignment1;

import java.util.ArrayList;


public class CurrencyPair {
	private String Ccy1;
	private String Ccy2;
	private String spotdays;
	private String WeekendDays;
	private String Precision;
	private String LastUpdatedTime;
	
	
    //default
	public CurrencyPair() {
		
	}
	
	public CurrencyPair(String ccy1, String ccy2, String spotdays, String weekendDays, String precision,
			String lastUpdatedTime) {
		super();
		Ccy1 = ccy1;
		Ccy2 = ccy2;
		this.spotdays = spotdays;
		WeekendDays = weekendDays;
		Precision = precision;
		LastUpdatedTime = lastUpdatedTime;
		
	}

	@Override
	public String toString() {
		return "CurrencyPair [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", spotdays=" + spotdays + ", WeekendDays="
				+ WeekendDays + ", Precision=" + Precision + ", LastUpdatedTime=" + LastUpdatedTime + "]";
	}
	public String getCcy1() {
		return Ccy1;
	}
	public String getCcy2() {
		return Ccy2;
	}
	public String getSpotdays() {
		return spotdays;
	}
	public String getWeekendDays() {
		return WeekendDays;
	}
	public String getPrecision() {
		return Precision;
	}
	public String getLastUpdatedTime() {
		return LastUpdatedTime;
	}
	
	
	
	
	
	public void sortByCurrency(ArrayList<CurrencyPair> ab){  
		ab.sort((CurrencyPair d1,CurrencyPair d2) -> ((d1.getCcy1()+d1.getCcy2()).compareTo(d2.getCcy1()+d2.getCcy2())));
	}
	
	
	public void sortByLastUpdatedTime(ArrayList<CurrencyPair> ab)
	{  
		ab.sort((CurrencyPair d1,CurrencyPair d2) -> (d1.getLastUpdatedTime().compareTo(d2.getLastUpdatedTime())));
	}
}
