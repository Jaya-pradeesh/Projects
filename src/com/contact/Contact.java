package com.contact;
import java.util.ArrayList;

public class Contact {
    int total_sim;
    ArrayList<String> airtel;

    public Contact(int total_sim, ArrayList<String> airtel) {
        this.total_sim = total_sim;
        this.airtel = airtel;
    }
    //we need addSimCard() taking user name as it's parameter
    public void addSimCard(String userName){
        if(total_sim>0){
            airtel.add(userName);
            System.out.println("Sim for "+userName+" has been successfully added.");
            //once we added a sim to a user then we should reduce the number of SimCard
            total_sim = total_sim-1;
        }
        else {
            System.out.println("Sorry No Sim is Available.");
        }
    }
    public void removeSimCard(String userName){
        if(airtel.remove(userName)){
            System.out.println("Sim card for the user "+userName+"  removed successfully");
            //if the sim card is returned than the total count of sim card will be increased
            total_sim = total_sim+1;
        }
        //if not print a message as user has not found
        else {
            System.out.println("The User "+userName+"  not Found");
        }
    }
}
