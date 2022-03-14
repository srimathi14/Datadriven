package pages;

import Core.Hooks;
import Core.TestUtil;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Set;

public class Alertspage {
    private String alertclick="//*[text()='Alerts, Frame & Windows']/../..";
    private String browserclick="//span[text()='Browser Windows']";
    private String newtabclick="//button[text()='New Tab']";
    private String newwindowclick="//button[text()='New Window']";
    private String newmessage="//button[text()='New Window Message']";
    private String newWindowTextId = "sampleHeading";
    RemoteWebDriver driver = Hooks.driver;
   
     public void alert() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        // js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(alertclick)));
        driver.findElement(By.xpath(alertclick)).click();
    }
    public void browse() {
        TestUtil.windowscroll();
        driver.findElement(By.xpath(browserclick)).click();
    }
    public void newtab() {
        driver.findElement(By.xpath(newtabclick)).click();
    }

    public void verifyTextInNewTab() {
        String currentWindow =driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for(String window:windows) {
            if(!window.equals(currentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }


        String msg=driver.findElement(By.id(newWindowTextId)).getText();
        //Assert.assertEquals("This is a sample page", msg);
        driver.close();
        driver.switchTo().window(currentWindow);
    }


    public void newwindow() {
        driver.findElement(By.xpath(newwindowclick)).click();
    }
    public void verifyTextInNewwindow() {
        String currentWindow1 =driver.getWindowHandle();
        Set<String> windows1 = driver.getWindowHandles();
        for(String w:windows1) {
            if(!w.equals(currentWindow1)) {
                driver.switchTo().window(w);
                break;
            }}
        String msg1=driver.findElement(By.id(newWindowTextId)).getText();
        //Assert.assertEquals("This is a sample page", msg1);
        driver.close();
        driver.switchTo().window(currentWindow1);
    }

    public void newwindowmes() {
        driver.findElement(By.xpath(newmessage)).click();
    }
    public void newwindowmessage() {
        String currentWindow2=driver.getWindowHandle();
        Set<String> windows2=driver.getWindowHandles();
        for(String w1:windows2 ) {
            if(!w1.equals(currentWindow2)) {
                driver.switchTo().window(w1);
                break;
            }
        }
        String msg2=driver.findElement(By.xpath("//body")).getText();
        System.out.println(msg2);

    }

    //Alerts

    private String alertbutton = "//span[text()='Alerts']";
    private String alert1="//button[@id='alertButton']";
    private String timealert="//button[@id='timerAlertButton']";
    private String confirmbutton="//button[@id='confirmButton']";
    private String expectedtext="//span[@id='confirmResult']";
    private String prompt="//button[@id='promtButton']";

    public void alertbuttonclick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(alertbutton)));
        driver.findElement(By.xpath(alertbutton)).click();

    }
    public void alertpop() {
        driver.findElement(By.xpath(alert1)).click();

        driver.switchTo().alert().accept();

    }
    public void alerttimeclick() {
        driver.findElement(By.xpath(timealert)).click();
    }
    public void confirm() {
        driver.findElement(By.xpath(confirmbutton)).click();
        driver.switchTo().alert().dismiss();
        String actual="You selected Cancel";
        //Assert.assertEquals(actual, driver.findElement(By.xpath(expectedtext)).getText());
    }
    public void promptbutton(String val) {
        driver.findElement(By.xpath(prompt)).click();
        driver.switchTo().alert().sendKeys(val);
        driver.switchTo().alert().accept();


    }


    //Frames

    private String frameclick ="//span[text()='Frames']";

    public void framebutton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(frameclick)));
        driver.findElement(By.xpath(frameclick)).click();
    }

    public String getTextFromFrame() {
        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        String text=driver.findElement(By.id("sampleHeading")).getText();

        return text;
    }

    //Nested Frames

    private String nested="//span[text()='Nested Frames']";

    public void nest() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(nested)));
        driver.findElement(By.xpath(nested)).click();
    }
    public String nestedframes() {
        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        String value= driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
        return value;
    }
    public String child() {
        //driver.switchTo().frame(driver.findElement(By.id("frame1")));
        //driver.switchTo().frame(driver.findElement(By.xpath("//*[text()='Parent frame']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//*[text()='Parent frame']//iframe")));
        String childtext=driver.findElement(By.xpath("//*[text()='Child Iframe']")).getText();
        return childtext;
    }


    //Modal Dialogs

    private String model="//span[text()='Modal Dialogs']";

    public void modalclick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(model)));
        driver.findElement(By.xpath(model)).click();
    }
    public void smallmodel() {
        driver.findElement(By.xpath("//button[@id='showSmallModal']")).click();
        driver.findElement(By.xpath("//button[@id='closeSmallModal']")).click();
    }
    public void largemodel() {
        driver.findElement(By.xpath("//button[@id='showLargeModal']")).click();
        driver.findElement(By.xpath("//button[@type='button']//span[text()='×']")).click();
    }
}
