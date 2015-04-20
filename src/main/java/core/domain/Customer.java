package core.domain;

/**
 * Created by Tarun Bajaj on 09/04/2015.
 */
public class Customer {

    private final String name;
    private final String phone;
    private final String email;
    private final String address;

    public Customer(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
