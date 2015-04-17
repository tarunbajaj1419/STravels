package core.domain;

/**
 * Created by Tarun Bajaj on 09/04/2015.
 */
public class Tempo implements Vehicle{

    private final String registration;
    private final String model;
    private final String make;

    public Tempo(String registration, String model, String make) {
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
}
