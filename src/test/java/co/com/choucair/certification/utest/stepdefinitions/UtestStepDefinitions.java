package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.UtestData;
import co.com.choucair.certification.utest.tasks.*;
import co.com.choucair.certification.utest.tasks.VerifyCompleted;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^click register$")
    public void RobinsonSeeksToRegisterOnTheUtestWebSite() {
        OnStage.theActorCalled("Robinson").wasAbleTo(OpenUp.thePage(), (TopPage.ThePage()));
    }

    @When("^record of each steps$")
    public void HeCompletesEachStepOfTheUserRegistration(List<UtestData> utestData) {
        OnStage.theActorCalled("Robinson").wasAbleTo(StepFirts.OnThePage(utestData.get(0).getStrPrimerNombre(), utestData.get(0).getStrPrimerApellido(),utestData.get(0).getStrCorreo()));
        OnStage.theActorCalled("Robinson").wasAbleTo((StepSecond.OnThePage()));
        OnStage.theActorCalled("Robinson").wasAbleTo((StepThird.OnThePage()));
        OnStage.theActorCalled("Robinson").wasAbleTo((StepFourth.OnThePage(utestData.get(0).getStrClave(),utestData.get(0).getStrConfirmarClave())));
    }

    @Then("^verify that the user registration is correct$")
    public void VerifyThatThRegistrationHasBeenCorrectly(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCompleted.toThe((question))));
    }
}
