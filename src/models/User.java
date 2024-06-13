package models;

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String gender;

    public User(String username, String password, String firstName, String lastName, String phoneNumber, String gender) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return username;
    }
}
