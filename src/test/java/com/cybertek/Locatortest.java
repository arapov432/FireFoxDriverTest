package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatortest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        WebElement search = driver.findElement(By.name("p"));
        search.sendKeys("Perizat Ryspaeva");
        WebElement subbtn = driver.findElement(By.id("ybar-search"));
        subbtn.submit();

    }
}
