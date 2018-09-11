package pl.videopoint.springlessons.financeassistant.services;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;
import java.util.Date;

public class FileCurrencyRateProvider implements CurrencyRateProvider {
	
	private String fileName;
	
	private int maxCnt;
	
	
	
	@ConstructorProperties({"fileName", "maxCnt"})
	public FileCurrencyRateProvider(String fileName, int maxCnt) {
		super();
		this.fileName = fileName;
		this.maxCnt = maxCnt;
	}





	public BigDecimal getRate(String currency, Date rateDate) {
		
		System.out.println("FileCurrencyRateProvider: Wczytano kursy z pliku lokalnego" +fileName);
		return BigDecimal.valueOf(4.25);
	}
	
}
