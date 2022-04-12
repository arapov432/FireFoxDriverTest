package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementbyID {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver object = new ChromeDriver();
        object.get("https://video.search.yahoo.com/search/video?fr=yfp-t&ei=UTF-8&p=Perizat+Ryspaeva#id=3&vid=6f37ad1ced3a50b0fb610b42e4e18f63&action=click");
        WebElement clckbtn = object.findElement(By.className("ytp-play-button ytp-button"));
        clckbtn.click();
    }
}
