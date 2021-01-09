package opening;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import opening.Opening;
import opening.OpeningFactory;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" })
public class RunCucumberTest {
  
  @Given("^I want to register an opening$")
  public void i_want_to_register_an_opening() throws Exception {
    Opening opening = OpeningFactory.THIS.createOpening();
    OpeningServiceImpl serviceImpl = new OpeningServiceImpl();
    serviceImpl.registerOpening(opening);

    
  }

  @When("^I register$")
  public void i_register() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @Then("^The opening gets registered$")
  public void the_opening_gets_registered() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }
}