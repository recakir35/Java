package lesson35_Exceptions.Ex04_User_;

public class User {
    int id;
    String username;
    String pasword;
    boolean active;
    boolean signedIn;

    public User() {
    }

    public User(int id, String username, String pasword, boolean active, boolean signedIn) {
        this.id = id;
        this.username = username;
        this.pasword = pasword;
        this.active = active;
        this.signedIn = signedIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pasword='" + pasword + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
