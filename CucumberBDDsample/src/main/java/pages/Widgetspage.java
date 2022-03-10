package pages;

import Core.Hooks;
import Core.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class Widgetspage {
    private String widget="//*[text()='Widgets']/../..";
    RemoteWebDriver driver = Hooks.driver;
    public void widgetclick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        // js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(widget)));
        driver.findElement(By.xpath(widget)).click();
    }

    //Accordian

    private String accordian="//span[text()='Accordian']";
    private String question1="//div[@id='section1Heading']";
    private String question2="//div[@id='section2Heading']";
    private String question3="//div[@id='section3Heading']";
    public void accord() {

        driver.findElement(By.xpath(accordian)).click();
    }
    public void quest1() {

        driver.findElement(By.xpath(question1)).click();
    }
    public void quest2() {

        driver.findElement(By.xpath(question2)).click();
    }
    public void quest3() {
        driver.findElement(By.xpath(question3)).click();
    }

    //Autocomplete

    private String auto="//span[text()='Auto Complete']";
    private String multicolor="//input[@id='autoCompleteMultipleInput']";
    private String singlecolor="//input[@id='autoCompleteSingleInput']";
    public void autoclick() {

        driver.findElement(By.xpath(auto)).click();
    }

    public void multicolors(List<Map<String,String>> text) {
        for(Map<String,String> color:text) {
            driver.findElement(By.xpath(multicolor)).sendKeys(color.get("colors"));
            driver.findElement(By.xpath(multicolor)).sendKeys(Keys.ENTER);
        }
    }
    public void singleinput(String text) {

        driver.findElement(By.xpath(singlecolor)).sendKeys(text);
    }

    //Date picker

    private String date1="//span[text()='Date Picker']";
    private String selectdate="datePickerMonthYearInput";
    private String selectdateandtime="dateAndTimePickerInput";
    private String entirecalender="react-datepicker";
    private String monthclickclass="react-datepicker__month-select";
    private String yearclick="react-datepicker__year-select";
    private String dayxpath= "//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]";
    public void datepick() {

        driver.findElement(By.xpath(date1)).click();
    }

    public void select() {
        driver.findElement(By.id(selectdate)).click();
        WebElement drop1=driver.findElement(By.className(monthclickclass));
        WebElement drop2=driver.findElement(By.className(yearclick));
        Select dropdown=new Select(drop1);
        Select dropyear=new Select(drop2);
        System.out.println(dropdown.getOptions().size());
        List<WebElement> displaymonth=dropdown.getOptions();
        for(WebElement monthselect:displaymonth) {
            System.out.println(monthselect.getText());
        }
        dropdown.selectByVisibleText("July");
        dropyear.selectByVisibleText("2022");
        driver.findElement(By.xpath("dayxpath")).click();

    }

    public void dateandtime() {
        driver.findElement(By.id(selectdateandtime)).click();
        Calendar cal=Calendar.getInstance();
        int d= cal.get(Calendar.DATE);
        String date= String.valueOf(d);
        System.out.println(date);


    }


    //sliders

    private String slider="//span[text()='Slider']";
    private String slidertoolbar="//div[@class='range-slider__tooltip__arrow']/../..//input[@type='range']";
    public void slide() {
        TestUtil.windowscroll();
        driver.findElement(By.xpath(slider)).click();
    }
    public void slideaction() {
        WebElement slidertool=driver.findElement(By.xpath(slidertoolbar));
        Actions act=new Actions(driver);
        act.moveToElement(slidertool).dragAndDropBy(slidertool, 25, 50).build().perform();
    }

    //progress bars

    private String progress="//span[text()='Progress Bar']";
    private String startbutton="//button[@id='startStopButton']";
    public void progressbar() {
        TestUtil.windowscroll();
        driver.findElement(By.xpath(progress)).click();
    }

    public void progressaction() {
        WebElement startclick=driver.findElement(By.xpath(startbutton));
        Actions act=new Actions(driver);
        act.click(startclick).build().perform();
        TestUtil.waitElementVisible(startclick);
        act.click(startclick).build().perform();
    }
    //Tabs
    private String tab="//span[text()='Tabs']";
    private String what="demo-tab-what";
    private String origin="demo-tab-origin";
    private String useid="demo-tab-use";
    private String moreid="demo-tab-more";
    public void tabs() {
        driver.findElement(By.xpath(tab)).click();
        Actions act= new Actions(driver);
        WebElement whattab=driver.findElement(By.id(what));
        WebElement origintab=driver.findElement(By.id(origin));
        WebElement usetab= driver.findElement(By.id(useid));
        WebElement moretab=driver.findElement(By.id(moreid));
        act.moveToElement(whattab).click().build().perform();
        act.moveToElement(origintab).click().build().perform();
        act.moveToElement(usetab).click().build().perform();
        act.moveToElement(moretab).click().build().perform();
    }

    //Tooltip

    private String tool="//span[text()='Tool Tips']";
    private String mousehover="//button[@id='toolTipButton']";
    private String mousehovertext="//input[@id='toolTipTextField']";
    public void tooltip() {
        TestUtil.windowscroll();
        driver.findElement(By.xpath(tool)).click();
    }
    public void mousehoveraction(String text) {
        WebElement mouseaction= driver.findElement(By.xpath(mousehover));
        WebElement mousetext=driver.findElement(By.xpath(mousehovertext));
        Actions act=new Actions(driver);
        act.moveToElement(mouseaction).build().perform();
        String msg= mouseaction.getText();
        System.out.println(msg);
        act.moveToElement(mousetext).click().sendKeys(text).build().perform();

    }



    //Menu

    private String menu="//span[text()='Menu']";
    private String main1="//a[text()='Main Item 1']";
    private String main2="//a[text()='Main Item 2']";
    private String subitem1 ="//*[@id='nav']/li[2]/ul/li[1]/a";
    private String subitem2 ="//*[@id='nav']/li[2]/ul/li[2]/a";
    private String subitem3="//a[text()='SUB SUB LIST »']";
    private String sub1="//a[text()='Sub Sub Item 1']";
    private String sub2="//a[text()='Sub Sub Item 2']";
    private String mainitem3="//a[text()='Main Item 3']";
    public void menuclick() {
        TestUtil.windowscroll();
        driver.findElement(By.xpath(menu)).click();
    }
    public void mainhover() {
        WebElement main1st= driver.findElement(By.xpath(main1));
        WebElement main2nd=driver.findElement(By.xpath(main2));
        WebElement sub3=driver.findElement(By.xpath(subitem3));
        WebElement subject2=driver.findElement(By.xpath(sub2));
        WebElement main3rd= driver.findElement(By.xpath(mainitem3));
        Actions act=new Actions(driver);
        act.moveToElement(main1st).build().perform();
        act.moveToElement(main2nd).moveToElement(sub3).moveToElement(subject2).build().perform();
        act.moveToElement(main3rd).build().perform();
    }

    //select Menu
    private String selectmenu="//span[text()='Select Menu']";

    public void selectmenuclick() {
        TestUtil.windowscroll();
        driver.findElement(By.xpath(selectmenu)).click();
    }

    //selectmenu

    private String selectdrop="//div[text()='Select Option']";
    private String selectoption="//input[@id='react-select-16-input']";
    private String selecticon="//div[@id='withOptGroup']//div[@class=' css-yk16xz-control']//div[@class= ' css-1wy0on6']//div";

    public void drop1() {

        driver.findElement(By.xpath(selectdrop)).click();
    }

    private String colordrop="oldSelectMenu";
    public void color() {
        WebElement color1=driver.findElement(By.id(colordrop));
        Select dropdown= new Select(color1);
        System.out.println(dropdown.getOptions().size());
        List <WebElement> options=dropdown.getOptions();
        for(WebElement e:options)
        {
            System.out.println(e.getText());
        }
    }
}
