import java.util.Scanner;

public class CylinderVol{

public static void main(String args[])
{

Scanner Sc=new Scanner(System.in);

System.out.println("Enter the radius of cylinder!");
int radius= Sc.nextInt();

System.out.println("Enter the height of cylinder!");
int height=Sc.nextInt();

double Volume = 3.14 * radius* radius * height;

 System.out.println("The Volume of Cylinder is: "+ Volume);
}
}