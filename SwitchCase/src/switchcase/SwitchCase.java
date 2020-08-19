
package switchcase;

import java.util.Scanner;

public class SwitchCase {
    
    public static void Sopln(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        
        Sopln("Enter your choice : ");
        Sopln("1. Hi!\t 2. Hey!\t 3. Hello!\t 4. Konnichiwa!\t 5. Namastey!");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch(choice){
            case 1 : Sopln("You said Hi.");break;
            case 2 : Sopln("You said Hey.");break;
            case 3 : Sopln("You said Hello.");break;
            case 4 : Sopln("You said Konnichiwa.");break;
            case 5 : Sopln("You said Namastey.");break;
            default : Sopln("Invalid input choice.");
        }
            
    }
    
}
