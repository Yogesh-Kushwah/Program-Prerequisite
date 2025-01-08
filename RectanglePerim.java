import java.util.Scanner;

public class RectanglePerim{

public static void main(String args[])
{

Scanner Sc=new Scanner(System.in);

System.out.println("Enter the Length");
int length= Sc.nextInt();

System.out.println("Enter the width ");
int width=Sc.nextInt();


int Perimeter = 2 * (length + width);

 System.out.println("The Perimeter of rectangle is: "+ Perimeter);
}
}