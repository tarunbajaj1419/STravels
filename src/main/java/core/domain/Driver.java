package core.domain;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by Tarun Bajaj on 09/04/2015.
 */
public class Driver implements JsonSerializable{

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

    @Override
    public JsonObject toJson() {
        return Json.createObjectBuilder()
          .add("name", name)
          .add("address", address)
          .add("phone", phone)
          .build();
    }
}
