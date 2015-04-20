package core.domain;

import java.time.LocalDateTime;

/**
 * Created by tarunbajaj on 20/04/15.
 */
public class Receipt {

  private final long id;
  private final LocalDateTime dateTime;
  private final float amount;
  private final Booking booking;

  public Receipt(long id, LocalDateTime dateTime, float amount, Booking booking) {
    this.id = id;
    this.dateTime = dateTime;
    this.amount = amount;
    this.booking = booking;
  }

  public long getId() {
    return id;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public float getAmount() {
    return amount;
  }

  public Booking getBooking() {
    return booking;
  }
}
