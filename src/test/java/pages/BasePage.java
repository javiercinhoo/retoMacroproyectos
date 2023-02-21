package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;
   
    static {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }     
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }   

    public static void navigateTo(String url) {
        driver.get(url);
    }
       public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
   
    public void clickElement(String locator) {
        Find(locator).click();
    }
    
    public void write(String locator, String textoToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textoToWrite);
    }   
  
    //Doble Click
    public void doubleClick (String locator){
        action.doubleClick(Find(locator));
    }
    //Click Derecho
    public void rightClick(String locator){
        action.contextClick(Find(locator));
    }
    
    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    //Manejo de Alertas Ventanas emergenteso alert box
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    //Para el uso de Asserts o validaciones 
    public String textFromElement(String locator){
        return Find(locator).getText();
    }            
    
    public void goToLinkText(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }  

}