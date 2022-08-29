package assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvReader {
	
	
	
	public ArrayList<CurrencyPair> CsvReader() throws IOException {
		
		String csvPath = "C:\\Users\\harsh\\Downloads\\csvfile\\CurrencyPairs.csv";
		String FIRST ;
		String[] line;
		ArrayList<CurrencyPair> currData = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(csvPath));
		reader.readLine();
		while ((FIRST = reader.readLine())!=null) {
			line = FIRST.split(",");
			CurrencyPair data = new CurrencyPair(line[0],line[1],line[2],line[3],line[4],line[5]); 
			currData.add(data);
		}
		return currData;
		
	}

	public static void main(String[] args) throws IOException {
		CsvReader cc = new CsvReader();
		ArrayList<CurrencyPair> values = cc.CsvReader();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Currencypairs:");
		String currency = sc.next();
		String checkIfMatch = "false";    
		for (CurrencyPair ok : values) {
			if(currency.equals(ok.getCcy1()+ok.getCcy2())) {
				checkIfMatch = "true";
				System.out.println(ok); 
			}
		}
		if(checkIfMatch.equals("false")) {
			System.out.println("invalid currencypairs");
		}
	}
}