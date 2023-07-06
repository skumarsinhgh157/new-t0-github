import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner lar = new Scanner(System.in);

        System.out.println("enter two numbers ");
        int a = lar.nextInt();
        int b = lar.nextInt();

        if (a > b) {
            System.out.println(a + " is larger number");

        } else {
            System.out.println(b + " b is larger number ");
        }
    }
}
