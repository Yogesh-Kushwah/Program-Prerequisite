import java.util.Scanner;

public class AreaCircle{

public static void main(String args[])
{

Scanner Sc=new Scanner(System.in);

int radius= Sc.nextInt();
float Area = (float)(3.14 * radius * radius);


 System.out.println("The Area of Circle is: "+ Area);
}
}