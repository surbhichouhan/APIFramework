package api.models.response;

import java.util.List;

public class LoginResponse {

    private String token;
    private String type;
    private String username;
    private String password;
    private String email;
    private int id;
    private List<String> roles;

public LoginResponse(){

}
    public LoginResponse(String token, String type, String username, String password, String email, int id, List<String> roles) {
        this.token = token;
        this.type = type;
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "token='" + token + '\'' +
                ", type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", roles=" + roles +
                '}';
    }
}
