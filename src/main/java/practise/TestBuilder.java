package practise;



import io.restassured.RestAssured;

public class TestBuilder {

	@io.cucumber.java.BeforeAll
	public static void init() {
		
		RestAssured.baseURI="http://localhost/";
	RestAssured.basePath="/student";
	RestAssured.port=8080;
	}
}
