package practise;


import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.Payload;

import static io.restassured.RestAssured.*;


public class UpdateStudent extends TestBuilder {
	
	

	
	//@org.junit.Test
	public void zputRequest() {
		
		System.out.println("******************Executing put request*******");
		Response rsp=given().contentType(ContentType.JSON).body(Payload.getUpdateStudent())
		.when().put("/101");
		
		String rspBody=rsp.then().extract().response().body().prettyPrint();
		System.out.println(rspBody);
		System.out.println("session:"+rsp.getSessionId());
		System.out.println(rsp.getStatusCode());
		
	}
	
	//@org.junit.Test
	public void patchStudent() {
		System.out.println("********Executing Patch request*****************");
		Response rsp=given().contentType(ContentType.JSON).body("{\r\n"
				+ "	\"email\":\"subhash.bhtt@yahoo.com\"\r\n"
				+ "	\r\n"
				+ "}")
				.when().patch("/101");
				
				String rspBody=rsp.then().extract().response().body().prettyPrint();
				System.out.println(rspBody);
				System.out.println("session:"+rsp.getSessionId());
				System.out.println(rsp.getStatusCode());
	}
	


}
