import java.util.*;
import java.security.SecureRandom;

public class week201 {
    public static void main(String[] args){
        var treeSet = new TreeSet<>();
        SecureRandom random = new SecureRandom();

        System.out.println("電腦從1~100的整數中，亂數取出10個不重複的號碼......");
        for(int i = 1; i <= 10; i++){
            int num = 1 + random.nextInt(100);
            while(treeSet.contains(num)){
                num = 1 + random.nextInt(100);
            }
            treeSet.add(num);
            System.out.printf("第%d個號碼：%d\n", i, num);
        }
        
        System.out.printf("物件內元素個數為：%d\n", treeSet.size());
        System.out.println("物件內元素的內容：" + treeSet);
        System.out.println("第一個元素內容為：" + treeSet.first());
        System.out.println("最後一個元素內容：" + treeSet.last());
        System.out.println("內容介於30~70者：" + treeSet.subSet(30, 70));
    }
}
