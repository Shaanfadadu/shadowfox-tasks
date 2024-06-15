import java.util.Scanner;
import java.lang.Math;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            while(true){  //while is for continious repeatation after getting result each time 

            System.out.println("Calculator");
            System.out.println("Choose an option:");
            System.out.println("1: Basic calculations ");
            System.out.println("2: Scientific Calculations (sin, cos, log)");
            System.out.println("3: Unit Conversions (cm to inches, inches to foots)");
            System.out.println("4: Exit");
            int choice = sc.nextInt();

            
            switch (choice) {
                case 1:
                    basicArithmetic(sc);
                    break;
                case 2:
                    scientificCalculations(sc);
                    break;
                case 3:
                    unitConversions(sc);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
             }
         }

    }

    private static void basicArithmetic(Scanner sc) {
        System.out.println("Enter first number:");
        double n1 = sc.nextDouble();

        
        System.out.println("Enter second number:");
        double n2 = sc.nextDouble();
       
        System.out.println("Enter an operator (+, -, *, /):");
        String operator = sc.next();


        double result = 0;

        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error: Division by zero not possible.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator. Please try again.");
                return;
        }

      try{
            System.out.println("The result is: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic error occured");
        }  
    }

    private static void scientificCalculations(Scanner sc) {
        System.out.println("Choose a function: sin, cos, log");
        String function = sc.next();

        System.out.println("Enter the number:");
        double num = sc.nextDouble();

        double result = 0;

        switch (function) {
            case "sin":
                result = Math.sin(Math.toRadians(num));
                break;
            case "cos":
                result = Math.cos(Math.toRadians(num));
                break;
            case "log":
                if (num > 0) {
                    result = Math.log10(num);
                } else {
                    System.out.println("Error: Logarithm of non-positive number.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid function. Please try again.");
                return;
        }

        System.out.println("The result is: " + result);
    }

    private static void unitConversions(Scanner sc) {
        System.out.println("Choose a conversion: 1) cm to inches  2) inches to foots");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                System.out.println("Enter centimeters:");
                double cm = sc.nextDouble();
                    result = cm / 2.54;
                System.out.println(cm + " cm is " + result + " inches.");
                break;
                
            case 2:
                System.out.println("Enter inches:");
                double inch = sc.nextDouble();
                result = inch * 0.0833;
                System.out.println(inch + " inches is " + result + "foots.");
                break;
            default:
                System.out.println("Invalid conversion choice. Please try again.");
        }
    }
}
