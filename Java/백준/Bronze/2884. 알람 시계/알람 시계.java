import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int resultM = minute - 45;

        if (resultM < 0) {
            hour -= 1;
            resultM += 60;
            if (hour < 0) {
                hour += 24;
            }
        }

        System.out.println(hour + " " + resultM);
    }
}