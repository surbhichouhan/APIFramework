package api.tests;

import api.base.AuthService;
import api.models.request.LoginRequest;
import api.models.response.LoginResponse;
import com.beust.ah.A;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(api.listeners.TestListener.class)
public class LoginAPITest3 {

    @Test(description = "verify the login api is working ...........")
    public void loginTest(){
        /*
        AuthService authService = new AuthService();
        Response response = authService.login("{\"username\":\"surbhic\",\"password\":\"123456\"}");
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);
        */
//        -------------------------pojo+serialization(default happening due to jackson library
        /*
        LoginRequest loginRequest = new LoginRequest("surbhic","123456");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);
*/

//        --------------------deserialization - created LoginResponse method---------
        LoginRequest loginRequest = new LoginRequest("surbhic","123456");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
       LoginResponse loginResponse = response.as(LoginResponse.class); // it takes the response body and convert it into java object for that you must have your pojo class and this as method calls the jackson utility internally

        System.out.println(loginResponse.getToken());
        System.out.println(loginResponse.getUsername());

Assert.assertTrue(loginResponse.getToken()!=null);
Assert.assertEquals(loginResponse.getUsername(),"surbhic");

    }
}
