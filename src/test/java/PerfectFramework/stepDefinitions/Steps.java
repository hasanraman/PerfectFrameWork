package PerfectFramework.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PerfectFramework.pages.Home;
import PerfectFramework.pages.Payment;
import PerfectFramework.pages.Verification;

import java.util.Map;

public class Steps {
    @Given("The user wants to see payment gateway website")
    public void the_user_wants_to_see_payment_gateway_website() {
        System.out.println("website is lunched");
    }
    @When("The user wants buy Elephant toy")
    public void the_user_wants_buy_elephant_toy() {
        Home home=new Home();
        home.setBuyNow();

    }
    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {
        Payment payment = new Payment();
        payment.setcNumber(dataTable.get("CNumber"));
        payment.setCvvCode(dataTable.get("CVVCode"));
        payment.seteMonth(dataTable.get("EMonth"));
        payment.seteYear(dataTable.get("EYear"));

    }
    @Then("The user wants to pay now")
    public void the_user_wants_to_pay_now() {
        Payment payment = new Payment();
        payment.setPayButton();


    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String message) {
        Verification verification=new Verification();
        verification.verifyMessage(message);


    }
}
