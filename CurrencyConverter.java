import java.util.Scanner;
public class CurrencyConverter{
   double DOLLER_TO_INR = 83.0;
   double EURO_TO_INR = 90.0;
   double YEN_TO_INR = 0.55;
     Scanner sc = new Scanner(System.in);



   public void Convert(){
     System.out.println("\n---Currency Converte---");
     System.out.println("1.Dollar to INR\n2.INR to Dollar\n3.Euro to INR\n4.INR to Euro\n5.Yen to INR\n6.INR to Yen");
     System.out.println("enter choice: ");
     int choice = sc.nextInt();
     System.out.println("enter amount: ");
     double amt = sc.nextDouble();

     switch (choice) {
       case 1:System.out.println("Dollar to INR = "+(amt*DOLLER_TO_INR));break;
       case 2:System.out.println("INR to dollar = "+(amt/DOLLER_TO_INR));break;
       case 3:System.out.println("Euro to INR = "+(amt*EURO_TO_INR));break;
       case 4:System.out.println("INR to Euro = "+(amt/EURO_TO_INR));break;
       case 5:System.out.println("Yen to INR = "+(amt*YEN_TO_INR));break;
       case 6:System.out.println("INR to Yen = "+(amt/YEN_TO_INR));break;
       default:System.out.println("Invalid choice!");
       }//switch
       }//convert

public static void main(String[]args){
     CurrencyConverter currency = new CurrencyConverter();
     currency.Convert();
     }//main
}//class