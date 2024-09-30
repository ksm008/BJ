import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int oven = sc.nextInt();

        int TotalM = minute + oven;
        int TotalH = hour + (TotalM / 60);

        if (TotalM > 59) {
            TotalM = TotalM % 60;
        }
        if (TotalH > 23) {
            TotalH = TotalH % 24;
        }

        System.out.println(TotalH + " " + TotalM);
    }
}