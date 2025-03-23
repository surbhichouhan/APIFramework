package api.tests;

import api.base.AuthService;
import api.base.UserProfileManagementService;
import api.models.request.LoginRequest;
import api.models.request.ProfileRequest;
import api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UpdateProfileTest {

    @Test
    public void updateProfileTest(){
        AuthService authService = new AuthService();
        Response response = authService.login(new LoginRequest("surbhic","123456"));
        LoginResponse loginResponse = response.as(LoginResponse.class);

        System.out.println("LoginResponse = \n"+response.asPrettyString());

        System.out.println("===============================================");
        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        response = userProfileManagementService.getProfile(loginResponse.getToken());

        System.out.println("get profile  = \n"+response.asPrettyString());
        System.out.println("===============================================");

        ProfileRequest profileRequest = new ProfileRequest.Builder()
                .firstName("surbhi")
                .lastName("chouhan")
                .email("surbhic2000@gmail.com")
                .mobileNumber("1234567890")
                .build();

        System.out.println("Toke -----------"+loginResponse.getToken());
        response =userProfileManagementService.updateProfile(loginResponse.getToken(),profileRequest);

        System.out.println("Update profile = \n"+response.asPrettyString());
        System.out.println("===============================================");

    }
}
