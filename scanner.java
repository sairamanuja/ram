import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner rm = new Scanner(System.in);
{

    System.out.println("enter num 1");
    float a = rm.nextFloat();
    System.out.println("enter num 2");
    float b = rm.nextFloat();

    float sum = a + b;

System.out.println("te sum of te numbers is : ");
System.out.println(sum);

rm.close();
}
    }
    
}
