package demo;

import com.Test_WebBrowserBasic.TestBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class withdraw extends TestBrowser {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("http://demo.guru99.com/V4/");
        //open_URL("http://demo.guru99.com/V4/manager/addcustomerpage.php");
        TC_withdraw();
    }
    public static void TC_withdraw(){
        WebElement UserId=driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("mngr373877");
        WebElement Password=driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("YhuhUpa");
        WebElement LoginBtm =driver.findElement(By.name("btnLogin"));
        LoginBtm=driver.findElement(By.name("btnLogin"));
        LoginBtm.click();
        WebElement withdrawal=driver.findElement(By.linkText("Withdrawal"));
        withdrawal.click();
        WebElement AccountNo=driver.findElement(By.name("accountno"));
        AccountNo.clear();
        AccountNo.sendKeys("1234");
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
