package practice;

import com.Test_WebBrowserBasic.TestBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class googlesearch extends TestBrowser {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("https://www.google.com/");
        //chrome_close();
        TC_search_01();
    }
        public static void TC_search_01() {
            WebElement q = driver.findElement(By.name("q"));
            q.clear();
            q.sendKeys("Dhaka");
            WebElement googlesearchBtm = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
            googlesearchBtm.click();

        }



    }



