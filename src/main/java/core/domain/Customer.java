package core.domain;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by Tarun Bajaj on 09/04/2015.
 */
public class Customer implements JsonSerializable{

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

    @Override
    public JsonObject toJson() {
        return Json.createObjectBuilder()
          .add("name", name)
          .add("phone", phone)
          .add("email", email)
          .add("address", address)
          .build();
    }
}
