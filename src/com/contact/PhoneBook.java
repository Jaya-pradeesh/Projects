package com.contact;

public class PhoneBook {
    Contact contact;
    String simName;
    String location;

    public PhoneBook(Contact contact, String simName, String location) {
        this.contact = contact;
        this.simName = simName;
        this.location = location;
    }
    //create a method to book a sim for the user
    public void bookSim(String userName){
        System.out.println("Booking user "+userName+" for sim "+simName);
        contact.addSimCard(userName);

    }
    public void cancelSim(String userName){
        System.out.println("Booked sim for "+userName+" Canceled");
        contact.removeSimCard(userName);
    }
    public void displayAvailableSim(){
        System.out.println("Total available sim "+contact.total_sim);
    }
}
