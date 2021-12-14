package demo;

import com.Test_WebBrowserBasic.TestBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class deposit extends TestBrowser {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("http://demo.guru99.com/V4/");
        //open_URL("http://demo.guru99.com/V4/manager/addcustomerpage.php");
        TC_deposit();
    }
    public static void TC_deposit(){
        WebElement UserId=driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("mngr373877");
        WebElement Password=driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("YhuhUpa");
        WebElement LoginBtm =driver.findElement(By.name("btnLogin"));
        LoginBtm=driver.findElement(By.name("btnLogin"));
        LoginBtm.click();

        WebElement Deposit = driver.findElement(By.linkText("Deposit"));
        Deposit.click();
        WebElement AccountNo=driver.findElement(By.name("accountno"));
        AccountNo.clear();
        AccountNo.sendKeys("1324255");
        WebElement Amount=driver.findElement(By.name("ammount"));
        Amount.clear();
        Amount.sendKeys("5000");
        WebElement Description=driver.findElement(By.name("desc"));
        Description.clear();
        Description.sendKeys("Hello");
        WebElement subBtm=driver.findElement(By.name("AccSubmit"));
        subBtm.click();
    }
}
