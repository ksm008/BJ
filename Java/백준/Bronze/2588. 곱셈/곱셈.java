import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int result1 = (num2 % 10) * num1;
        int result2 = ((num2 / 10) % 10) * num1;
        int result3 = ((num2 / 100) % 10) * num1;;
        int result4 = num1 * num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}