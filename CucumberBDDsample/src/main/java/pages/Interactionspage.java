package pages;

import Core.Hooks;
import Core.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class Interactionspage {
    private String Interaction="//*[text()='Interactions']/../..";
RemoteWebDriver driver= Hooks.driver;
    public void Interact() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        // js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(Interaction)));
        driver.findElement(By.xpath(Interaction)).click();
    }

    //sortable
    @FindBy(xpath="//span[text()='Sortable']")
    private WebElement sortable;

    public void sortable() {
        sortable.click();
    }
    @FindBy(id="demo-tab-list")
    private WebElement tab1;

    public void listtab() {
        Actions act=new Actions(driver);
        act.moveToElement(tab1).click().build().perform();
    }
    @FindBy(xpath="//div[@id='demo-tabpane-list']//div[@class='vertical-list-container mt-4']//div[1]")
    private WebElement oneclick;
    public void number() {
        Actions act=new Actions(driver);
        act.moveToElement(oneclick).click().build().perform();
    }

    @FindBy(id="demo-tab-grid")
    private WebElement tab2;
    public void gridtab() {
        Actions act=new Actions(driver);
        act.moveToElement(tab2).click().build().perform();
    }

    //selectable
    private String selectable="//span[text()='Selectable']";

    public void selectclick() {
        TestUtil.windowscroll();
        driver.findElement(By.xpath(selectable)).click();
    }

    @FindBy(id="demo-tab-list")
    private WebElement selectlist;
    public void list1() {
        Actions act=new Actions(driver);
        act.moveToElement(selectlist).click().build().perform();
    }
@FindBy(id="demo-tab-grid")
private WebElement gridlist;
    public void gridListOpen(){
        Actions act=new Actions(driver);
        act.moveToElement(gridlist).click().build().perform();
    }
    //Resizable
    private String resize="//span[text()='Resizable']";
    public void resize() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(resize)));
        driver.findElement(By.xpath(resize)).click();
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript
                ("document.getElementsByClassName('box react-resizable')[0].setAttribute('style', 'width: 400px; height: 300px;')");
    }
    private String resizeexp="//div[@id='resizable']//span";
    public void resize1() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(resize)));
        driver.findElement(By.xpath(resize)).click();
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("document.getElementsByClassName('box react-resizable')[0].setAttribute('style', 'width: 300px; height: 300px;')");

    }

    //Droppable
    private String droppable="//span[text()='Droppable']";
    public void dragDrop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(droppable)));
        driver.findElement(By.xpath(droppable)).click();
    }
    public void simple() throws InterruptedException {
        Actions ac = new Actions(driver);
        ac.contextClick().build().perform();


        Thread.sleep(10000);
        ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();


    }

    @FindBy(id="droppableExample-tab-accept")
    private WebElement accept;

    @FindBy(id="acceptable")
    private WebElement source;

    @FindBy(xpath="(//*[@id='droppable'])[2]")
    private WebElement target;

    @FindBy(id="notAcceptable")
    private WebElement source1;



    public void acceptclick() throws InterruptedException {
        Actions ac=new Actions(driver);
        ac.moveToElement(accept).click().build().perform();
        Thread.sleep(3000);

        ac.dragAndDrop(source, target).build().perform();
        Thread.sleep(3000);
        ac.dragAndDrop(source1, target).build().perform();
    }

    @FindBy(id="droppableExample-tab-preventPropogation")
    private WebElement propagation;

    @FindBy(id="//div[@id='dragBox']")
    private WebElement dragbox;

    @FindBy(id="(//*[text()='Outer droppable'])[1]")
    private WebElement outer;
    @FindBy(id="//div[@id='notGreedyInnerDropBox']")
    private WebElement innerbox;
    public void prevent() throws InterruptedException {
        Actions ac=new Actions(driver);
        ac.moveToElement(propagation).click().build().perform();
        Thread.sleep(3000);
        ac.dragAndDrop(dragbox, outer).build().perform();
        ac.dragAndDrop(dragbox, innerbox).build().perform();
    }


    //Draggable
    private String draggable="//span[text()='Dragabble']";


}
