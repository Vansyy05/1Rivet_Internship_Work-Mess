package com.application;

import java.util.Scanner;

class Bankk{
    private String Name;
    private long phone_no;
	private static long acc_no;
	private long cramount;
    Scanner sc=new Scanner(System.in);

    //method to create account
     void createAccount(){
        System.out.println("Enter Account Number: ");
        acc_no= sc.nextLong();
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
     
//public class Bankk1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Banking Application: ");
        Bankk b1=new Bankk();
        int menu;
        boolean qxit=false;
        do{
            System.out.println("\n Choose the Option:");
            System.out.println(" 1.Create Account \n 2.Deposit \n 3.Withdraw \n 4.Available Balance \n 5.Exit");
            menu= sc.nextInt();
           switch(menu) {
           case 1:
        	   b1.createAccount();
        	   b1.displayAccount();
        	   break;
        	   
           case 2:
        	   b1.deposit();
        	   break;
        	   
           case 3:
        	   b1.withdraw();
        	   break;
        	   
           case 4:
        	   b1.crBalance();
        	   break;
        	   
           case 5:
           qxit=true;
           break;
           }
        
        }while(!qxit);
    }

}
