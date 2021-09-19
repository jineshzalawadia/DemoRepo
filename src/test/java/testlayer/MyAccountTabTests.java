package testlayer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WalmartPOM.MyAccountTab;
import basepackage.baseclass;

public class MyAccountTabTests extends baseclass{
	
	MyAccountTab log;
	
	public MyAccountTabTests() { 
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialize();
		log = new MyAccountTab();
	}
	
	@Test
	public void cartbutton() {
		log.cartbtnclick();
		Assert.assertEquals(true, log.carttext());
		
	}
	
	@Test
	public void orderbtn() {
		log.order();
	}
}
