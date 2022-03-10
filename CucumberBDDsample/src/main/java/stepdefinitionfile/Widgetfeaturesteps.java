package stepdefinitionfile;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CommonMethods;
import pages.Widgetspage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Widgetfeaturesteps {
    Widgetspage widget = new Widgetspage();
    CommonMethods commonMethods = new CommonMethods();

    @Given("^user launches application \"(.*)\"$")
    public void launchApply(String url) {
        commonMethods.launchUrl(url);
    }

    @When("^user clicked on widgetstab$")
    public void widgetTab() {
        widget.widgetclick();
    }

    @When("^user clicked on accordian tab$")
    public void accordian() {
        widget.accord();
    }

    @When("^user should be able to click what is loper ipsum$")
    public void question1() {
        widget.quest1();
    }

    @When("^user should be able to click where does it come from$")
    public void question2() {
        widget.quest2();
    }

    @When("^user should be able to click why do we use it$")
    public void question3() {
        widget.quest3();
    }

    //Autocomplete
    @When("^user clicked on autoComplete tab$")
    public void autoComplete() {
        widget.autoclick();
    }

    @When("^user should be able to enter multiple colors$")
    public void multiple(DataTable text) {
        List<Map<String,String>> color = text.asMaps(String.class,String.class);
        widget.multicolors(color);
    }

    @When("^user should be able to enter single input color$")
    public void singleColor(String text) {
        widget.singleinput(text);
    }
    //Date picker

    @When("^user clicked on datepicker$")
    public void datepicker() {

        widget.datepick();
    }

    @When("^user should be able to select date$")
    public void selectthedate() {

        widget.select();
    }

    @When("^user should be able to select date and time$")
    public void selectdateandtime() {

        widget.dateandtime();
    }

    //slider

    @When("^user clicked on slider$")
    public void slidertab() {

        widget.slide();
    }

    @When("^user should be able to move the slider$")
    public void moveslider() {

        widget.slideaction();
    }

    //Progressbar
    @When("^user clicked on progressbar$")
    public void progressbar1() {
        widget.progressbar();
    }

    @When("^user should be able to start and stop the progressbar$")
    public void startandstop() {
        widget.progressaction();
    }

    //Tabs
    @When("^user clicked on tab and move to different tabs$")
    public void tabclick() {
        widget.tabs();
    }

    //Tooltip
    @When("^user clicked on tooltip$")
    public void tooltiptab() {
        widget.tooltip();
    }

    @When("^user should be able to mousehover the element and get text$")
    public void texttooltip(String text) {
        widget.mousehoveraction(text);
    }

    //Menu

    @When("^user clicked on Menu$")
    public void menutabclick() {
        widget.menuclick();
    }

    @When("^user should be able to mousehover the different element tabs$")
    public void mainitemhover() {
        widget.mainhover();
    }

    //select Menu
    @When("^user clicked on selectMenu$")
    public void selectmenu() {

        widget.drop1();
    }

    @When("^user should be able to select the menu from old style selectMenu$")
    public void oldstylemenu() {

        widget.color();
    }

}
