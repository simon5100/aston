package module3.strategy;

public class Phone {

    private User user;

    private AuthenticationStrategy strategy;

    public Phone(User user, AuthenticationStrategy strategy) {
        this.user = user;
        this.strategy = strategy;
    }

    public void unlock(User user) {
        strategy.authentication(this.user, user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AuthenticationStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }
}
