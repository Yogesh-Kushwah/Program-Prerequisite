import java.util.Scanner;

public class PowerCalci{

public static void main(String args[])
{

Scanner Sc=new Scanner(System.in);

System.out.print("Enter the Base number: ");
int Base= Sc.nextInt();

System.out.print("Enter the Exponent ");
int exponent=Sc.nextInt();


int Power = (int)(Math.pow(Base,exponent));

 System.out.println("The Power of the Number is: "+ Power);
}
}