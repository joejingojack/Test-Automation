package com.github;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverDemo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        cookies.click();

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("selenium");
        searchField.sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Изображения")));

        WebElement imagesLink = driver.findElements(By.linkText("Изображения")).get(0);
        imagesLink.click();

        WebElement imageElement = driver.findElements(By.cssSelector("img[class='rg_i Q4LuWd']")).get(2);
        imageElement.click();
    }
}