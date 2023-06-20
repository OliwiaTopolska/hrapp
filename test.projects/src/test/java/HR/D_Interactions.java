package HR;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;


public class D_Interactions {


 /** szablon kurier */


    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to( "http://c3.tfs.local:8100/campaigns/apply/1/campaign-1");
        return driver;
    }

    @Test
       public void enterTextIntoTheElement() throws InterruptedException {

     /** pierwsza strona */


        WebDriver driver = getDriver();

        WebElement firstNameFieldById = driver.findElement(By.id("mat-input-0"));
        firstNameFieldById.sendKeys("testa");
     /** imie */
        WebElement secondNameFieldById = driver.findElement(By.id("mat-input-1"));
        secondNameFieldById.sendKeys("testa");
     /** nazwisko */
        WebElement numerphoneFieldById = driver.findElement(By.id("mat-input-2"));
        numerphoneFieldById.sendKeys("111111116");
     /** numer telefonu */
        WebElement emailFieldById = driver.findElement(By.id("mat-input-3"));
        emailFieldById.sendKeys("testdubel@mail.pl");
     /** e-mail */
        WebElement acceptance1FieldById = driver.findElement (By.id ("mat-checkbox-1"));
        acceptance1FieldById.click();
     /** zgoda obowiazkowa 1 */
        WebElement informationNoteFieldById = driver.findElement(By.id("mat-checkbox-3"));
        informationNoteFieldById.click();
     /** zgoda obowiazkowa 2 */
        WebElement matbuttonwrapperFieldByxpath = driver.findElement(By.xpath("/html/body/app-root/app-campaign-courier-apply/div/div[2]/section[2]/p/app-bool-select/div/div/button[1]"));
        matbuttonwrapperFieldByxpath.click();
     /** zgoda tak */
        WebElement matraisedbuttonFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']"));
        matraisedbuttonFieldByxpath.click();
     /** aplikuj */




     /** druga strona */

        Thread.sleep(1000);

        WebElement ageclicktextFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-select-arrow ng-tns-c73-8']"));
        ageclicktextFieldByxpath.click();

     WebElement agetextFieldByxpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[4]/span"));
        agetextFieldByxpath.click();

        WebElement otherdriverFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-select-arrow-wrapper ng-tns-c73-10']"));
        otherdriverFieldByxpath.click();

        WebElement driverBFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted']"));
        driverBFieldByxpath.click();

        WebElement backgroundByxpath = driver.findElement(By.xpath("/html/body"));
        backgroundByxpath.click();


        WebElement drivertextFieldByxpath = driver.findElement(By.xpath("/html/body/app-root/app-campaign-courier-apply-details/div/ol/section[1]/li[3]/mat-form-field/div/div[1]/div/input"));
        drivertextFieldByxpath.sendKeys("AADF");

        WebElement textAFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-pseudo-checkbox ng-star-inserted']"));
        textAFieldByxpath.click();

        WebElement textBFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-pseudo-checkbox ng-star-inserted']"));
        textBFieldByxpath.click();

        WebElement textCFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-pseudo-checkbox ng-star-inserted']"));
        textCFieldByxpath.click();

        WebElement textDFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-pseudo-checkbox ng-star-inserted']"));
        textDFieldByxpath.click();

        WebElement textEFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-pseudo-checkbox ng-star-inserted']"));
        textEFieldByxpath.click();

        WebElement textFFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-pseudo-checkbox ng-star-inserted']"));
        textFFieldByxpath.click();

        WebElement cooperationFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-select-arrow-wrapper ng-tns-c73-13']"));
        cooperationFieldByxpath.click();

        WebElement cooperationanswerFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted']"));
        cooperationanswerFieldByxpath.click();

        WebElement backgroundAByxpath = driver.findElement(By.xpath("/html/body"));
        backgroundAByxpath.click();

        WebElement timeworkFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-select-arrow-wrapper ng-tns-c73-15']"));
        timeworkFieldByxpath.click();

        WebElement mondayandfridayFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-option mat-focus-indicator mat-option-multiple mat-active ng-tns-c73-15 ng-star-inserted']"));
        mondayandfridayFieldByxpath.click();

        WebElement sundayFieldByid = driver.findElement(By.id("mat-option-13"));
        sundayFieldByid.click();

        WebElement backgroundCByxpath = driver.findElement(By.xpath("/html/body"));
        backgroundCByxpath.click();

        WebElement workFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-focus-indicator mat-stroked-button mat-button-base mat-primary']"));
        workFieldByxpath.click();

        WebElement sanepidFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-focus-indicator mat-stroked-button mat-button-base mat-primary']"));
        sanepidFieldByxpath.click();

        WebElement readyFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-select-arrow-wrapper ng-tns-c73-17']"));
        readyFieldByxpath.click();

        WebElement nowFieldByid = driver.findElement(By.id("mat-option-15"));
        nowFieldByid.click();

        WebElement backgroundDByxpath = driver.findElement(By.xpath("/html/body"));
        backgroundDByxpath.click();

        WebElement infoFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-select-arrow-wrapper ng-tns-c73-19']"));
        infoFieldByxpath.click();


        WebElement answerinfoFieldByid = driver.findElement(By.id("mat-option-20"));
        answerinfoFieldByid.click();

        WebElement backgroundFByxpath = driver.findElement(By.xpath("/html/body"));
        backgroundFByxpath.click();

        WebElement agreementaFieldByxpath = driver.findElement(By.id("mat-checkbox-4"));
        agreementaFieldByxpath.click();


        WebElement agreementbFieldByxpath = driver.findElement(By.id("mat-checkbox-5"));
        agreementbFieldByxpath.click();

        WebElement sendFieldByxpath = driver.findElement(By.xpath("//*[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']"));
        sendFieldByxpath.click();


     /** trzecia strona */

     Thread.sleep(1000);

     WebElement addAFieldByxpath = driver.findElement(By.xpath("/html/body/app-root/app-campaign-courier-apply-selfreview/div/ol/li[1]/mat-selection-list/mat-list-option[3]"));
     addAFieldByxpath.click();

     WebElement addFFieldByxpath = driver.findElement(By.xpath("/html/body/app-root/app-campaign-courier-apply-selfreview/div/section[1]/button"));
     addFFieldByxpath.click();


     //driver.quit();

    }
}
