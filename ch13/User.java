package gr.aueb.cf.ch13;

/**
 * Register the user
 * @version 1.0
 * @author Nikos
 * @since 1.0
 */
public class User {
    long id;
    String firstname;
    String lastname;

    public User() {
    }

    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * It takes the parameters and gives a feedback
     * @param id            the users id
     * @param firstname     the users firstname
     * @param lastname      the users lastname
     */

    public static void registerUser(long id, String firstname, String lastname){
        System.out.println("User is registered successfully");
    }
}
