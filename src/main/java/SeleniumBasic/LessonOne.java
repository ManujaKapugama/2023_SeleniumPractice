package SeleniumBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Author : MJ
// Created Date : 2023-12-24
// This script contains WebDriver Manager Basic Coding Structure.

public class LessonOne {

public static void main(String [] args){

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(); //Open Chrome

    driver.get("https://google.com"); //Navigate to URL
    driver.close(); //Close the current browser window
    driver.quit(); //Close all browser windows
}
}
