import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> bookedIn;
    private String name;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.bookedIn = new ArrayList<Guest>();
        this.name = name;
    }
    public int getCapacity(){return capacity;}

    public String getRoomName(){return name;}

    public ArrayList getBookedIn(){return bookedIn;}

    public int getAmount(){return bookedIn.size();}

    public Boolean hasCapacity(){return capacity > bookedIn.size();}

    public void addGuest(Guest guest){
        if(hasCapacity()) {
            this.bookedIn.add(guest);
        }
    }


}
