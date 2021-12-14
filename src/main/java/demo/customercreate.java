package demo;

import com.Test_WebBrowserBasic.TestBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class customercreate extends TestBrowser {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("http://demo.guru99.com/V4/");
        TC_customercreate();
    }
    public static void TC_customercreate(){
        WebElement UserId=driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("mngr373877");
        WebElement Password=driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("YhuhUpa");
        WebElement LoginBtm =driver.findElement(By.name("btnLogin"));
        LoginBtm=driver.findElement(By.name("btnLogin"));
        LoginBtm.click();
    }

}
