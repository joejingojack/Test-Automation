package Tests.ABV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class DriverInit {

    public WebDriver driver;
    private static DriverInit driverInit = null;

    public static DriverInit getInstance() {
        if (driverInit == null) {
            driverInit = new DriverInit();
        }
        return driverInit;
    }

    private DriverInit() {
        this.driver = new FirefoxDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get("https://www.abv.bg/");
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
