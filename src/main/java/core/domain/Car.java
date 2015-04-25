package core.domain;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by Tarun Bajaj on 09/04/2015.
 */
public class Car implements Vehicle {

    private final String registration;
    private final String model;
    private final String make;

    public Car(String registration, String model, String make) {
        this.registration = registration;
        this.model = model;
        this.make = make;
    }

    @Override
    public String getRegistration() {
        return registration;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public JsonObject toJson() {
        return Json.createObjectBuilder()
          .add("registration", registration)
          .add("model", model)
          .add("make", make)
          .build();
    }
}
