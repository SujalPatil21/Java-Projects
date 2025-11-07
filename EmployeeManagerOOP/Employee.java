import java.util.Scanner;
public class Employee {

    protected String name ;
    protected int id , salary;
    public Employee(String n , int id , int s) {

        this.name = n ;
        this.id = id ;
        this.salary = s ;
    }

    void display (){

        System.out.println("\nEmployee Name : " + name );
        System.out.println("Employee Id : " + id);
        System.out.println("Employee Salary : " + salary);
    }
}

