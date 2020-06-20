package come.codewithiqra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Input a number(string):");
        String n = io.nextLine();
        int result = Integer.parseInt(n);
        System.out.printf("The integer value is: %d", result);

    }
}
