package api.base;

import api.models.request.LoginRequest;
import api.models.request.SignUpRequest;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseService{
    private final static String BASE_PATH = "/api/auth/";

    public Response login(LoginRequest payload){
return postRequest(payload,BASE_PATH+"login");
    }

    public Response signUp(SignUpRequest payload){
        return postRequest(payload,BASE_PATH+"signUp");
    }

    public Response forgotPassword(String emailAddress){
        HashMap<String, String> payload = new HashMap<String,String>();
        payload.put("email", emailAddress);
        return postRequest(payload, BASE_PATH+"forgot-password");
    }
}
