import java.util.Scanner;

public class converter {
    public static void main(String[] args)
    {
        Scanner convert = new Scanner(System.in);
        System.out.println("Enter the Amount in Indian Rupee");
        float rupee = convert.nextFloat() ;

        float dollar = rupee * 80 ;
        System.out.println("Amount in Dollar - " + dollar) ;
    }
}
