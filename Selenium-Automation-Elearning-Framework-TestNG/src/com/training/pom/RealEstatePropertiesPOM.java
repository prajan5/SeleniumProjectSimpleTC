package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class RealEstatePropertiesPOM {
		private WebDriver driver; 
	
	public RealEstatePropertiesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		}
	
	//Locators for Posts functionality
	@FindBy(xpath="//div[contains(text(),'Properties')]")
	public WebElement properties;
	
	@FindBy(linkText="Add New")
	public WebElement Addnew;
	
	@FindBy(id ="title")
	public WebElement propertytitle;
	
	@FindBy(id ="content")
	public WebElement content;
	
		
	@FindBy(id ="publish")
	public WebElement publish;
	
	
	
	@FindBy(xpath="//div//p[contains(text(),'Post published')]")
	public WebElement publishMessage;
	
	
		
	//Methods for Posts functionality
	public void clickPropertieslink() throws InterruptedException {
		//Click Post menu
		this.properties.click();
	
	    }
	
	public void clickAddNew() throws InterruptedException {
		//Click Post menu
		this.Addnew.click();
	
	    }
	public void sendTitle(String sPropTitle) {
		this.propertytitle.clear();
		this.propertytitle.sendKeys(sPropTitle);
	}
	public void sendContent(String sContent) {
		this.content.clear(); 
		this.content.sendKeys(sContent); 
	}
	

	public void clickpublishBtn() throws InterruptedException {
		//Click publish button
		this.publish.click();
	
	    }

	    
     //To get the published message after New Posts
	public String getpublishedMessage() throws InterruptedException {
		Thread.sleep(1000);
		String sMsg = this.publishMessage.getText();
		return sMsg;
	
	}
	
}






