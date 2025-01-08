import java.util.Scanner;

public class TempCoversion{

public static void main(String args[])
{

Scanner Sc=new Scanner(System.in);

System.out.println("Enter The Temperature in Celsius");
int Temp= Sc.nextInt();

int  Fahrenheit = (int)((Temp * 9/5) + 32);


 System.out.println("The Temperature is: "+ Fahrenheit +"Fahrenheit");
}
}