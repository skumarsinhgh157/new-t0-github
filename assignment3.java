import java.util.Scanner ;
public class assignment3 {

    public static void main(String[]args) {
        Scanner intern = new Scanner(System.in);

        System.out.println("Enter principle Amount");
        System.out.println("Rate");
        System.out.println("TIME IN months ");

        int priciple = intern.nextInt();
        float rate = intern.nextFloat();
        int time = intern.nextInt();

        double simple = (priciple * rate * time) / 100;
        System.out.println("Simple INREST = " + simple);
    }
}
