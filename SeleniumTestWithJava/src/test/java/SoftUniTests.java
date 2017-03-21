import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

import javax.security.auth.login.LoginContext;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.*;

public class SoftUniTests {

    private WebDriver selenium;
    private Scanner Console;

    @Before
    public void setUp() {
        selenium = new FirefoxDriver();
        Console = new Scanner(System.in);
    }

    @Test
    public void TestLoginExpectedScenario() {
        String validUsername = "testtest";
        String validPassword = "testtest";

        selenium.get("http://softuni.bg");
        WebElement loginLink =
                selenium.findElement(By.id("loginLink"));

        loginLink.click();

        assertEquals(
                "https://softuni.bg/account/authenticate",
                selenium.getCurrentUrl()
        );

        WebElement usernameField =
                selenium.findElement(
                        By.id("LoginUserName")
                );

        WebElement passwordField =
                selenium.findElement(
                        By.id("LoginPassword")
                );

        usernameField.clear();

        //String usernameInput = Console.nextLine(); // pesho
        usernameField.sendKeys(validUsername);

        passwordField.clear();

        //String passwordInput = Console.nextLine(); // parolatanapesho
        passwordField.sendKeys(validPassword);

        WebElement loginButton =
                selenium.findElement(
                        By.xpath("//input[@value='Вход']")
                );

        loginButton.click();

        assertEquals(
                "https://softuni.bg/users/profile/show",
                selenium.getCurrentUrl()
        );

        WebElement dropDownUserName =
                selenium.findElement(
                    By.xpath("/html/body/header/div/div/div/div/nav/div/div[2]/form/ul/li[2]/a")
                );

        assertEquals(
                validUsername.toUpperCase(),
                dropDownUserName.getText().trim()
        );

    }

    @After
    public void tearDown() {
        selenium.quit();
    }

}
