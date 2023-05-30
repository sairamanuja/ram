import java.util.Scanner;

public class name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("what is your name");

        String str = sc.next();

        System.out.println("hello "  + str + " have a good day");
        sc.close();
    }
    
}
