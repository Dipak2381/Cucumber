package AgileBdd;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.openqa.selenium.By;

/**
 * Created by DIPAK on 4/23/2017.
 */
public class MyStepdefs extends BaseTest
{
    Utiles utiles = new Utiles();

    @Given("^user already on Homepage$")
    public void userAlreadyOnHomepage()  {
         openBrowser();
    }

//    @When("^I click on search box$")
//    public void iClickOnSearchBox()  {
//        driver.findElement(By.id("small-searchterms")).click();
//
//    }
    @And("^I enter \"([^\"]*)\" on search box$")
    public void iEnterOnSearchBox(String categoriesname)  {
        utiles.searchBox(categoriesname);
    }

    @When("^I click on search button$")
    public void iClickOnSearchButton() {
        driver.findElement(By.xpath(".//*[@id='small-search-box-form']/input[2]")).click();
    }


    @Then("^I can see all  \"([^\"]*)\" on page$")
    public void iCanSeeAllOnPage(String arug01)  {

    }
}
