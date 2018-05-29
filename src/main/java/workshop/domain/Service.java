package workshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private static Service service = new Service();
    public List<Guest> guests = new ArrayList<>();
    
    private Service() { }
    
    public static Service getInstance() {
        return service;
    }
    
    public void addGuest(Guest guest) {
        guests.add(guest);
    }
    
    public List<Guest> getGuests() {
        return guests;
    }
    
    public Guest getGuest(String session) {
        for (Guest guest : guests) {
            if (guest.getSession().equals(session)) {
                return guest;
            }
        }
        
        return null;
    }
}
