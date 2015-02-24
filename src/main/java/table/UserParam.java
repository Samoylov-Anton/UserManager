package table;

import javax.persistence.*;

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
    private Integer timezone;

    @Column(name = "datetimecreate")
    private Integer datetimecreate;

    @Column(name = "datetimeedit")
    private Integer datetimeedit;

    @Column(name = "role")
    private String role;
}