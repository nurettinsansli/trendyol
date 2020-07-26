	package PageOfObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import rep.RandomButtonID;


public class TrendyolUrunlerPage {

	
	WebDriver chromeDriver;
	RandomButtonID obj = new RandomButtonID();

	
	public TrendyolUrunlerPage(WebDriver chromeDriver) {
		// TODO Auto-generated constructor stub
		this.chromeDriver = chromeDriver;

	}
	
	String xpath= obj.rnd_generator();	
	By product_button = By.xpath(xpath);
	
	By basket = By.cssSelector(".add-to-bs");
	By actual_price = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/span[2]");
	By expected_price = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div/ul/li[3]/div[4]/div/div[1]/ul/li/a/div[2]/p[2]/span");
	By gotoBasket = 	By.xpath("//a[@href='/sepetim#/basket']");

	public WebElement SelectProduct()
	{
		return chromeDriver.findElement(product_button);
	}
	
	public WebElement Basket()
	{
		return chromeDriver.findElement(basket);
	}
	public WebElement actual_Price()
	{
		return chromeDriver.findElement(actual_price);
	}
	public WebElement expected_Price()
	{
		return chromeDriver.findElement(expected_price);
	}
	public WebElement gotoBasket()
	{
		return chromeDriver.findElement(gotoBasket);
	}
	
}
