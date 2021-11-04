import java.util.Scanner;

//DEFAULT PASSWORD IS 123.
//DEFAULT USERNAME IS ALREADY DEFINED.
//DEFAULT ACCOUNT BALANCE=10000.

public class Atm {
    public static void main(String[] args) throws Exception {

        int ACCOUNT = 10000;
        String USERNAME = "user@SBI-2126578745";

        Scanner scan = new Scanner(System.in);


        try {

            System.out.println("WELCOME TO STATE BANK OF INDIA ATM SERVICES");
            System.out.print("ENTER YOUR PIN : ");
            int pin = scan.nextInt();
            if (pin == 123) {
                System.out.println("CHECKING DETAILS..... ACCESS GRANTED!!!___ WELCOME " + USERNAME+" ___");
                System.out.print("PLEASE SELECT YOUR TRANSACTION MODE -> PRESS D FOR DEPOSIT, PRESS B FOR BALANCE ENQUIRY, PRESS W FOR WITHDRAWAL : ");
                String alpha = scan.next();


                if (alpha.equals("D")) {
                    while (true) {
                        System.out.print("PLEASE ENTER THE AMOUNT TO BE DEPOSITED :");
                        int dep = scan.nextInt();
                        if (dep < 1_000_000 && dep > 100) {
                            System.out.print(dep + " HAS BEEN DEPOSITED TO YOUR ACCOUNT, CURRENT BALANCE = " + (ACCOUNT + dep));
                            break;
                        }
                        System.out.println("DEPOSIT ABOVE 1 MILLION AND BELOW 100 ARE NOT ALLOWED, ENTER AN AMOUNT BETWEEN 100 AND 1 MILLION");
                    }


                } else if (alpha.equals("B")) {
                    System.out.print("CURRENT BALANCE =" + ACCOUNT);


                } else if (alpha.equals("W")) {
                    while (true) {
                        System.out.print("ENTER THE AMOUNT TO BE WITHDRAWN :");
                        int with = scan.nextInt();
                        if (with <= 20000 && with >= 100 && with < ACCOUNT) {
                            System.out.print(with + " HAS BEEN WITHDRAWN FROM YOUR ACCOUNT, CURRENT BALANCE = " + (ACCOUNT - with));
                            break;
                        }
                        System.err.println("WITHDRAWAL ABOVE 20000 AND BELOW 100 IS NOT ALLOWED AND MINIMUM BALANCE OF 500 NEEDS TO BE THE THERE IN YOUR ACCOUNT");
                        System.out.println("ENTER AN AMOUNT BETWEEN 100 AND 20000");
                    }
                } else {
                    System.err.println("YOU HAVE ENTERED AN INVALID CHARACTER, PLEASE RE-INSERT YOUR CARD AND CAREFULLY ENTER THE CORRECT ALPHABET");
                }

            } else {
                System.err.println("!!ACCESS DENIED!! -> INVALID PIN -> PLEASE CHECK YOUR PIN OR RE-INSERT YOUR CARD");
            }
        } catch (Exception e) {
            System.err.println("OOPS...THIS IS A NUMBER FIELD, KINDLY RE-INSERT YOUR CARD AND CAREFULLY ENTER NUMBERS");
        }
    }
}
