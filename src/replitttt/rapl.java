package replitttt;

import java.util.LinkedList;
public class rapl {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();

        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                obj.add(i);
            }
        }
        System.out.println(obj);
    }
}
