package TestPages;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class TestBase {
    private static String ChromePath = "C:\\Users\\home\\eclipse-workspace\\trendyol\\src\\main\\java\\resources\\browser\\chromedriver.exe";
    
    
    
    protected static WebDriver chromeDriver;
  
    
    protected static WebDriverWait wait;    
    final static Logger logger = Logger.getLogger(TestAnasayfa.class);
    private static String url = "https://trendyol.com/";
    private static String chromeKey = "webdriver.chrome.driver";
    
   
    public  TestBase()
    {
    	
    }
    @Test
	public static void main(String[] args) throws InterruptedException
	{
    	System.setProperty(chromeKey, ChromePath);		
	    chromeDriver = new ChromeDriver();		
	    
		chromeDriver.get(url);	
		logger.info("Siteye giriş yapıldı.");

		
        wait = new WebDriverWait(chromeDriver,15);
        // Pencereyi Büyütme
        chromeDriver.manage().window().maximize();
		
		TestAnasayfa mainpage_obj = new TestAnasayfa();
		mainpage_obj.Login();
		
		TestUrunler product_obj = new TestUrunler();
		product_obj.select_product();
		
		TestSepetim basket_obj = new TestSepetim();
		basket_obj.basket_plus();
	}
	
}
