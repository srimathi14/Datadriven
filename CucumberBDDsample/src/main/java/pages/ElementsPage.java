package pages;

import Core.Hooks;
import Core.TestUtil;
import io.cucumber.messages.internal.com.google.common.base.Verify;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.List;

public class ElementsPage {

    private String elementsXpath="//*[text()='Elements']/../..";
    private String textbox="item-0";
    private String fullname="userName";
    private String email="userEmail";
    private String Address="currentAddress";
    private String Perm="permanentAddress";
    private String sub="//button[@id='submit']";

    List<String> actualData =new ArrayList<String>();
    List<String> expected = new ArrayList<String>();
    RemoteWebDriver driver = Hooks.driver;
    public void clickElements()  {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(elementsXpath)));
        TestUtil.waitElementVisible(driver.findElement(By.xpath(elementsXpath)));
        driver.findElement(By.xpath(elementsXpath)).click();

    }
    public void textboxclick() {
        driver.findElement(By.id(textbox)).click();

    }

    public void name(String text) {
        driver.findElement(By.id(fullname)).sendKeys(text);
        expected.add("Name:"+text);
    }

    public void Email(String text) {
        driver.findElement(By.id(email)).sendKeys(text);
        expected.add("Email:"+text);
    }

    public void current(String text) {
        driver.findElement(By.id(Address)).sendKeys(text);
        expected.add("Current Address :"+text);
    }

    public void permanent(String text) {
        driver.findElement(By.id(Perm)).sendKeys(text);
        expected.add("Permananet Address :"+text);
    }
    public void Subm() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(sub)));
        TestUtil.waitElementVisible(driver.findElement(By.xpath(sub)));
        driver.findElement(By.xpath(sub)).click();

    }

    //checkboxes

    private String checkboxxpath="//span[text()='Check Box']";
    private String Homecheck="//*[text()='Home']/..//span[@class='rct-checkbox']";
    private String icon="//*[text()='Home']/..//span[@class='rct-checkbox']/../..//button[@type='button']";
    private String desk="//*[text()='Desktop']//..//..//button[@type='button']";
    private String note="//*[text()='Notes']/..//span[@class=\"rct-checkbox\"]";
    private String document="//*[text()='Documents']/../..//button[@type='button']";
    private String office="//*[text()='Office']/..//span[@class='rct-checkbox']";

    public void check() {
        driver.findElement(By.xpath(checkboxxpath)).click();
    }

    //home check

    public void homecheckbutton() {
        driver.findElement(By.xpath(Homecheck)).click();
    }
    //home left v icon

    public void iconleft() {
        driver.findElement(By.xpath(icon)).click();
    }
    //Desktop checkbox

    public void desktop() {
        driver.findElement(By.xpath(desk)).click();
    }

    //notes checkbox

    public void notecheck() {
        driver.findElement(By.xpath(note)).click();
    }

    //Document checkbox

    public void documentcheck() {
        driver.findElement(By.xpath(document)).click();
    }
    //office checkbox

    public void officecheck() {
        driver.findElement(By.xpath(office)).click();
    }


    //Radio button

    private String radio ="//span[text()='Radio Button']";
    private String yesbutton ="//label[@for='yesRadio']";
    private String impressive ="//label[@class='custom-control-label']/..//input[@id='impressiveRadio']";
    private String nobutton ="//label[@class='custom-control-label disabled']/..//input[@id='noRadio']";

    public void radioclick() {
        TestUtil.waitElementVisible(driver.findElement(By.xpath(radio)));
        driver.findElement(By.xpath(radio)).click();
    }
    public void radiobuttonclick() {
        String radiobutton="null";
        if (radiobutton=="yes")
        {

        driver.findElement(By.xpath(yesbutton)).click();
    } else if(radiobutton=="impressive"){
            driver.findElement(By.xpath(impressive)).click();
        }
        else if (radiobutton=="no"){
            driver.findElement(By.xpath(nobutton)).click();
        }
    }




    //web tables
    private String web="//span[text()='Web Tables']";
    // private String editbutton="//span[@id='edit-record-1']//*[local-name()='svg']//*[ local-name()='path']";
    private String editbutton="//*[text()='name']//following-sibling::div//span";

    public void tableclick() {
        driver.findElement(By.xpath(web)).click();
    }

    public void editclick(String name) {
        //  JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(editbutton)));
        // Driversetup.waitElementVisible(driver.findElement(By.xpath(editbutton)));
        driver.findElement(By.xpath(editbutton.replace("name", name))).click();

    }




    public void verifyText() {
        List<WebElement> textElements = driver.findElements(By.xpath("//div[contains(@class,'border')]/p"));
        for(WebElement ele:textElements ) {
            actualData.add(ele.getText());
        }

       // Assert.assertEquals(actualData, expected);
        Verify.verify(true, "data is not same", actualData,expected);
    }



    //Buttons
    private String buttons="//span[text()='Buttons']";
    private String oneclick="//button[text()='Click Me']";

    public void button() {
        driver.findElement(By.xpath(buttons)).click();
    }
    public void singleclick() {
        driver.findElement(By.xpath(oneclick)).click();
    }

//Links

    private String link="//span[text()='Links']";
    private String homelink="//a[@id='simpleLink']";

    public void linkclick() {
        driver.findElement(By.xpath(link)).click();
        List<WebElement>linklist= driver.findElements(By.tagName("a"));
        System.out.println( linklist.size());
        for(WebElement l: linklist) {
            System.out.println(l.getText());
        }
    }
    //broken links
    private String broken="//span[text()='Broken Links - Images']";

    //upload and download
    private String updownload="//span[text()='Upload and Download']";


    //Dynamic properties
    private String dynamic="//span[text()='Dynamic Properties']";
}
