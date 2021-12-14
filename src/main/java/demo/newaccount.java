package demo;

import com.Test_WebBrowserBasic.TestBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class newaccount extends TestBrowser {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("http://demo.guru99.com/V4/");
        //open_URL("http://demo.guru99.com/V4/manager/addcustomerpage.php");
        TC_new_account();
    }

    public static void TC_new_account() {
        WebElement UserId=driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("mngr373877");
        WebElement Password=driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("YhuhUpa");
        WebElement LoginBtm =driver.findElement(By.name("btnLogin"));
        LoginBtm=driver.findElement(By.name("btnLogin"));
        LoginBtm.click();

    WebElement NewCustomer = driver.findElement(By.linkText("New Customer"));
        NewCustomer.click();
        WebElement CustomerName=driver.findElement(By.name("name"));
        CustomerName.clear();
        CustomerName.sendKeys("Sakib Al Hasan");
        WebElement Gender=driver.findElement(By.name("rad1"));
        Gender.click();
        WebElement DateOfBirth=driver.findElement(By.id("dob"));
        DateOfBirth.clear();
        DateOfBirth.sendKeys("12/12/2012");
        WebElement Address=driver.findElement(By.name("addr"));
        Address.clear();
        Address.sendKeys("Dhaka123");
        WebElement City=driver.findElement(By.name("city"));
        City.clear();
        City.sendKeys("Dhaka");
        WebElement State=driver.findElement(By.name("state"));
        State.clear();
        State.sendKeys("Dhaka");
        WebElement Pin=driver.findElement(By.name("pinno"));
        Pin.clear();
        Pin.sendKeys("123456");
        WebElement MobileNumber=driver.findElement(By.name("telephoneno"));
        MobileNumber.clear();
        MobileNumber.sendKeys("01874547");
        WebElement Email=driver.findElement(By.name("emailid"));
        Email.clear();
        Email.sendKeys("ghgd@gmail.com");
        WebElement Password1=driver.findElement(By.name("password"));
        Password1.clear();
        Password1.sendKeys("1234");
        WebElement subBtm=driver.findElement(By.name("sub"));
        subBtm.click();




    }

}