import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int plus = num1 + num2;
        int minus = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int remain = num1 % num2;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(remain);
    }
}