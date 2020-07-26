package TestPages;

import org.junit.Assert;
//import static org.junit.Assert.assertEquals;
import org.junit.Test;
import PageOfObject.TrendyolLoginPage;


public class TestAnasayfa extends TestBase {
	TrendyolLoginPage tl = new TrendyolLoginPage(chromeDriver);

	@Test
	public void Login() throws InterruptedException
	{				
	
       
        String URL = chromeDriver.getCurrentUrl();
        String actual = "https://www.trendyol.com/";
		Assert.assertEquals("Anasayfa başarıyla açılmıştır.", URL,actual);

		tl.popup_kapat().click();
		Thread.sleep(1000);
		tl.Giris_Yap().click();
		Thread.sleep(1000);
		tl.Email().sendKeys("testuser.1907@yandex.com");
		Thread.sleep(1000);
		tl.Password().sendKeys("test123456");
		Thread.sleep(1000);
		tl.Login().click();
		logger.info("Kullanıcı girişi yapıldı.");
		Thread.sleep(1000);		
		logger.info("Bilgisayar kelimesi aramaya başladı.");
		Thread.sleep(1000);
		tl.search_box().sendKeys("bilgisayar");
		Thread.sleep(1000);
		tl.search_icon().click();
		Thread.sleep(1000);
	}
	

	

}
