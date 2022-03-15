package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CommonMethods;
import pages.Formspage;

public class Formfeaturesteps {
    CommonMethods commonMethods = new CommonMethods();
    Formspage form = new Formspage();

    @Given("^User launches application \"(.*)\"$")
    public void launchapp(String url){
        commonMethods.launchUrl(url);

    }

    @When("^user clicked on Formspage$")
    public void formclick(){

        form.clickForms();
    }
    @When("^user clicked on practice forms$")
    public void practice(){

        form.practiceForms();
    }
    @When("^user should be able to enter firstname \"(.*)\"$")
    public void first(String text){

        form.studentfirst(text);
    }
    @When("^user enter lastname \"(.*)\"$")
    public void last(String text){

        form.stulast(text);
    }
    @When("^user enter email \"(.*)\"$")
    public void emailtext(String text){

        form.stuemail(text);
    }
    @When("user clicks on  genderbutton$")
    public void gender(){

        form.gender1();
    }
    @When("^user enter mobilenumber \"(.*)\"$")
    public void mobile(String text){

        form.mobilenum(text);
    }
    @When("^user click on currentdatecal$")
    public void date1(){

        form.dateofbirth();
    }
    @When("^user enter subjects \"(.*)\"")
    public void subjects(String text){

        form.subject(text);
    }
    @When("^user checked the hobbies$")
    public void hobby(){

        form.hobbies();
    }
    @When("^user enter current address \"(.*)\"$")
    public void current(String text){

        form.currentaddress(text);
    }
    @When("^user enter select city$")
    public void cityselect(){

        form.selectStateAndCity();
    }
    @When("^user should be able to submit the application$")
    public void submitform(){

        form.submitclick();
    }
}
