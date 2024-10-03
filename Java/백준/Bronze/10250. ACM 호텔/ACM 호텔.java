import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] guest = br.readLine().split(" ");
            int TotalFloor = Integer.parseInt(guest[0]);
            int RoomPerFloor = Integer.parseInt(guest[1]);
            int guestNum = Integer.parseInt(guest[2]);

            if (TotalFloor * RoomPerFloor < guestNum) {
                continue;
            }

            int guestFloor = guestNum % TotalFloor;
            if (guestFloor == 0) {
                guestFloor = TotalFloor;
            }
            //1. 01번째 방이려면 입장 순서가 층수와 같거나 작아야 함.
            //2. 만약 층 수와 입장 순서가 같을 경우도 01번째 방이어야 함.
            //3. 그 이후로는 나머지 값이 0일 때만 그대로, 0이 아닐땐 +1.
            int guestRoom = (guestNum / TotalFloor);
            if (TotalFloor >= guestNum) {
                guestRoom = 1;
            } else if (guestNum % TotalFloor != 0) {
                guestRoom += 1;
            }

            bw.write(guestFloor + String.format("%02d", guestRoom)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}