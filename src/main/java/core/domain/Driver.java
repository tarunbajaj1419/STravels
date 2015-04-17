package core.domain;

/**
 * Created by Tarun Bajaj on 09/04/2015.
 */
public class Driver {

    private final String name;
    private final String address;
    private final String phone;

    public Driver(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
