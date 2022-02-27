package payload;

public class Payload {
	
	public static String getAddStudentPayload() {
		return "{\r\n"
				+ "	\"firstName\":\"Sames\",\r\n"
				+ "	\"lastName\":\"Bhatt\",\r\n"
				+ "	\"email\":\"abc123@abc.com\",\r\n"
				+ "	\"programme\":\"ComputerScience\",\r\n"
				+ "	\"courses\":[\r\n"
				+ "			\"C++\",\r\n"
				+ "			\"java\"	\r\n"
				+ "			]\r\n"
				+ "\r\n"
				+ "}";
	}
	
	
	public static String getUpdateStudent() {
		return "{	\r\n"
				+ "	\"id\":101,\r\n"
				+ "	\"firstName\":\"Sam\",\r\n"
				+ "	\"lastName\":\"Bhatt\",\r\n"
				+ "	\"email\":\"abc@abc.com\",	\r\n"
				+ "	\"programme\":\"ComputerScience\",\r\n"
				+ "	\"courses\":[\r\n"
				+ "			\"C++\",\r\n"
				+ "			\"java\",\r\n"
				+ "			\"java script\"	\r\n"
				+ "			]\r\n"
				+ "\r\n"
				+ "}";
	}
	
	
	public static String getPatchStudent() {
		return "";
	}

}
