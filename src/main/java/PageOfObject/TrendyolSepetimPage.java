	package PageOfObject;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class TrendyolSepetimPage {

	
	WebDriver chromeDriver;
	public TrendyolSepetimPage(WebDriver chromeDriver) {
		this.chromeDriver=chromeDriver;
		
	}
	By plus = By.className("//button[@class='ty-numeric-counter-button']");
	By trash = By.xpath("/html/body/div[3]/div[2]/div[2]/section/section[1]/div[2]/div/div/div[2]/div[2]/div[3]/button");
	By trash_popup = By.xpath("/html/body/div[10]/div[2]/form/div/div[2]/div/div[1]/button[2]");
	public WebElement basket_plus() 
	{
		return chromeDriver.findElement(plus);
	}
	public WebElement basket_trash()
	{
		return chromeDriver.findElement(trash);
	}
	public WebElement trash_popup()
	{
		return chromeDriver.findElement(trash_popup);
	}




	
	
	
}
