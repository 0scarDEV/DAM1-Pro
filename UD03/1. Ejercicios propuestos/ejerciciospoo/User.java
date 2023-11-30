package ejerciciospoo;
import java.time.LocalDateTime;
public class User {
    private String email, username, password;
    private LocalDateTime createdAt, lastLogin;
    private boolean enabled;
    public User(String email, String username, String password, boolean enabled) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.createdAt = LocalDateTime.now();
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.enabled = true;
        this.createdAt = LocalDateTime.now();
        this.email = null;
    }
    public User(String username) {
        this.username = username;
        this.password = null;
        this.enabled = true;
        this.createdAt = LocalDateTime.now();
        this.email = null;
    }
}