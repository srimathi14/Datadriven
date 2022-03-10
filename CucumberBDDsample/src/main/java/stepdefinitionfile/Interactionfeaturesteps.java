package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CommonMethods;
import pages.Interactionspage;

public class Interactionfeaturesteps {
    CommonMethods commonMethods = new CommonMethods();
    Interactionspage interact= new Interactionspage();

    @Given("^user launch tooldemo application \"(.*)\"$")

    public void launchApplication(String url) {

        commonMethods.launchUrl(url);
    }
    @When("^user click the Interaction functionality tab$")
    public  void intearctionapp(){
        interact.Interact();
    }
    @When("^user click the sortable functionality$")
    public void sortapp(){
        interact.sortable();
    }
    @When("^user should be able to perform list tab functions$")
    public void listwindow(){
        interact.listtab();
    }
    @When("^user should be able to move to grid tab$")
    public void gridwindow(){
        interact.gridtab();
    }
    @When("^user click the selectable functionality$")
    public void selectableclick(){
        interact.selectclick();
    }
    @When("^user should be able to click list tab$")
    public void list1tab(){
        interact.list1();
    }
    @When("^user should be able to move to and click grid tab$")
    public void grid1tab(){
        interact.gridListOpen();
    }
    @When("^user click the Resizable functionality$")
    public void resizeapp(){
        interact.resize();
    }
    @When("^user should perform the resizing the box functionality$")
    public void resizing(){
        interact.resize1();
    }

}
