package practice;

import com.Test_WebBrowserBasic.TestBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class registrationtest extends TestBrowser {
    public static void main(String[] args) {
        //chrome_launch();
        open_URL("https://demo.opencart.com/index.php?route=common/home");
        //chrome_close();
        TC_registration_002();
    }
public static void TC_registration_002(){
    WebElement MyAccountBtm= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
    MyAccountBtm.click();
    WebElement RegisterBtm= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
    RegisterBtm.click();

}

}
