package core.domain;

import javax.json.Json;
import javax.json.JsonObject;
import java.time.LocalDateTime;

/**
 * Created by tarunbajaj on 20/04/15.
 */
public class Booking implements JsonSerializable{

  private final LocalDateTime bookingDateTime;
  private final LocalDateTime startDateTime;
  private final LocalDateTime endDateTime;
  private final String pickupAddr;
  private final Customer customer;
  private final Vehicle vehicle;


  public Booking(
    LocalDateTime bookingDateTime,
    LocalDateTime startDateTime,
    LocalDateTime endDateTime,
    String pickupAddr,
    Customer customer,
    Vehicle vehicle) {

    this.bookingDateTime = bookingDateTime;
    this.startDateTime = startDateTime;
    this.endDateTime = endDateTime;
    this.pickupAddr = pickupAddr;
    this.customer = customer;
    this.vehicle = vehicle;
  }

  public LocalDateTime getBookingDateTime() {
    return bookingDateTime;
  }

  public LocalDateTime getStartDateTime() {
    return startDateTime;
  }

  public LocalDateTime getEndDateTime() {
    return endDateTime;
  }

  public String getPickupAddr() {
    return pickupAddr;
  }

  public Customer getCustomer() {
    return customer;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  @Override
  public JsonObject toJson() {
    return Json.createObjectBuilder()
      .add("bookingDateTime", bookingDateTime.toString())
      .add("startDateTime", startDateTime.toString())
      .add("endDateTime", endDateTime.toString())
      .add("pickupAddr", pickupAddr)
      .add("customer", customer.toJson())
      .build();
  }
}
