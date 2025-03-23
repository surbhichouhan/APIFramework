package api.base;

import api.filters.LoggingFilter;
import api.models.request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {//wrapper for RestAssured
    /*this class responsible for -
     * base uri
     * creating the request
     * handling the response
     * */

    private static final String BASE_URL = "https://swift.techwithjatin.com/";
    private RequestSpecification requestSpecification;

    static {
        RestAssured.filters(new LoggingFilter());
    }

    public BaseService() {
        requestSpecification = RestAssured.given().baseUri(BASE_URL);
    }

    protected void setAuthToken(String token){
        requestSpecification.header("Authorization","Bearer "+token);
    }
protected Response getRequest(String endpoint){
return requestSpecification.get(endpoint);
}


    protected Response postRequest(Object payload, String endpoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }


    protected Response putRequest(Object payload, String endpoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
    }
}
