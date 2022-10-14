package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRegistration {
    public static void main(String[] args) {
        //1. 2nd argument is the path to the chromedriver download location on your machine
        System.setProperty("webdriver.chrome.driver", "/Users/florencenjeri/Downloads/chromedriver");

        //2. Instantiate Chromedriver (web driver)
        WebDriver driver = new ChromeDriver();

        //3. Navigate to the webpage under test
        driver.get("https://app.reflect.run/registration");

        //4. Find first name element using name/id/xpath and click in the input box
        WebElement firstName = driver.findElement(By.cssSelector(".input-field.half-width"));
        firstName.click();
        //5. Enter the user's first name
        firstName.sendKeys("Jane");

        //6. Find last name element and click in the input box
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/form/div[1]/div[2]/input"));
        lastName.click();
        //7. Enter the user's last name
        lastName.sendKeys("Doe");

        //8. Find work email element and click the input box
        WebElement workEmail = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/form/input[1]"));
        workEmail.click();
        //9. Enter the user's work email
        workEmail.sendKeys("jane@reflect.com");

        //10. Find company name element and click the input box
        WebElement companyName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/form/input[2]"));
        companyName.click();
        //11. Enter the user's company name
        companyName.sendKeys("Reflect");

        //12. Find password element
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/form/input[3]"));
        password.click();
        //13. Enter the user's password
        password.sendKeys("testify");

        //14. Find sign up button element
        WebElement signUpBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/form/button[1]"));
        //15  Click the sign-up button
        signUpBtn.click();

        //16. Close the browser
        driver.quit();
    }
}
