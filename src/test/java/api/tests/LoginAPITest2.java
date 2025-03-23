package api.tests;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest2 {

    @Test(description = "verify the login api is working ...........")
    public void loginTest(){
//        baseURI = "https://swift.techwithjatin.com/";
        Response response = given()
                .baseUri("https://swift.techwithjatin.com/")
               .header("Content-type","application/json")
               .body("{\"username\":\"surbhic\",\"password\":\"123456\"}")
               .post("/api/tests/auth/login");

        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
