package com.Test_WebBrowserBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBrowser {
    public static void main(String[] args) {
        WebDriver driver;
       System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
       driver=new ChromeDriver();
       driver.close();
    }
}
