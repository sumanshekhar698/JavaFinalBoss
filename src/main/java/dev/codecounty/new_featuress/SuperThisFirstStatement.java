package dev.codecounty.new_featuress;


public class SuperThisFirstStatement{

}

 class User {
    private final String email;

    public User(String email) {
        this.email = email;
    }
}

class Admin extends User {
    public Admin(String email) {
        super(email);
        // NEW: Validate before calling super()
        if (!email.contains("@company.com")) {
            throw new IllegalArgumentException("Invalid admin email");
        }
//        super(email);//JDK 22+
    }
}