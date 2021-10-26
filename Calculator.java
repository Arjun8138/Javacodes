import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        int num1 = scan.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int num2 = scan.nextInt();

        System.out.println("SELECT YOUR OPERATION --> PRESS A FOR ADDITION, PRESS S FOR SUBTRACTION, PRESS M FOR MULTIPLICATION, PRESS D FOR DIVISION, PRESS m FOR MODULUS");
        String letter = scan.next();
        if(letter.equals("A")){
            System.out.println("SUM OF "+num1+" AND "+num2+" IS "+(num1+num2));
            System.exit(0);
        }
        else if (letter.equals("S")){
            System.out.println("DIFFERENCE OF "+num1+" AND "+num2+ " IS "+(num1-num2));
            System.exit(0);
        }
        else if(letter.equals("M")){
            System.out.println("PRODUCT OF "+num1+" AND "+num2+" IS "+(num1*num2));
            System.exit(0);
        }
        else if(letter.equals("D")){
            System.out.println("QUOTIENT OF "+num1+" AND "+num2+" IS "+(num1/num2));
            System.exit(0);
        }
        else if(letter.equals("m")){
            System.out.println("MODULUS OF "+num1+" AND "+num2+" IS "+(num1%num1));
        }else {
            System.out.println("INVALID ALPHABET ENTERED !! ");
        }

    }
}