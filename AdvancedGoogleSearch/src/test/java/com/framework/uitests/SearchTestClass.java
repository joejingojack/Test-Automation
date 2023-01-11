package com.framework.uitests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchTestClass extends BaseTestClass {

    @Test
    void performSearch() {

        driver.get(BASE_URL);
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

        WebElement imageElement = driver.findElements(By.cssSelector("img[class='rg_i Q4LuWd']")).get(2);  // By.xpath("//img[@class='rg_i Q4LuWd']")).get(2);
        imageElement.click();
    }



}

