package Abstraction_Presentation;

public class Bank_Main {
    public static void main(String[] args) {
        //Bank b1 = new Bank(); //As bank is abstract class you cannot create an object for it
        Bank b1 = new HDFC();
        Bank b2 = new ICICI();
        Bank b3 = new SBI();
        System.out.println("Total funds in HDFC bank is "+b1.funds());
        System.out.println("Total funds in ICICI bank is "+b2.funds());
        System.out.println("Total funds in SBI bank is "+b3.funds());
    }
}
