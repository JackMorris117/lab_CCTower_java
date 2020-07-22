import java.util.ArrayList;

public class Bedroom {
    private int capacity;
    private int roomNumber;
    private ArrayList<Guest> checkedIn;
    private String type;

    public Bedroom(int capacity, int roomNumber, String type){
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.checkedIn = new ArrayList<Guest>();
        this.type = type;
    }

    public int getCapacity(){return capacity;}

    public int getRoomNumber(){return roomNumber;}

    public String getType(){return type;}

    public ArrayList getCheckedIn(){return checkedIn;}

    public int getAmount(){return checkedIn.size();}

    public Boolean hasCapacity(){return capacity > checkedIn.size();}

    public void addGuest(Guest guest){
        if(hasCapacity()) {
            this.checkedIn.add(guest);
        }
    }



}