package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       for(int i=0; i <20; i++) {
           driver.get("https://m.youtube.com/watch?v=honyViov9po&t=27s");
       }//WebElement play = driver.findElement(By.className("icon-button player-control-play-pause-icon"));
       // play.click();
        //play.click();
        //Thread.sleep(Long.parseLong("6000"));
        //play.click();
    }
}
