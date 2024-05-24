package builder_design_pattern;

public class User {
    private String userName;
    private int userId;
    private String email;

    public User(UserBuilder userBuilder) {
        this.userName = userBuilder.userName;
        this.email = userBuilder.email;
        this.userId = userBuilder.userId;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", userId=" + userId + ", email=" + email + "]";
    }

    public static class UserBuilder {
        private String userName;
        private int userId;
        private String email;

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
