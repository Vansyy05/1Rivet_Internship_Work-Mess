package com.application;



import java.util.Scanner;

class Baankk{
    private static long acc_no;
    private String Name;
    private long phone_no;
    private long cramount;
    Scanner sc=new Scanner(System.in);

    //method to create account
     void createAccount(){
         System.out.println("Enter Name: ");
        Name= sc.next();
        System.out.println("Enter Phone Number: ");
        phone_no= sc.nextLong();
        System.out.println("Enter Current Amount: ");
        cramount= sc.nextLong();
    }

    //method to display details of account
     void displayAccount(){
        System.out.println("Account Number: "+ acc_no);
        System.out.println("Name: " + Name);
        System.out.println("Phone Number: "+phone_no);
        System.out.println("Available Balance:"+cramount);
    }

    //method to deposit money
    void deposit(){
        System.out.println("Enter amount you want to credit in your account: ");
       long amount= sc.nextLong();
        cramount=cramount+amount;
        System.out.print("Available Balance: "+cramount);
    }

    //method of withdraw money
    void withdraw(){
        System.out.println("Enter amount you want to debit from your account: ");
        long amount=sc.nextLong();
        if(cramount>=amount){
            cramount=cramount-amount;
            System.out.println("Available Balance:"+cramount);
        }else{
            System.out.println("Transaction fail..." + cramount + "\t You did have enough balance");
        }
    }

    //method to print available balance
     void crBalance(){
        System.out.println("Your Current Balance is:"+cramount);
    }
    //public class Bankk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Banking Application: ");
        Baankk b1=new Baankk();
        System.out.println("Enter TRUE if you want to create account else FALSE");
        boolean exist=sc.nextBoolean();
        boolean exit=false;
        if(exist==true){
            System.out.println("Choose your account number: ");
            acc_no=sc.nextLong();
        } else  {
            System.out.println("User Doesn't Exist...");
        }
        if(exist==true){
        do {
            System.out.println("\n Choose the Option:");
            System.out.println(" 1.Create Account \n 2.Deposit \n 3.Withdraw \n 4.Available Balance \n 5.Exit");
            int userinput=sc.nextInt();

            if (exist == true && userinput==1) {
                b1.createAccount();
                b1.displayAccount();
            }else if(userinput==2){
                b1.deposit();
            } else if (userinput==3) {
                b1.withdraw();
            } else if (userinput==4) {
                b1.crBalance();
            } else if (userinput==5) {
                exit=true;
            }
        }while(!exit);
    }
}}


