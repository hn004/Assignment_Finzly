package assignment1;

import java.io.IOException;
import java.util.ArrayList;


public class SortingTheCurrency { 

	public static void main(String[] args) throws IOException {
		CsvReader cr = new CsvReader();
		ArrayList<CurrencyPair> currdata1 = cr.CsvReader();
		CurrencyPair curr = new CurrencyPair();  
		curr.sortByCurrency(currdata1);  
		for(CurrencyPair cp : currdata1) {
			System.out.println(cp);
		}
	}

}