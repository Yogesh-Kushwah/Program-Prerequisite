import java.util.Scanner;

public class SimpleInterest{

public static void main(String args[])
{

Scanner Sc=new Scanner(System.in);

System.out.println("Enter the Principal!");
int Principal= Sc.nextInt();

System.out.println("Enter the Rate % ");
int Rate=Sc.nextInt();

System.out.println("Enter the Duration in year!");
int Time=Sc.nextInt();

double SimpleInterest = (Principal * Rate * Time) / 100;

 System.out.println("The Simple Interest is: "+ SimpleInterest);
}
}