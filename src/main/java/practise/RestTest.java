package practise;
import io.restassured.*;
import io.restassured.authentication.FormAuthConfig;
import io.restassured.config.LogConfig;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.path.json.JsonPath;
import pojo.Addplace;
import pojo.Location;
import utility.FileUtils;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;


public class RestTest {
	
	public static void main (String args []) {
		/*
		Location loc =new Location();
		loc.setLat(-38.383494);
		loc.setLng(-38.383494);
		List<String>typ= new ArrayList<String>();
		typ.add("Hotel");
		typ.add("Room");
		RestAssured.baseURI="https://rahulshettyacademy.com";
		Addplace place = new Addplace();
		place.setAccuracy("50");
		place.setName("Arina home");
		place.setPhone_number("(+91) 983 893 3937");
		place.setLanguage("Enghlish-EN");
		place.setWebsite("www.abc.com");
		place.setLocation(loc);
		place.setTypes(typ);
		
		
		JsonPath js=given().log().all().header("Application-Type","application/json").queryParam("key", "qaclick123")
		.body(place).when().post("/maps/api/place/add/json").then().log().all().extract().jsonPath();
		
		System.out.println(js.getString("place_id"));*/
		
		System.out.println(FileUtils.getProperty("GetpalceURI"));
		
		System.out.println(Integer.parseInt("200"));
		RequestSpecificationImpl rsq;
		
		given().auth().form("user","pwd",new FormAuthConfig("/login","sName","pName"));
		/*
		given().header("Content-Type","application/json")
		.config(config.logConfig(LogConfig.logConfig().blacklistHeader(DEFAULT_BODY_ROOT_PATH, args))))
	*/}

}
