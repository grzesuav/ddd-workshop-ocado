package io.dddbyexamples.delivery.planning.delivery;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.dddbyexamples.delivery.planning.delivery.StorageUnitsAmounts.StorageUnitsAmountsBuilder;

public class PayloadCapacityPolicySteps {

    private final TransportCapacityPolicy policy = new BasicTransportCapacityPolicy();

    private Transport transport;
    private StorageUnitsAmountsBuilder payload = StorageUnitsAmounts.builder();
    private StorageUnitsAmounts exceedingAmounts;

    @Given("^\"([^\"]*)\" of capacity (\\d+)$")
    public void transport(String type, int capacity) throws Throwable {
        transport = new Transport("", type, capacity);
    }

    @Given("^payload contains (\\d+) pallets$")
    public void payloadContainsPallets(int amount) throws Throwable {
        payload.pallets(amount);
    }

    @Given("^payload contains (\\d+) cages$")
    public void payloadContainsCagesCages(int amount) throws Throwable {
        payload.cages(amount);
    }

    @Given("^payload contains (\\d+) trailers$")
    public void payloadContainsTrailersTrailers(int amount) throws Throwable {
        payload.trailers(amount);
    }

    @When("^Capacity Policy is checked$")
    public void capacityPolicyIsChecked() throws Throwable {
        exceedingAmounts = policy.calculateExceedingAmounts(
                transport,
                payload.build()
        );
    }

    @Then("^capacity is not exceeded$")
    public void capacityIsNotExceeded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^capacity is exceeded with (\\d+) pallets$")
    public void capacityIsExceededWithPallets(int amount) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^capacity is exceeded with (\\d+) cages$")
    public void capacityIsExceededWithOverCagesCages(int amount) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^capacity is exceeded with (\\d+) trailers$")
    public void capacityIsExceededWithOverTrailersTrailers(int amount) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
