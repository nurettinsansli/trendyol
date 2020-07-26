package rep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driver {
	private static String GeckoPath = "C:\\Users\\home\\eclipse-workspace\\trendyol\\src\\main\\java\\resources\\browser\\geckodriver.exe";
    protected static WebDriver geckoDriver = new FirefoxDriver();
	private static String geckoKey = "webdriver.gecko.driver";
    private static String ieKey = "webdriver.ie.driver";
}
