package _02_02;

public class Ticket {
  
  private String destination;

  private double price;

  private boolean isReturn;

  public Ticket() {
    this.destination = "Unknown";
    this.price = 0.0;
    this.isReturn = false;
  }
}
