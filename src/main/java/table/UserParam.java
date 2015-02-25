package table;

import javax.persistence.*;
import java.util.TimeZone;

@Entity
@Table(name = "userparam")
public class UserParam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "password")
    private String password;

    @Column(name = "timezone")
    private TimeZone timezone;

    @Column(name = "datetimecreate")
    private String datetimecreate;

    @Column(name = "datetimeedit")
    private String datetimeedit;

    @Column(name = "role")
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TimeZone getTimezone() {
        return timezone;
    }

    public void setTimezone(TimeZone timezone) {
        this.timezone = timezone;
    }

    public String getDatetimecreate() {
        return datetimecreate;
    }

    public void setDatetimecreate(String datetimecreate) {
        this.datetimecreate = datetimecreate;
    }

    public String getDatetimeedit() {
        return datetimeedit;
    }

    public void setDatetimeedit(String datetimeedit) {
        this.datetimeedit = datetimeedit;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
