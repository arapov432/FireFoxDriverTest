package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementbyAttributes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=honyViov9po&ab_channel=PerizatRyspaeva");
        WebElement search = driver.findElement(By.id("movie_player"));
        System.out.println("search.getTagName() = " + search.getTagName());
        System.out.println("search.getAttribute(\"data-version\") = " + search.getAttribute("data-version"));
        System.out.println("search.getAttribute(\"class\") = " + search.getAttribute("class"));
    }
}
