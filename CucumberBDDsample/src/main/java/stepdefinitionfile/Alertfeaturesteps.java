package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Alertspage;
import pages.CommonMethods;

public class Alertfeaturesteps {
    CommonMethods commonMethods = new CommonMethods();
    Alertspage alertpage = new Alertspage();

    @Given("^ user launch application \"(.*)\"$")
    public void launchApplication(String url) {
        commonMethods.launchUrl(url);
    }

    @When("^user clicked on alert,frames and windows tab$")
    public void alertframes() {
        alertpage.alert();
    }

    @When("^user clicked on browse$")
    public void browserwindow() {
        alertpage.browse();
    }

    @When("^user clicked on newTab$")
    public void newtabwindow() {
        alertpage.newtab();
    }

    @When("^user clicked on newwindow$")
    public void newwindow1() {

        alertpage.newwindow();
    }

    //Alerts
    @When("^user clicked on Alerts tab$")
    public void alertclick() {
        alertpage.alertbuttonclick();
    }

    @When("^user should be able to  click button to see window and manage alerts by clicking ok$")
    public void alertpopup() {

        alertpage.alertpop();
    }

    @When("^user should be able to check alert that appears for 5 seconds$")
    public void alerttime() {

        alertpage.alerttimeclick();
    }

    @When("^user should be able to click the button and view confirm box$")
    public void alertconfirmbutton() {

        alertpage.confirm();
    }

    @When("^user should be able to click button and view prompt box \"(.*)\"$")
    public void promptbutton(String val) {

        alertpage.promptbutton(val);
    }

    // Frames
    @When("^user clicked on Frames tab$")
    public void frametab() {

        alertpage.framebutton();
    }

    @When("^user should be able to switch to frames and display the text inside frame$")
    public void frameinside() {

        alertpage.getTextFromFrame();
    }

    //Nested Frames
    @When("^user clicked on Nested Frames tab$")
    public void nestedframe() {

        alertpage.nest();
    }

    @When("^user should be able to switch to parent frame display the text inside parent frame$")
    public void parentframetab() {

        alertpage.nestedframes();
    }

    @When("^user should be able to switch from parent frame to child frame and display the text inside child frame$")
    public void childframetab() {

        alertpage.child();
    }

    //Modal Dialogs
    @When("^user clicked on Modal Dialogs tab$")
    public void modeltab() {

        alertpage.modalclick();
    }

    @When("^user should be able to click small modal button$")
    public void smallmodalclick() {

        alertpage.smallmodel();
    }

    @When("^user should be able to click large modal button$")
    public void largemodalclick() {

        alertpage.largemodel();
    }

}
