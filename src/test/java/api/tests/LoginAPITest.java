package api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest {

    @Test(description = "verify the login api is working ...........")
    public void loginTest(){
        RestAssured.baseURI = "https://swift.techwithjatin.com/";
        RequestSpecification x = RestAssured.given();
        RequestSpecification y = x.header("Content-type","application/json");
        RequestSpecification z = y.body("{\"username\":\"SURBHI\",\"password\":\"7389977754\"}");
        Response response =  z.post("/api/tests/auth/login");
        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(),200);
    }
}
