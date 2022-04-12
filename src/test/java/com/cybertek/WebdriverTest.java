package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver object = new ChromeDriver();
        for(int i =0; i<5; i++) {
            object.get("https://www.youtube.com/watch?v=honyViov9po&t=76s&ab_channel=PerizatRyspaeva");
        }
        object.manage().window().maximize();
       //Thread.sleep(5000);
       String pagetitle = object.getTitle();
        System.out.println("Page title is " + pagetitle);
      // object.close();
        System.out.println("object.getCurrentUrl() = " + object.getCurrentUrl());
      //  System.out.println("object.getPageSource() = " + object.getPageSource());
        object.quit();
    }
}
