package pages;

import Core.Hooks;

import Core.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Bookstorepage {
    RemoteWebDriver driver= Hooks.driver;
    private String bookstore="//*[text()='Book Store Application']/../..";

    public void bookbutton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        // js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(widget)));
        driver.findElement(By.xpath(bookstore)).click();
    }

//New user Login

    private String loginbutton="//span[text()='Login']";
    private String newuser="newUser";
    private String fname="firstname";
    private String Lname="lastname";
    private String uname="userName";
    private String pwd="password";
    private String captchacheck="//div[@class='recaptcha-checkbox-border']/../..//span[@id='recaptcha-anchor']";
    private String registerbutton="//button[@id='register']";

    public void loginnew() {

        driver.findElement(By.xpath(loginbutton)).click();
    }

    public void newuser1() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id(newuser)));
        driver.findElement(By.id(newuser)).click();;
    }

    public void firstname(String text) {

        driver.findElement(By.id(fname)).sendKeys(text);
    }

    public void lastname(String text) {

        driver.findElement(By.id(Lname)).sendKeys(text);
    }
    public void username1(String text) {

        driver.findElement(By.id(uname)).sendKeys(text);
    }
    public void password(String text) {

        driver.findElement(By.id(pwd)).sendKeys(text);
    }

    public void checkbox() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        TestUtil.waitElementVisible(driver.findElement(By.xpath(captchacheck)));
        driver.findElement(By.xpath(captchacheck)).click();
        driver.switchTo().defaultContent();
    }
    public void register() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        TestUtil.waitElementVisible(driver.findElement(By.xpath(registerbutton)));
        driver.findElement(By.xpath(registerbutton)).click();
        driver.switchTo().alert().accept();
    }

//Login

    private String username="//input[@id='userName']";
    private String password="//input[@id='password']";
    private String loginbutton1="//button[@id='login']";
    private String logout="//button[@id='submit']";

    public void uname(String text) {

        driver.findElement(By.xpath(username)).sendKeys(text);
    }
    public void pass(String text) {

        driver.findElement(By.xpath(password)).sendKeys(text);
    }
    public void loginclick() {

        driver.findElement(By.xpath(loginbutton1)).click();
    }
    public void logoutclick() {

        driver.findElement(By.xpath(logout)).click();
    }


//Book store

    private String bookstorebutton="//span[text()='Book Store']";
    private String typebutton="searchBox";
    private String searchbutton="//span[@id='basic-addon2']";

    public void bookclick() {

        driver.findElement(By.xpath(bookstorebutton)).click();
    }

//profile

    private String profileclick="//span[text()='Profile']";
    private String visitlogin="//a[text()='login']";
    private String visitregister="//a[text()='register']";

    //Bookstore API
    private String apiclick="//span[text()='Book Store API']";

}
