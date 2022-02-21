package pojo;

public class Payload {
	
	public static String deletePlaceBody(String placId) {
		return "{\r\n"
				+ "    \"place_id\":\""+placId+"\"   	 	}\r\n"
				+ "";
	}

}
