package api.tests;

import api.base.AuthService;
import api.base.UserProfileManagementService;
import api.models.request.LoginRequest;
import api.models.response.LoginResponse;
import api.models.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProfileRequestTest {

    @Test(description = "Verify the get profile API is working fine!!")
    public void getProfileInfoTest(){
        //first login to application
        AuthService authService = new AuthService();
        Response response = authService.login(new LoginRequest("surbhic","123456"));
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println("token ======= "+ loginResponse.getToken() );


        //then you are able to get profile info - for which we need token which is getting generated via auth service
        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        response = userProfileManagementService.getProfile(loginResponse.getToken());

//        System.out.println("user profile = "+ response.asPrettyString());
       UserProfileResponse userProfileResponse= response.as(UserProfileResponse.class);
        System.out.println("user id = "+userProfileResponse.getId());
        System.out.println("user name = "+userProfileResponse.getUsername());
        System.out.println("user first name = "+userProfileResponse.getFirstName());

    }
}
