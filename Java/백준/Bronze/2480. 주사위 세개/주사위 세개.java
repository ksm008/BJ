import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(sc.nextInt());
        list1.add(sc.nextInt());
        list1.add(sc.nextInt());
        Collections.sort(list1);

        if (list1.get(0) == list1.get(1) && list1.get(1) == list1.get(2)) {
            System.out.println(10000 + list1.get(0) * 1000);
        } else if (list1.get(0) == list1.get(1)) {
            System.out.println(1000 + list1.get(0) * 100);
        } else if (list1.get(1) == list1.get(2)) {
            System.out.println(1000 + list1.get(1) * 100);
        } else if (list1.get(0) == list1.get(2)) {
            System.out.println(1000 + list1.get(0) * 100);
        } else {
            System.out.println(list1.get(2) * 100);
        }
    }
}