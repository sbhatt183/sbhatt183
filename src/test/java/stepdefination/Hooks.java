package stepdefination;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@Deleteplace")
	public void beforeDeletePlace() {
		System.out.println("In side Before annotation");
		if(AddplaceStepDefination.place_id==null) {
			System.out.println("Place id is null");
		AddplaceStepDefination m= new AddplaceStepDefination();
		m.add_place_payload();
		m.user_call_something_and_something_the_request("addplace", "POST");
		m.verify_something_in_the_response("place_id");
		}
	}

}
