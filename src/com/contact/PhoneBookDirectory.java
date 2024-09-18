package com.contact;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookDirectory {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact(5,new ArrayList<String>());
        PhoneBook booking = new PhoneBook(contact,"airtel","Chennai");

        while(true){
            System.out.println("1-BookSim || 2-CancelSim || 3-DisplayTotalSim || 4-Exit");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:{
                    System.out.println("Enter UserName to Book ");
                    String userName =sc.nextLine();
                    booking.bookSim(userName);
                    break;
                }
                case 2:{
                    System.out.println("Enter UserName to Cancel ");
                    String userName =sc.nextLine();
                    booking.cancelSim(userName);
                    break;
                }
                case 3:{
                    booking.displayAvailableSim();
                    break;
                }
                case 4:{
                    System.out.println("-----Terminated-----");
                    System.exit(0);
                    break;
                }

            }


        }
    }
}
