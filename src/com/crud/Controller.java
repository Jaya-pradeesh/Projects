package com.crud;
import java.util.*;

public class Controller implements Demo{
    ArrayList<Employee> a = new ArrayList<Employee>();
    Scanner sc = new Scanner(System.in);
    public void save() {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter designation : ");
        String designation = sc.nextLine();

        a.add(new Employee(id,name,salary,designation));
    }
    public void update() {
        System.out.println("Enter value 1 to "+a.size());
        // ask input from the user
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice>=0 && choice <= a.size()){
            Employee selectedEmployee = a.get(choice-1);
            System.out.println("Enter new name : ");
            String newName = sc.nextLine();
            System.out.println("Enter new Salary : ");
            double newSalary = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter new Designation : ");
            String newDesignation = sc.nextLine();

            //now update the new details through setters of Employee class
            selectedEmployee.setName(newName);
            selectedEmployee.setSalary(newSalary);
            selectedEmployee.setDesignation(newDesignation);
            System.out.println("Updation Completed Successfully");
        }
        else {
            System.out.println("Enter valid Number");
        }
    }
    public void getAllData() {
        //iterate through the list
        for(int i=0;i<a.size();i++){
            Employee selectEmployee = a.get(i);
            System.out.println("Employee ID : "+selectEmployee.id);
            System.out.println("Name : "+selectEmployee.name);
            System.out.println("Salary : "+selectEmployee.salary);
            System.out.println("Designation : "+selectEmployee.designation);
            System.out.println("---------------");
        }
    }

    public void getDataById() {
        // display the available id's in the Employee Arrays list
        System.out.println("List of Employee ID : ");
        for(int i=0;i<a.size();i++){
            Employee emp = a.get(i);
            System.out.print(emp.id+", ");
        }
        System.out.println("Enter your Choice : ");
        int choice = sc.nextInt();
        boolean employeeFound =false;
        //set employeeFound initially false
        //if employee is found then mark it as true and then break the loop
        //else print the invalid employee id message
        for(Employee emp:a){
            if(emp.id==choice){
                System.out.println("Employee ID : "+emp.id);
                System.out.println("Name : "+emp.name);
                System.out.println("Salary : "+emp.salary);
                System.out.println("Designation : "+emp.designation);
                employeeFound=true;
                break;
            }

        }
        if(!employeeFound){
            System.out.println("-----Entered Employee Id is invalid-----");
        }

    }


    public void remove() {
        System.out.println("List of Employee ID : ");
        for(int i=0;i<a.size();i++){
            Employee emp = a.get(i);
            System.out.print(emp.id+", ");
        }
        System.out.println("Enter your Choice : ");
        int choice = sc.nextInt();
        boolean removed=false;
        for(Employee emp:a){
            if(emp.id==choice){
                a.remove(emp);
                removed=true;

                break;
            }

        }
        if(!removed){
            System.out.println("Invalid Employee Id");
        }

    }


    public void sort() {

    }
}
