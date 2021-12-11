/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassOOp;

/**
 *
 * @author 98tae
 */
public class User {
    private String User;
    private String Password;
    private String Role;

    public User() {
    }

    public User(String User, String Password, String Role) {
        this.User = User;
        this.Password = Password;
        this.Role = Role;
    }

    
    
    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
    
}
