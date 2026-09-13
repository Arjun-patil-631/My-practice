public class DemoBooking {

    public static void main(String[] args) {

        HotelRoom room= new HotelRoom("Hyderabad", 101, true);
        FlightSeat seat= new FlightSeat("Air India", "12A");

        //Hotel booking
        System.out.println("===== HOTEL =====");
        room.displayStatus();
        room.book("15-09-2026");
        room.displayStatus();
        room.book("20-09-2026");
        room.cancel();
        room.displayStatus();

        //Flight resservations
        System.out.println("\n===== FLIGHT =====");
        seat.displayStatus();
        seat.book("18-09-2026");
        seat.displayStatus();
        seat.book("20-09-2026");
        seat.cancel();
        seat.displayStatus();
    }
}
