
package UAS_PBO.Model;
public class User {
    public String username;
    public String email;
    public String password;

    public User(){
    }
    
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int idUser) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
