package stepdefination;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.restassured.RestAssured;
import pojo.Addplace;
import pojo.Location;
import pojo.Payload;
import resources.PlaceApi;
import utility.AddplaceReqBuilder;
import utility.FileUtils;
import io.restassured.*;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class AddplaceStepDefination {
	public Addplace place;
	public RequestSpecification rq=AddplaceReqBuilder.getRequestSpecification();
	public Response rsponse;
	public static String place_id;
	
	
	
	@Given("^Add place payload$")
    public void add_place_payload()  {
		
		Location loc =new Location();
		loc.setLat(-38.383494);
		loc.setLng(-38.383494);
		List<String>typ= new ArrayList<String>();
		typ.add("Hotel");
		typ.add("Room");
		
		place = new Addplace();
		place.setAccuracy("50");
		place.setName("Arina home");
		place.setPhone_number("(+91) 983 893 3937");
		place.setLanguage("Enghlish-EN");
		place.setWebsite("www.abc.com");
		place.setLocation(loc);
		place.setTypes(typ);	
       
    }

    @When("^user call \"([^\"]*)\" and \"([^\"]*)\" the request$")
    public void user_call_something_and_something_the_request(String api, String mthd) {
    	rq=AddplaceReqBuilder.getRequestSpecification();
    	if(api.equalsIgnoreCase("addplace")) {
    	this.rsponse= given().spec(rq).body(place).when()
    					.post(FileUtils.getProperty(api+"URI"));
    	}
    
    	if(api.equalsIgnoreCase("deleteplace")) {
    		rsponse= given().spec(rq).body(Payload.deletePlaceBody(place_id)).when()
    				.post(PlaceApi.valueOf(api).getApi());
    	}
    }

    @Then("^verify status code \"([^\"]*)\"$")
    public void verify_status_code_something(String status)  {
    	rsponse.then().assertThat().statusCode(Integer.parseInt(status));
    }

    @And("^Verify \"([^\"]*)\" in the response$")
    public void verify_something_in_the_response(String key)  {
        place_id=rsponse.jsonPath().getString(key);
        Assert.assertEquals(false, place_id.isEmpty());
    }

    @And("^Verfiy \"([^\"]*)\" response with \"([^\"]*)\"$")
    public void verfiy_something_response_with_something(String api, String key)  {
        String actual=given().spec(rq).queryParam("place_id", place_id)
        .when().get(FileUtils.getProperty(api+"URI")).then().extract().jsonPath().getString(key);
        
        Assert.assertEquals(actual, place.getName());
        
    }
    
    
    @Given("Delete place payload")
    public void delete_place_payload() {
        
        
    }


}
