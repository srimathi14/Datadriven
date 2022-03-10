package stepdefinitionfile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CommonMethods;
import pages.ElementsPage;

public class Elementfeaturesteps {

    CommonMethods commonMethods = new CommonMethods();
    ElementsPage ElementsPage = new ElementsPage();

    @Given("^user launch application \"(.*)\"$")

    public void launchApplication(String url) {

        commonMethods.launchUrl(url);
    }

    @When("user clicked on Elementspage$")
    public void clickedOnElement() {

        ElementsPage.clickElements();
    }

    @When("user clicked on textbox$")
    public void clickedTextBox() {

		ElementsPage.textboxclick();
    }

    @When("user should be able to type name$")
    public void fullname(DataTable name) {
        List<Map<String, String>> val = name.asMaps(String.class, String.class);
        for (Map<String, String> val1 : val) {
            ElementsPage.name(val1.get("name"));
            ElementsPage.Email(val1.get("lastname"));
        }
    }

    @When("user should be able to type email \"(.*)\"$")
    public void emailtxt(String email) {

        ElementsPage.Email(email);
    }

    @When("user should be able to type current address \"(.*)\"$")
    public void currentAdd(String address) {

        ElementsPage.current(address);
    }

    @When("user should be able to type permanent address \"(.*)\"$")
    public void permanentAddress(String permanentAddress) {

        ElementsPage.current(permanentAddress);
    }

    @When("user should be able to submit and view their details$")
    public void submitAndViewDetails() {

        ElementsPage.Subm();
    }

    //checkboxes
    @When("^user clicked on checkbox$")
    public void checkboxfield() {

        ElementsPage.check();
    }

    @When("^user should be able to check the home checkbox$")
    public void homecheck() {

        ElementsPage.homecheckbutton();
    }

    @When("^user should be able to click on icon button$")
    public void iconbutton() {

        ElementsPage.iconleft();
    }

    @When("^user should be able to click on desktop button$")
    public void deskbutton() {

        ElementsPage.desktop();
    }

    @When("^user should be able to select notecheck checkboxes$")
    public void notecheckbox() {

        ElementsPage.notecheck();
    }

    //Radio button

    @When("^user clicked on Radio button$")
    public void radiobuttonselect() {

        ElementsPage.radioclick();
    }

    @When("^user should be able to click the radio button")
    public void radioselect() {

        ElementsPage.radiobuttonclick();
    }

    //Web tables

    @When("^user clicked on webtable$")
    public void webtableselect() {

        ElementsPage.tableclick();
    }

    @When("^user should be able to edit the table \"(.*)\"$")
    public void webtableedit(String name) {

        ElementsPage.editclick(name);
    }

    //Buttons

    @When("^user clicked on buttons$")
    public void buttontab() {

        ElementsPage.button();
    }

    @When("^user should be able to click on singlebutton$")
    public void singlebuttontab() {

        ElementsPage.singleclick();
    }

    //links

    @When("^user clicked on links$")
    public void linktabclick() {

        ElementsPage.linkclick();
    }
}