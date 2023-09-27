import java.util.Scanner;

public class t3_input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //? Created a scanner object
        System.out.println("Enter Your name: ");
        String name = inp.nextLine(); //? Getting input from user
        System.out.println("Have a good day "+name);
    }
}
//! The Scanner class is used to get user input, and it is found in the java.util package.To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.