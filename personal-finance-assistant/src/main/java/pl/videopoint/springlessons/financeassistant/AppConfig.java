package pl.videopoint.springlessons.financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.videopoint.springlessons.financeassistant.services.CurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FileCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.RateConversionService;
//import pl.videopoint.springlessons.financeassistant.services.SecondRateConversionService;
@Configuration
public class AppConfig {

	@Bean
	public CurrencyRateProvider fileCurrencyRateProvider() {
		
		return new FileCurrencyRateProvider();
	}
	@Bean
	public RateConversionService rateConversionService() {
		RateConversionService rateConversionService = new RateConversionService();
//		(jesli mamy parametry w metodzie)
//		rateConversionService.setRateProvider(currencyRateProvider);
		return rateConversionService;
	}
//	@Bean
//	public SecondRateConversionService secondRateConversionService() {
//		SecondRateConversionService rateConversionService = new SecondRateConversionService();
//		rateConversionService.setRateProvider(fileCurrencyRateProvider());
//		return rateConversionService;
//	}
}
