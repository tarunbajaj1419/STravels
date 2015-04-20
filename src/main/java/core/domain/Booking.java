package core.domain;

import java.time.LocalDateTime;

/**
 * Created by tarunbajaj on 20/04/15.
 */
public class Booking {

  private final LocalDateTime bookingDateTime;
  private final LocalDateTime reservationStartDateTime;
  private final LocalDateTime reservationEndDateTime;
  private final String pickupAddr;
  private final Customer customer;


  public Booking(
    LocalDateTime bookingDateTime,
    LocalDateTime reservationStartDateTime,
    LocalDateTime reservationEndDateTime,
    String pickupAddr,
    Customer customer) {

    this.bookingDateTime = bookingDateTime;
    this.reservationStartDateTime = reservationStartDateTime;
    this.reservationEndDateTime = reservationEndDateTime;
    this.pickupAddr = pickupAddr;
    this.customer = customer;
  }

  public LocalDateTime getBookingDateTime() {
    return bookingDateTime;
  }

  public LocalDateTime getReservationStartDateTime() {
    return reservationStartDateTime;
  }

  public LocalDateTime getReservationEndDateTime() {
    return reservationEndDateTime;
  }

  public String getPickupAddr() {
    return pickupAddr;
  }

  public Customer getCustomer() {
    return customer;
  }
}
