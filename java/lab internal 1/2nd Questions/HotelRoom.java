public class HotelRoom extends Accommodations implements Reservable{
    private int roomNumber;
    private boolean available;
    private String bookedDate;

    public HotelRoom(String location, int roomNumber, boolean available){
        super(location);
        this.roomNumber=roomNumber;
        this.available=true;
    }

    public void book(String date){
        if (available) {
            available = false;
            bookedDate = date;

            System.out.println("Hotel Room " + roomNumber +" booked for " + date);
        } 
        else {
            System.out.println("Room " + roomNumber +" is already booked.");
        }
    }
    
    public void cancel(){
        if (!available) {
            available = true;
            bookedDate = null;

            System.out.println("Booking for Room " +roomNumber + " cancelled.");
        } 
        else {
            System.out.println("Room " +roomNumber + " is not booked.");
        }
    }

    public void displayStatus() {
        System.out.println("Room: " + roomNumber);
        System.out.println("Location: " + location);
        System.out.println("Status: " +(available ? "Available" : "Booked"));
        System.out.println("Date: " +(bookedDate == null ? "None" : bookedDate));
    }
}