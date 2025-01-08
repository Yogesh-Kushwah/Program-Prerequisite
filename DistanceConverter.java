import java.util.Scanner;

public class DistanceConverter{

public static void main(String args[])
{

Scanner Sc=new Scanner(System.in);

System.out.println("Enter the Distance in Km: ");
int Distance= Sc.nextInt();

 double Miles = Distance * 0.621371;

 System.out.println("The Miles of the Km "+ Distance +"is: "+ Miles);
}
}