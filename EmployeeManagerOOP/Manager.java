public class Manager extends Employee{

    protected String Department;
    public Manager (String n , int id , String d , int s ){
        super(n,id,s);
        this.Department = d;
    }

    @Override
    void display(){
        System.out.println("\nManager Name : " + name);
        System.out.println("Manager Id : " + id);
        System.out.println("Manager Salary : " + salary );
        System.out.println("Manager Department : " + Department);
    }

}
