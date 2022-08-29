package assignment1;

import java.io.IOException;
import java.util.ArrayList;


public class LastUpdatedTime {
	
	
	public static void main(String[] args) throws IOException { 
		CsvReader cc = new CsvReader();
		
		ArrayList<CurrencyPair> currdata1 = cc.CsvReader();
		
		CurrencyPair c = new CurrencyPair();   
		c.sortByLastUpdatedTime(currdata1);   
		for(CurrencyPair VAL : currdata1) {
			System.out.println(VAL);       
		}
	}

}