import java.util.Scanner;
public class Gcd
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter two numbers " );

        int a = kb.nextInt();
        int b = kb.nextInt();

        if(a > b) {
            if (a % b == 0) {
                System.out.println("Gcd is " + b);
            }
        } else
            {
                if(b % a == 0)
                {
                    System.out.println("Gcd is "+ a);
                }
                   else
                   {
                    for(int i = 1 ; i < b; i++)
                    {
                        if (a % i == 0 && b % i == 0) {
                            System.out.println("Gcd is =" + i);
                        }
                    }

                            System.out.println("Gcd is 1");
                    }


            }


    }

}

