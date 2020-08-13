package findyears;

import java.util.Scanner;

public class FindYears {
    
public static void Sopln(String str){
        System.out.println(str); 
}
public static void main(String[] args){
    int min,hr,day,yr,day1;
    Sopln("Enter the minutes : ");
    Scanner s = new Scanner(System.in);
    min = s.nextInt();
    hr = min/60;
    day = hr/24;
    yr = day/365;
    day1 = day%365;
    Sopln(min+" minutes is approximately equal to "+yr+" years and "+day1+" days.");
    }
      
}
