package demo;

import com.Test_WebBrowserBasic.TestBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class fundtransfer extends TestBrowser {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("http://demo.guru99.com/V4/");
        //open_URL("http://demo.guru99.com/V4/manager/addcustomerpage.php");
        TC_fundtransfer();
    }
    public static void TC_fundtransfer(){
        WebElement UserId=driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("mngr373877");
        WebElement Password=driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("YhuhUpa");
        WebElement LoginBtm =driver.findElement(By.name("btnLogin"));
        LoginBtm=driver.findElement(By.name("btnLogin"));
        LoginBtm.click();
        WebElement FundTransfer=driver.findElement(By.linkText("Fund Transfer"));
        FundTransfer.click();
        WebElement Payersaccountno=driver.findElement(By.name("payersaccount"));
        Payersaccountno.click();
        Payersaccountno.sendKeys("1234");
        WebElement Payeesaccountno=driver.findElement(By.name("payeeaccount"));
        Payeesaccountno.clear();
        Payeesaccountno.sendKeys("12345");
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
