import java.util.Scanner;

public class AverageCalci{

public static void main(String args[])
{

Scanner Sc=new Scanner(System.in);

System.out.print("Enter the First no: ");
int num1= Sc.nextInt();

System.out.print("Enter the Second no ");
int num2=Sc.nextInt();

System.out.print("Enter the Third no ");
int num3=Sc.nextInt();

float average= (num1+num2+num3)/3;

 System.out.println("The Average of the Three number is: "+average);
}
}