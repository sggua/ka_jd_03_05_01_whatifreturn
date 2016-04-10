package im.sgg.ka.jd.les06.les06_05_01;

/**
 * Created by sergiy on 10.04.16.
 * Java Developer lessons
 * kademika.com
 */
public class Launcher {
    public static void main(String[] args) {
        try {
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("I want to be executed!");
        }
    }
}
