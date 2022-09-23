import java.util.*;

public class week202 {
    public static void main(String[] args){
        var hmap = new HashMap<>();
        hmap.put(1, "January");
        hmap.put(2, "February");
        hmap.put(3, "March");
        hmap.put(4, "April");
        hmap.put(5, "May");
        hmap.put(6, "June");
        hmap.put(7, "July");
        hmap.put(8, "August");
        hmap.put(9, "September");
        hmap.put(10, "October");
        hmap.put(11, "November");
        hmap.put(12, "December");

        System.out.printf("%s", "請輸入 1 ~ 12? ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        while(month > 12 || month < 1){
            System.out.println("範圍錯誤");
            System.out.printf("%s", "請輸入 1 ~ 12? ");
            month = sc.nextInt();
        }
        System.out.printf("第%d月的英文單字為%s\n", month, hmap.get(month));

    }
}
