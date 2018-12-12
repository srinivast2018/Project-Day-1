package com.ibm.groceriespages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageDashboard {
	
	//@FindBy(xpath="//a[@class='material-ripple']")
	@FindBy(xpath="//a[text()=' Catalog']")
	WebElement catalogEle;
	
	@FindBy(xpath="//a[text()=' Products']")
	WebElement productEle;
	
	By prodElt=By.xpath("//a[text()=' Products']");
	WebDriverWait wait;
	WebDriver driver;
	
	public PageDashboard(WebDriver driver,WebDriverWait wait) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wait=wait;
	}
	
	//To click on Catalog
	public void clickOnCatalog()
	{
		catalogEle.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(prodElt));
		
		}
	//To click on Products
	public void clickOnProducts()
		{
		productEle.click();
		
	}
	
}
