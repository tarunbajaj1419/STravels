package core.domain;

import javax.json.Json;
import javax.json.JsonObject;
import java.time.LocalDateTime;

/**
 * Created by tarunbajaj on 20/04/15.
 */
public class Receipt implements JsonSerializable{

  private final long id;
  private final LocalDateTime dateTime;
  private final int distance;
  private final float amount;
  private final Booking booking;

  public Receipt(long id, LocalDateTime dateTime, int distance, float amount, Booking booking) {
    this.id = id;
    this.dateTime = dateTime;
    this.distance = distance;
    this.amount = amount;
    this.booking = booking;
  }

  public long getId() {
    return id;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public int getDistance() {
    return distance;
  }

  public float getAmount() {
    return amount;
  }

  public Booking getBooking() {
    return booking;
  }

  @Override
  public JsonObject toJson() {
    return Json.createObjectBuilder()
      .add("id", id)
      .add("dateTime", dateTime.toString())
      .add("distance", distance)
      .add("amount", amount)
      .add("booking", booking.toJson())
      .build();
  }
}
