package com.github;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButtons {

    public static void main (String[] args) {
        WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/roone/IdeaProjects/WebDriverDemo/src/main/webapp/RadioButtonTest.html");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();

        for (WebElement radioButton : radioButtons) {
            if(radioButton.isSelected()) {
                System.out.println(radioButton.getAttribute("value"));
            }
        }
    }
}
