package TestNGBasic2;

import org.testng.annotations.Test;

public class BasicAction2 {
    @Test(priority = 1)
    public static void method(){
        System.out.println("TestNG Running");
    }

    @Test(priority = -2)
    public static void method1(){
        System.out.println("TestNG Good");
    }
}
