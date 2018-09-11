package pl.videopoint.springlessons.financeassistant;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.videopoint.springlessons.financeassistant.services.RateConversionService;

public class ConsoleApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext ("/pl/videopoint/springlessons/financeassistant/appconfig.xml");
		
		RateConversionService service = context.getBean(RateConversionService.class);
		service.convertAmount(BigDecimal.valueOf(133.00), "EUR");
		
//		SecondRateConversionService service2 = context.getBean(SecondRateConversionService.class);
//		service2.convertAmount(BigDecimal.valueOf(111.00), "EUR");
	}

}
