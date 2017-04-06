package Tests.ABV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AbvTest {
	
	public WebDriver driver;
	@Before
	public void setTup(){
		
		System.setProperty("webdriver.gecko.driver", "C:/Automation build tool/geckodriver.exe");

		driver = DriverInit.getInstance().getDriver();		

	}
		
	@Test
	public void testLogin_validCredentials_shouldLoginCorrectly() {
		// TODO Auto-generated method stub
		// WebDriverWait wait = new WebDriverWait(driver,10);

		String validUsername = "automateusr_2017"; 
		String validPassword = "automatePass2017!";
		
		WebElement usrnameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		
		usrnameField.clear();
		usrnameField.sendKeys(validUsername);
		passwordField.clear();
		passwordField.sendKeys(validPassword);
		
		WebElement loginButton = driver.findElement(By.id("loginBut"));
		loginButton.click();
		
	}
	
    public WebElement nickName() {
        return this.driver.findElement(By.className("userName"));
    }
    
	@After
	public void assertMethod(){
		assertEquals("Automate Pass", nickName().getText());
	}
	
	public void tearDown(){

	}
}

