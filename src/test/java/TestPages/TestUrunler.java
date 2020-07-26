package TestPages;

import org.junit.Assert;
import org.junit.Test;
import PageOfObject.TrendyolUrunlerPage;



public class TestUrunler extends TestBase {
	TrendyolUrunlerPage tu = new TrendyolUrunlerPage(chromeDriver);
	@Test
	public void select_product() throws InterruptedException
	{
		Thread.sleep(1000);
       
	 	tu.SelectProduct().click();
		Thread.sleep(1000);
		logger.info("Rastgele ürün sayfasına gidildi.");
		tu.Basket().click();
		logger.info("Ürün sepete eklendi");
		Thread.sleep(2000);
		logger.info(tu.expected_Price().getText()+"=="+tu.actual_Price().getText());
		Assert.assertEquals("Gerçek fiyat ile sepetteki fiyat doğrudur.", tu.expected_Price().getText(), tu.actual_Price().getText());
		
		Thread.sleep(100);
		
		tu.gotoBasket().click();
		logger.info("Sepetim sayfasına gidildi.");
		Thread.sleep(1000);
		
		
	}

}
