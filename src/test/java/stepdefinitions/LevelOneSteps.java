package stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.LevelOnePage;

public class LevelOneSteps {

    LevelOnePage levelone= new LevelOnePage();


    @Given("^I am in demoqa page$")
    public void iAmInDemoqaPage() {
        levelone.iAmInDemoqaPage();
    }


    @And("^I write the (.+) and (.+)$")
    public void iWriteTheUserAndPassword(String User, String Password) {
        levelone.iAmInDemoqaPage(User,Password);
        levelone.clickLogin();
        levelone.clickStore(); 
    }

    @When("^I search a book with name book$")
    public void iSearchABookWithNameBook(){     
        levelone.iSearchABookWithNameBook("Speaking");
    }

    @And("^select a book$")
    public void selectABook()throws InterruptedException{          
        levelone.clickBook();                
        levelone.clickAdd();        
        levelone.dismissAlert();    
        
    }

    @Then("^I back the coleccion$")
    public void iBackTheColeccion(){
        levelone.clickProfile();
    }

    @And("^I validate a book$")
    public void iValidateABook(){
       Assert.assertEquals("Speaking JavaScript", levelone.firstResult());
    }

    
}
