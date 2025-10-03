class Account_M{

    int id ;
    String Name;
    int Balance;

    Account_M(int id, String Name , int Balance) {

        this.id = id;
        this.Name = Name;
        this.Balance = Balance;
    }
        void display(){

            System.out.println("\nAccount Id : " + id);
            System.out.println("Account Name : " + Name);
            System.out.println("Account Balance : " + Balance);

        }


}

public class Account {

    public static void main(String[] args){

        System.out.println("\n\t----ACCOUNT DETAILS----");
        Account_M a1 = new Account_M(01,"Sujal",7000000);
        Account_M a2 = new Account_M(02,"Tejas",7000000);
        Account_M a3 = new Account_M(03,"Shreya",7000000);

        a1.display();
        a2.display();
        a3.display();

    }
}