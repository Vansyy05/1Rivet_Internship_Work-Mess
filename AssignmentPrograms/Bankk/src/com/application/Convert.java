package com.application;

import java.util.Scanner;

public class Convert{    
     public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
        String s = sc.nextLine();    
        int count;    
        char string[] = s.toCharArray();    
            
        System.out.print("Duplicate characters in a given string: ");    
         
        for(int i = 0; i <string.length; i++) {    
            count = 1;    
            for(int j = i+1; j <string.length; j++) {    
                if(string[i] == string[j] && string[i] != ' ') {    
                    count++;    
                     
                    string[j] = '0';    
                }    
            }    
             
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    
        }    
    }    
}     