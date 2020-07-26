package TestPages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import PageOfObject.TrendyolSepetimPage;

public class TestSepetim extends TestBase{
	WebDriver chromeDriver;
	TrendyolSepetimPage ts = new TrendyolSepetimPage(chromeDriver);
	@Test
	public void basket_plus() throws InterruptedException 
	{
		Thread.sleep(3000);
		ts.basket_plus().click();
		logger.info("Sepet 1 arttırıldı.");
		Thread.sleep(2000);
	//	ts.basket_trash().click();
		logger.info("Ürün sepetten siliniyor.");
		Thread.sleep(2000);
	//	ts.trash_popup().click();
		logger.info("Ürün sepetten silinmiştir.");
		Thread.sleep(1000);
	}

}
