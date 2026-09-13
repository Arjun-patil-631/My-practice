
public class FlightSeat extends AirlineAsset implements Reservable {

    private String seatNumber;
    private boolean available = true;
    private String bookedDate;

    public FlightSeat(String airline, String seatNumber) {
        super(airline);
        this.seatNumber = seatNumber;
    }

    public void book(String date) {

        if (available) {
            available = false;
            bookedDate = date;

            System.out.println("Flight Seat "
                    + seatNumber + " booked for " + date);
        } else {
            System.out.println("Seat "
                    + seatNumber + " is already booked.");
        }
    }

    public void cancel() {

        if (!available) {
            available = true;
            bookedDate = null;

            System.out.println("Booking for Seat "+ seatNumber + " cancelled.");
        } 
        else {
            System.out.println("Seat "+ seatNumber + " is not booked.");
        }
    }

    public void displayStatus() {
        System.out.println("Seat: " + seatNumber);
        System.out.println("Airline: " + airline);
        System.out.println("Status: " + (available ? "Available" : "Booked"));
        System.out.println("Date: "+ (bookedDate == null ? "None" : bookedDate));
    }
}
