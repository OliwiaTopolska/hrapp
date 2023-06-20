package HR;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class A_Drivers {
     @Test
public void chromeDriverOnPath () {
         WebDriver driver = new ChromeDriver ();

         //driver.quit ();
     }

    @Test
public void chromeDriverUsingSystemProperty() {
        System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        //driver.quit();
    }
}
