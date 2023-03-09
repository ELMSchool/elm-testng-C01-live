package testng_demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utils.ConfigReader;
import utils.Driver;

public class LumaTest {
	

	@Test
	public void testPageTitle() {
		
		Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
		
		assertEquals(Driver.getDriver().getTitle(), "What's New Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
	}
	
}
