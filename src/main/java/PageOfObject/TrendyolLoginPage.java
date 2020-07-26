package PageOfObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrendyolLoginPage {

	
	WebDriver chromeDriver;
	
	public TrendyolLoginPage(WebDriver chromeDriver) {
		// TODO Auto-generated constructor stub
		this.chromeDriver = chromeDriver;
	}
	
	//login
	By popup = By.className("fancybox-close");
	By accountBtn = By.id("accountBtn");
	By accountBtnLogin = By.cssSelector("div.account-button:nth-child(1)");
	public WebElement popup_kapat()
	{
		return chromeDriver.findElement(popup);
	}
	public WebElement Giris_Yap()
	{
		return chromeDriver.findElement(accountBtn);
	}
	
	// login pop up
	By emailinput = By.id("email");
	By passwordinput = By.id("password");
	By loginBtnId = By.id("loginSubmit");
	
	public WebElement Email()
	{
		return chromeDriver.findElement(emailinput);
	}
	public WebElement Password()
	{
		return chromeDriver.findElement(passwordinput);
	}
	public WebElement Login() 
	{
		return chromeDriver.findElement(loginBtnId);
	}
	
	// searching
	By searchBox = By.xpath("//input[@class='search-box']");
	By searchClick = By.xpath("//i[@class='search-icon']");
	public WebElement search_box() 
	{
		return chromeDriver.findElement(searchBox);
	}
	public WebElement search_icon()
	{
		return chromeDriver.findElement(searchClick);
	}
	

	
}
