import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShortageApproach {

    final public static String URL = "https://automationpractice.com";
    final static String EMAIL_ADDRESS = "kevinlee1234@gmail.com";
    final static String PASSWORD = "Kevin123";

    public static void main(String[] args) throws InterruptedException {

//        this line will take care of download the driver with the necessary version


        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();



        //we also can instead use this method .
        driver.navigate().to(URL);

        WebElement logInLink = driver.findElement(By.className("login"));
        logInLink.click();

        WebElement emailId = driver.findElement(By.id("email"));
        emailId.sendKeys(EMAIL_ADDRESS);

        WebElement passwdId = driver.findElement(By.id("passwd"));
        passwdId.sendKeys(PASSWORD);


        WebElement submitLogin = driver.findElement(By.id("submitLogin"));
        submitLogin.click();


        //while I was running it nothing happen
//        driver.navigate().back();
//        driver.navigate().forward();



       // Thread.sleep(5000);

        //driver.quit();



















//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();


    }
}
