package webtech2.DB;

import java.util.Date;

/**
 * Created by christoph on 04.05.16.
 */
public class User {

    private String  Fistname;
    private String Lastname;
    private String password;
    private String Email;
    private Boolean admin;
    private Date JoinDate;
    private Date LastLogin;



    public User();
    public User(String  Fistname, String Lastname, String password, String Email, Boolean admin, Date JoinDate, Date LastLogin){

    }

    public String getFistname() {
        return Fistname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return Email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public Date getJoinDate() {
        return JoinDate;
    }

    public Date getLastLogin() {
        return LastLogin;
    }

    public void setFistname(String fistname) {
        Fistname = fistname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public void setJoinDate(Date joinDate) {
        JoinDate = joinDate;
    }

    public void setLastLogin(Date lastLogin) {
        LastLogin = lastLogin;
    }


}
