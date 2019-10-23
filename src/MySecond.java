import java.util.Scanner;


public class MySecond {
    public static void main(String args[]) {
        System.out.println("What`s up!");
        System.out.println("I love soccer.");
        System.out.println("bye");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String userResponse = keyboard.nextLine();
        System.out.println("Your name is smile" + userResponse);

        int firstNo, secondNo, thirdNo, sum;
        System.out.println("Enter your first number:");
        firstNo = keyboard.nextInt();
        System.out.println("Enter your second number:");
        secondNo = keyboard.nextInt();
        System.out.println("Enter your third number:");
        thirdNo = keyboard.nextInt();
        sum= firstNo + secondNo + thirdNo ;
        System.out.println("int = firstNo + SecondNo + third number:");
        System.out.println("Sum of" + firstNo + "and" +secondNo + "is"  +"SecondNo");



    }







}






