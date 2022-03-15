package utility;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class AddplaceReqBuilder {
	public static RequestSpecification reqSpec;
	
	
	
	public static RequestSpecification getRequestSpecification() {
		RequestSpecBuilder builder=new RequestSpecBuilder();
		
		if(reqSpec==null){
			PrintStream p=FileUtils.getLogger();
			builder = new RequestSpecBuilder();
			builder.setBaseUri(FileUtils.getProperty("baseURI"));
			builder.addHeader("Content-Type", "application/json");
			builder.addQueryParam("key", "qaclick123");
			builder.addFilter(RequestLoggingFilter.logRequestTo(p));
			builder.addFilter(ResponseLoggingFilter.logResponseTo(p));
			//ResponseLoggingFilter.responseLogger().
			reqSpec=builder.build();
		}
		
		return reqSpec;
	}
	
	
	public static ResponseSpecBuilder getResponseSpecification() {
		ResponseSpecBuilder rspSpec= new ResponseSpecBuilder();
		
		
		return rspSpec;
		
	}
	
	

}
