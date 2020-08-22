package classemployee;

import java.util.Scanner;

public class Employee{
    String name,address;
    int year;
    public static void Sopln(String str){
        System.out.println(str);
    }
    public static void main(String[] args){
        Sopln("Enter number of Employees for which data is to be stored : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Employee e[] = new Employee[n];
            for(int i=0;i<n;i++){
                e[i] = new Employee();
                e[i].input();
            }
        Sopln("NAME\t\tYEAR OF JOINING\t\tAddress");
            for(int i=0;i<n;i++){
            Sopln(e[i].name+"\t\t"+e[i].year+"\t\t\t"+e[i].address);
            }
        }
    public void input(){
        Scanner s = new Scanner(System.in);
        Sopln("Enter name of Employee :  ");
        name = s.next();
        Sopln("Enter joining year :  ");
        year = s.nextInt();
        Sopln("Enter address of Employee :  ");
        address = s.next();
        }
    }
