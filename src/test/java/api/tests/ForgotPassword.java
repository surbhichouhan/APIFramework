package api.tests;

import api.base.AuthService;
import com.beust.ah.A;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPassword {

    @Test(description = "Verify if Forgot password API is working!!!")
    public void forgotPasswordTest(){
        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("surbhic2000@gmail.com");

        System.out.println(response.asPrettyString());

    }

}
