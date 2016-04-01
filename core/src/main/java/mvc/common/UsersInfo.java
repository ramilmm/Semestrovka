package mvc.common;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
public class UsersInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "hash_pass")
    private String hash_pass;

    @Column(name = "name")
    private String name;

    @Column(name = "profile_img")
    private String profile_img_url;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy="user")
    @Column(name = "check")
    private List<OrdersInfo> orders;



    public UsersInfo () {}

    public UsersInfo(String login, String hash_pass, String name, String profile_img_url, List<OrdersInfo> orders) {
        this.login = login;
        this.hash_pass = hash_pass;
        this.name = name;
        this.profile_img_url = profile_img_url;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHash_pass() {
        return hash_pass;
    }

    public void setHash_pass(String hash_pass) {
        this.hash_pass = hash_pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile_img_url() {
        return profile_img_url;
    }

    public void setProfile_img_url(String profile_img_url) {
        this.profile_img_url = profile_img_url;
    }

    public List<OrdersInfo> getOrders() {
        return orders;
    }

    public void setOrders(List<OrdersInfo> orders) {
        this.orders = orders;
    }
}
