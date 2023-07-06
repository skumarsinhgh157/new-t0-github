import java.util.Scanner;
public class revise {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.println("Enter a number ");

        int nenom = object.nextInt();

        if (nenom % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("ODD number");

        }
    }
}
