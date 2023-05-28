package testCase;

import java.io.IOException;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunction.General_Function;
import commonFunction.utility_Function;
import io.restassured.path.json.JsonPath;
import product_Repo.Product_data;

public class Pr_test2 {
	@Test
	
	public static void execute() throws IOException {
		
		//step 1 call the methods from Product_data class and save into variable  
		String baseURI=Product_data.Pr_baseURI();
		String resource=Product_data.Pr_resource();
		String requestBody=Product_data.Pr_requestBody1();
		
		//step 2 configure the responses by calling methods from General_Function 
		int statusCode=General_Function.Pr_statusCode(baseURI, resource, requestBody);
		
		String responseBody=General_Function.Pr_responseBody(baseURI, resource, requestBody);
		System.out.println(responseBody);
		
		
		//step 3 parse responseBody param and save in local variable
		JsonPath jspres=new JsonPath(responseBody);
		String res_firstName=jspres.getString("firstName");
		String res_lastName=jspres.getString("lastName");
		String res_id=jspres.getString("id");
		String res_createdAt=jspres.getString("createdAt");
		int count=jspres.getList("products").size();
		
		//step 4 fetch requestbody param and save to local variable 
		JsonPath jspreq=new JsonPath(requestBody);
		String req_firstName=jspreq.getString("firstName");
		String req_lastName=jspreq.getString("lastName");
		String currentdate=LocalDate.now().toString();
		
		//for loop for dataarray
		for( int i=0 ; i<count ; i++)
		{
			//response param
			String res_name=jspres.getString("products["+i+"].name");
		    int res_quantity=jspres.getInt("products["+i+"].quantity");
		    int res_price=jspres.getInt("products["+i+"].price");
		    int res_total=jspres.getInt("products["+i+"].total");
		    
		    String req_name=jspres.getString("products["+i+"].name");
		    int req_quantity=jspreq.getInt("products["+i+"].quantity");
		    int req_price=jspreq.getInt("products["+i+"].price");
		    int req_total=jspreq.getInt("products["+i+"].total");
		    
		    Assert.assertEquals(statusCode, 201);
		    Assert.assertEquals(res_firstName, req_firstName);
		    Assert.assertEquals(res_lastName, req_lastName);
		    Assert.assertEquals(res_name, req_name);
		    Assert.assertEquals(res_quantity, req_quantity);
		    Assert.assertEquals(res_price, req_price);
		    Assert.assertEquals(res_total, req_total);
		    Assert.assertNotNull(res_id);
		    Assert.assertEquals(res_createdAt.substring(0,10), currentdate);
		    
		    
		    
		}
		utility_Function.evidencefilegenerator("Pr_test2", responseBody, requestBody);
	}

}
