package product_Repo;

public class Product_data {
	
	public static String Pr_baseURI() {
		
		String baseURI="https://reqres.in";
		return baseURI;
		
	}
	
	public static String Pr_resource() {
		
		String resource="/api/users";
		return resource;
	}
	
	public static String Pr_requestBody() {
		
		String requestBody="{\r\n"
				+ "	\"firstName\": \"Siddoji\",\r\n"
				+ "	\"lastName\": \"Shinde\",\r\n"
				+ "	\"executiveSummary\": \"Below, you will find a proposal, etc. etc.\",\r\n"
				+ "	\"products\": [\r\n"
				+ "		{\r\n"
				+ "			\"name\": \"test product\",\r\n"
				+ "			\"quantity\": 5,\r\n"
				+ "			\"price\":50,\r\n"
				+ "			\"total\": 250\r\n"
				+ "		},\r\n"
				+ "		{\r\n"
				+ "			\"name\": \"Creative Name\",\r\n"
				+ "			\"quantity\": 10,\r\n"
				+ "			\"price\": 20,\r\n"
				+ "			\"total\": 200\r\n"
				+ "		}\r\n"
				+ "	]\r\n"
				+ "}";
		return requestBody;
	}
	
public static String Pr_requestBody1() {
		
		String requestBody="{\r\n"
				+ "	\"firstName\": \"Pranay\",\r\n"
				+ "	\"lastName\": \"Chavan\",\r\n"
				+ "	\"executiveSummary\": \"Below, you will find a proposal, etc. etc.\",\r\n"
				+ "	\"products\": [\r\n"
				+ "		{\r\n"
				+ "			\"name\": \"mobile\",\r\n"
				+ "			\"quantity\": 10,\r\n"
				+ "			\"price\":5000,\r\n"
				+ "			\"total\": 5000\r\n"
				+ "		},\r\n"
				+ "		{\r\n"
				+ "			\"name\": \"mobile case\",\r\n"
				+ "			\"quantity\": 10,\r\n"
				+ "			\"price\": 100,\r\n"
				+ "			\"total\": 1000\r\n"
				+ "		}\r\n"
				+ "	]\r\n"
				+ "}";
		return requestBody;
	}


}
