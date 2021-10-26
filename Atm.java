import java.util.Scanner;

//DEFAULT PASSWORD IS 123

public class Atm {
    public static void main(String[] args) throws Exception{

        int ACCOUNT = 10000;

        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("WELCOME TO STATE BANK OF INDIA ATM SERVICES");
            System.out.print("ENTER YOUR PIN : ");
            int pin = scan.nextInt();
            if (pin == 123) {
                System.out.println("CHECKING DETAILS....., ACCESS GRANTED!!!");
                System.out.print("PLEASE SELECT YOUR TRANSACTION MODE -> PRESS D FOR DEPOSIT, PRESS B FOR BALANCE ENQUIRY, PRESS W FOR WITHDRAWAL : ");
                String alpha = scan.next();

                if (alpha.equals("D")) {
                    System.out.print("PLEASE ENTER THE AMOUNT TO BE DEPOSITED :");
                    int dep = scan.nextInt();
                    System.out.print(dep + " HAS BEEN DEPOSITED TO YOUR ACCOUNT, CURRENT BALANCE = " + (ACCOUNT + dep));
                } else if (alpha.equals("B")) {
                    System.out.print("CURRENT BALANCE =" + ACCOUNT);
                } else if (alpha.equals("W")) {
                    System.out.print("ENTER THE AMOUNT TO BE WITHDRAWN :");
                    int with = scan.nextInt();
                    System.out.print(with + " HAS BEEN WITHDRAWN FROM YOUR ACCOUNT, CURRENT BALANCE = " + (ACCOUNT - with));

                }
            } else {
                System.out.println("ACCESS DENIED, INVALID PIN!!! -> PLEASE CHECK YOUR PIN.");
            }
        }catch (Exception e){
            System.out.println("PLEASE ENTER A NUMERICAL OR CLEAR THIS EXCEPTION -> "+e);
        }
    }
}
