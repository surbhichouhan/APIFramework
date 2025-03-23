package api.tests;

import api.base.AuthService;
import api.models.request.SignUpRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class AccountCreationTest {

    @Test
    public void createAccountTest(){
      SignUpRequest req= new SignUpRequest.Builder().
               username("surbhic").
               email("surbhichouhan200@gmail.com")
               .lastName("chouhan")
               .firstName("surbhi")
               .mobileNumber("12121212121")
               .password("123456")
               .build();

        AuthService authService = new AuthService();
        Response response = authService.signUp(req);
        System.out.println(response.asPrettyString());
    }
}
