package WalmartPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.baseclass;

public class MyAccountTab extends baseclass{
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a") WebElement Myaccountbtn;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[5]/a") WebElement Cartbtn;
	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[4]/div[1]/div[2]/div/div[2]") WebElement EmptycartText;
	@FindBy(xpath = "//*[@id=\"accounts-home-page\"]/div[3]/div[1]/div[3]/div[1]/a/div[1]") WebElement Orderhistory;
	
	public MyAccountTab() {
		PageFactory.initElements(driver, this);
	}
	public void cartbtnclick() {		
		Cartbtn.click();
	}
	public boolean carttext() {
		System.out.println(EmptycartText.getText());
		return EmptycartText.isDisplayed();
	}
	public void order() {
		Myaccountbtn.click();
		Orderhistory.click();
	}
}	