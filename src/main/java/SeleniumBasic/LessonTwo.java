package SeleniumBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LessonTwo {

    public static void main(String []args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationintesting.online/");

       // == Browser Management ==

        driver.manage().window().maximize(); // Browser Management
       // driver.manage().window().fullscreen(); // Set Full Screen Mode
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Set Implicit Wait

        // == Navigation ==

        driver.navigate().refresh(); // Navigation - Refresh the current page.
        // driver.navigate().to("https://automationintesting.online/"); // Navigates to a new URL.
        // driver.navigate().back(); // Navigates back to previous page.
        // driver.navigate().forward(); // Navigates forward to the next page.

        // == Element Interaction ==

        driver.findElement(By.xpath("//div[@class='col-sm-7']")).getText();
        // driver.findElement(By.name("")).click();
        // driver.findElement(By.id("")).click();
        // driver.findElement(By.linkText("")).getText();

        driver.close();

    }
}
