package Javap;

public class Leap {    
public static void main(String[] args) {    
    int year=2021;    
    if(((year % 4 ==0) && (year % 100 !=0))) {  
        System.out.println("LEAP YEAR");  
    }  
    else{  
        System.out.println("COMMON YEAR");  
    }  
}    
}
