package practise;



import io.restassured.*;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import payload.Payload;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.List;

public class RestTestStudent extends TestBuilder {

	//@DisplayName("Geting student data")
	@org.junit.Test
	//@Disabled
	public void createStudent() {
		Response rsp=given().log().ifValidationFails(LogDetail.BODY)
				.contentType(ContentType.JSON).body(Payload.getAddStudentPayload())
		.when().post();
		System.out.println(rsp.body().prettyPrint());
		rsp.then().statusCode(200);
		
	}
	
	@org.junit.Test
	//@Disabled
	public void getStrudentList() {
		JsonPath js = given().contentType(ContentType.JSON)
						.when().get("/list").then().extract().response().jsonPath();
		
		
	List<String> std=js.getList("findAll{it.id<5}.firstName");
	std.stream().forEach(st->System.out.println(st));
	
	
	//name of the students of computerscience:
	
	List<String>bcomStd= js.getList("findAll{it.programme=='Medicine'}.firstName");
	
	System.out.println("Number of medicine std:"+bcomStd.size());
	bcomStd.stream().forEach(st->System.out.println(st));
	
	
		
		
	}
	
	
	@org.junit.Test
	//@Disabled
	public void getAllIds() {
		Response rs= given().contentType(ContentType.JSON).when()
				.get("/list");
		
		JsonPath js= rs.then().extract().jsonPath();
		//List<String> nm= js.getList("findAll{it.id}").toString();
		//nm.forEach(m->System.out.println(nm));
		System.out.println(js.getList("id").toString());
	}
	
	@org.junit.Test
	public void getNameOfaCourse() {
		Response rs= given().contentType(ContentType.JSON).when()
				.get("/list");
		
		JsonPath js= rs.then().extract().jsonPath();
		List<String>nm= js.getList("findAll{it-> it.courses.contains('Accounting')}.firstName");
		System.out.println(nm.toString());
		
		List<HashMap<String,Object>> ob= js.getList("findAll{it-> it.courses.contains('Accounting')}");
		ob.forEach(o->System.out.println(o.toString()));
		System.out.println("************Names from object*****************");
		ob.forEach(o->System.out.println(o.get("id")));
	}
	
}
