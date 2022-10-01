import java.security.SecureRandom;

class system implements Runnable{

    static int ticket = 10000;
    int tTicket;
    static int tQuantity;
    Thread t;
    static SecureRandom random = new SecureRandom();

    system(String name){
        tTicket = 0;
        tQuantity = 0;
        t = new Thread(this, name);
        t.start();
    }

    public void run(){
        synchronized(this){
            while(buyTicket() == true){
                tTicket += tQuantity;
            }
            System.out.println(t.getName() + "共賣了" + tTicket + "張票");
        }
    }

    synchronized private static boolean buyTicket(){ 
        if(ticket > 0){
            tQuantity = 1 + random.nextInt(4);
            if(ticket - tQuantity >= 0){
                ticket -= tQuantity;
                return true;
            } else {
                tQuantity = 0;
                while(ticket > 0){
                    ticket--;
                    tQuantity++;
                }
                return true;
            }
        } else {
            return false;
        }
    }
}

public class week3 {
    public static void main(String[] args){

        system tA = new system("售票機1");
        system tB = new system("售票機2");
        system tC = new system("售票機3");
        system tD = new system("售票機4");
    }
}
