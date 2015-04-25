package core.domain;

/**
 * Created by Tarun Bajaj on 09/04/2015.
 */
public interface Vehicle extends JsonSerializable{

    String getRegistration();

    String getModel();

    String getMake();
}
