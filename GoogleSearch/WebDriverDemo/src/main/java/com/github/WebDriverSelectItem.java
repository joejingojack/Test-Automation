package com.github;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/roone/IdeaProjects/WebDriverDemo/src/main/webapp/SelectItemTest.html");

        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Maybe");

    }
}
