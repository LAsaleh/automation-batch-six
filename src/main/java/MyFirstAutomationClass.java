import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;
import java.util.Scanner;

public class MyFirstAutomationClass {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER WHICH BROWSER YOU WANT TO USE ");
        String inputBrowser = scanner.nextLine();

                WebDriver driver = null;
        switch (inputBrowser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "/Users/lilaalselmi/Downloads/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/lilaalselmi/Downloads/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("INVALID BROWSER");
        }
                driver.get("https://amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("unicorns");

        driver.findElement(By.xpath("//input[@value='Go']")).click();


        Thread.sleep(5000);

        driver.close();




















//        System.setProperty("webdriver.chrome.driver","/Users/lilaalselmi/Downloads/chromedriver");
//
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://amazon.com");

//        WebDriver driver = new FirefoxDriver();
//
//        System.setProperty("webdriver.gecko.driver","/Users/lilaalselmi/Downloads/geckodriver ");

    }
}
