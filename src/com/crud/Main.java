package com.crud;
import java.util.Scanner;
//View User Interface

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();
        int userOption = -1;

       while(userOption!=0){
           System.out.println("Enter 1-save | 2-update | 3-GetAllDetails | 4-GetDataById | 5-Remove ");
           userOption=sc.nextInt();


           switch (userOption){
               case 1:{
                   controller.save();
                   break;
               }
               case 2:{
                   controller.update();
                   break;
               }
               case 3:{
                   controller.getAllData();
                   break;
               }
               case 4:{
                   controller.getDataById();
                   break;
               }
               case 5:{
                   controller.remove();
                   break;
               }
               case 0:{
                   System.out.println("Program Terminated");
                   break;
               }

               default:{
                   System.out.println("-----Enter Only Given Options-----");
               }
           }
       }

    }
}
