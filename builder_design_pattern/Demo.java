package builder_design_pattern;

public class Demo {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserName("JohnDoe")
                .setUserId(123)
                .setEmail("johndoe@example.com")
                .build();

        System.out.println(user);
    }
}
