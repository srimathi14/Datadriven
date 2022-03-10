package pages;

import Core.Hooks;
import Core.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Formspage {
    private String formsXpath = "//*[text()='Forms']/../..";
    private String practiceFrom = "//span[text()='Practice Form']";
    private String studfirstname = "//input[@id='firstName']";
    private String studlastname = "//input[@id='lastName']";
    private String studemail = "//input[@id='userEmail']";
    private String gender = "//label[text()='Female']";
    private String mobile = "//input[@id='userNumber']";
    private String dob = "dateOfBirthInput";
    private String subjects = "//div[@id='subjectsContainer']/child::div//input";
    private String hobby = "//input[@id='hobbies-checkbox-2']";
    private String currentadd = "//textarea[@id='currentAddress']";
    private String submit = "//button[@id='submit']";

    RemoteWebDriver driver = Hooks.driver;

    public void clickForms() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(formsXpath)));
        TestUtil.waitElementVisible(driver.findElement(By.xpath(formsXpath)));
        driver.findElement(By.xpath(formsXpath)).click();

    }

    public void practiceForms() {
        driver.findElement(By.xpath(practiceFrom)).click();

    }

    public void studentfirst(String text) {
        driver.findElement(By.xpath(studfirstname)).sendKeys(text);


    }

    public void stulast(String text) {

        driver.findElement(By.xpath(studlastname)).sendKeys(text);
    }

    public void stuemail(String text) {
        driver.findElement(By.xpath(studemail)).sendKeys(text);

    }

    public void gender1() {

        driver.findElement(By.xpath(gender)).click();
    }

    public void mobilenum(String text) {

        driver.findElement(By.xpath(mobile)).sendKeys(text);
    }

    public void dateofbirth() {

        driver.findElement(By.id(dob)).click();
    }

    public void subject(String text) {

        driver.findElement(By.xpath(subjects)).sendKeys(text);
    }

    public void hobbies() {
        TestUtil.waitElementVisible(driver.findElement(By.xpath(hobby)));
        driver.findElement(By.xpath(hobby)).click();
    }

    public void currentaddress(String text) {

        driver.findElement(By.xpath(currentadd)).sendKeys(text);
    }

    public void selectStateAndCity() {
        Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
        s.selectByValue("Blue");

        driver.findElement(By.id(practiceFrom)).click();

    }

    public void submitclick() {
        driver.findElement(By.xpath(submit)).click();
    }

}
