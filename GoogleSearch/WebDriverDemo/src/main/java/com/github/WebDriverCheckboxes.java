package com.github;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/roone/IdeaProjects/WebDriverDemo/src/main/webapp/CheckboxTest.html");

        WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
        checkbox.click();
    }
}
