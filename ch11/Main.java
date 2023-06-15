package gr.aueb.cf.ch11;

public class Main {
    public static void main(String[] args) {
        User alice = new User();
        UserCredentials bob = new UserCredentials(1,"bob123","12345");

        alice.setId(0);
        alice.setFirstname("Alice");
        alice.setLastname("Alice12");

        System.out.println("id: " + alice.getId() + " Firstname: " + alice.getFirstname() + " Lastname: " + alice.getLastname());
        System.out.println("id: " + bob.getId() + " Username: " + bob.getUsername() + " Password: " + bob.getPassword());
    }
}
