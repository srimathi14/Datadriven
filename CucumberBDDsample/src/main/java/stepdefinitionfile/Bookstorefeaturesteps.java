package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Bookstorepage;
import pages.CommonMethods;

public class Bookstorefeaturesteps {
    CommonMethods commonMethods = new CommonMethods();
    Bookstorepage book=new Bookstorepage();
    @Given("^user launches the application \"(.*)\"$")

    public void launchApplication(String url) {
        commonMethods.launchUrl(url);
    }
   @When("^user clicked on bookStore page$")
   public void  bookstorepage(){
        book.bookbutton();

   }

    @When("^user clicked on loginbutton$")
    public void loginbutton(){
        book.loginnew();
    }

    @When("^user clicked the new user$")
    public void newuserregister(){
        book.newuser1();
    }
    @When("^user should be able to enter firstname1 \"(.*)\"$")
    public void firstnametab(String text){
        book.firstname(text);
    }
    @When("^user  should be able to enter lastname \"(.*)\"$")
    public void lastnametab(String text){
        book.lastname(text);
    }
    @When("^user should be able to enter the username \"(.*)\"$")
    public void username1(String text){
        book.username1(text);
    }
    @When("^user should be able to enter the password \"(.*)\"$")
    public void password1(String text){
        book.password(text);
    }
    @When("^user checks the captcha image$")
    public void checkcapatcha(){
        book.checkbox();
    }
    @When("^user clicks the register button and it should be able to register$")
    public void registernew(){
        book.register();
    }
}
