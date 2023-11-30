package ejerciciospoo;
import java.time.LocalDateTime;
public class User {
    private String email, username, password;
    private LocalDateTime createdAt, lastLogin;
    private boolean enabled;
    public User(String username, String password, String email, boolean enabled) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
        this.createdAt = LocalDateTime.now();
    }
    public User(String username, String password) {
        this(username, password, null, true);
    }
    public User(String username) {
        this(username, null, null, true);
    }

    @Override public String toString() {
        return username;
    }

    public static void main(String[] args) {
        User user1 = new User("ofernpast");
        System.out.println(user1);
    }
}