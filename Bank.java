import java.util.Scanner;

class BankSub{
    Scanner sc = new Scanner(System.in);
    char option;
    String name,address,sex,confirm;
    int BALANCE, age,panNumber,pinNumber;
    public void detailsInput() {

        System.out.println("WELCOME TO INDIAN OVERSEAS BANK ACCOUNT CREATION");

        System.out.print("ENTER YOUR NAME: ");
        name=sc.nextLine();
        System.out.print("ENTER YOUR SEX: ");
        sex = sc.next();
        System.out.print("ENTER YOUR AGE: ");
        age =sc.nextInt();
        sc.nextLine();// to rectify nextLine() error.
        System.out.print("ENTER YOUR ADDRESS: ");
        address= sc.nextLine();
        System.out.print("ENTER YOUR PAN NUMBER: ");
        panNumber=sc.nextInt();
        System.out.print("PLEASE CREATE A 4 DIGIT SECRET PIN NUMBER FOR YOUR ACCOUNT(DO NOT SHARE THIS NUMBER WITH ANYONE!): ");
        pinNumber=sc.nextInt();
        System.out.print("HOW MUCH YOU ARE GOING TO DEPOSIT FOR THE FIRST TIME: ");
        BALANCE = sc.nextInt();

    }
    public void detailsOutput(){
        System.out.println();
        System.out.println();
        System.out.println("WELCOME "+name+" PLEASE VERIFY YOUR DETAILS AND PROCEED TO NEXT STEP");
        System.out.println();
        System.out.println();
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
        System.out.println("SEX:"+sex);
        System.out.println("ADDRESS:"+address);
        System.out.println("PAN NUMBER:"+panNumber);
        System.out.println("PIN NUMBER:****");
        System.out.println("CURRENT BALANCE:"+BALANCE);
    }
    public void transactionMode() {
        System.out.println();
        System.out.println();
        System.out.println("HI " +name+" ARE YOU LOOKING FOR YOUR FIRST TRANSACTION? PRESS Y FOR PROCEEDING, PRESS ANY OTHER KEY FOR FOR EXIT");
        confirm = sc.next();
        if (confirm.equals("Y")) {
            System.out.println("PLEASE ENTER YOUR PIN NUMBER");
            int pin = sc.nextInt();
            if (pin == pinNumber) {

                do {
                    System.out.println("A-BALANCE ENQUIRY");
                    System.out.println("B-DEPOSIT");
                    System.out.println("C-WITHDRAWAL");
                    System.out.println("D-EXIT");
                    System.out.println("ENTER THE OPTION:");
                    option = sc.next().charAt(0);
                    switch (option) {
                        case 'A':
                            System.out.println("CURRENT BALANCE = " + BALANCE);
                            break;
                        case 'B':
                            System.out.println("ENTER THE AMOUNT TO BE DEPOSITED: ");
                            int dep = sc.nextInt();
                            if (dep <=100000 && dep > 100) {
                                System.out.println(dep + " RUPEES HAS BEEN DEPOSITED TO YOUR ACCOUNT, CURRENT BALANCE = " + (BALANCE + dep));
                                break;
                            } else {
                                System.out.println("TRANSACTION NOT POSSIBLE, PLEASE ENSURE TO ENTER AN AMOUNT BETWEEN 100 AND 1 LAKH");
                            }
                            break;
                        case 'C':
                            System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN: ");
                            int with = sc.nextInt();
                            if (with <=20000 && with > 100&&with<=(BALANCE-500)) {
                                System.out.println(with + " RUPEES HAS BEEN WITHDRAWN FROM YOUR ACCOUNT, CURRENT BALANCE = " + (BALANCE - with));
                                break;
                            } else {
                                System.out.println("TRANSACTION NOT POSSIBLE, PLEASE ENSURE TO ENTER AN AMOUNT BETWEEN 100 AND 20K // MAINTAIN A MINIMUM BALANCE OF 500// ");
                            }
                            break;
                        case 'D':
                            System.out.println("___________________");
                            break;
                        default:
                            System.out.println("INVALID OPTION");
                            break;
                    }

                } while (option != 'D');
                System.out.println("THANK YOU FOR USING OUR SERVICE.....");
            } else {
                System.out.println("INVALID PIN");
            }
        }else {
            System.out.println(name+" HAS SUCCESSFULLY CREATED HIS ACCOUNT.");
        }
    }
}
public class Bank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String choose;
        System.err.println("WELCOME TO INDIAN OVERSEAS BANK SERVICES");
        System.out.println("A.CREATE A NEW ACCOUNT");
        System.out.println("B.ATM SERVICE");
        System.out.println("CHOOSE YOUR ACTION: ");
        choose = scan.next();
        
        if (choose.equals("A")){
            BankSub obj = new BankSub();
            obj.detailsInput();
            obj.detailsOutput();
            obj.transactionMode();
    }
        else if (choose.equals("B")){


            int ACCOUNT = 10000;
            String USERNAME = "user@IOBIFSC-2126578745";

            //THIS IS A RANDOM ACCOUNT WITH USERNAME:user@IOBIFSC-2126578745, PASSWORD:123, ACCOUNT BALANCE =10000.

            try {

                System.out.println("INDIAN OVERSEAS BANK ATM SERVICES");
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
                System.err.println("ACCESS DENIED, KINDLY RE-INSERT YOUR CARD AND CAREFULLY ENTER THE PIN NUMBER ");
            }
        }
    }
}