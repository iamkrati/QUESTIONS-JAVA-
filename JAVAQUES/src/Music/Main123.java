package Music;
interface Playable{
    void play();
}
public class Main123 implements Playable{
    @Override
    public void play() {
        System.out.println("This is a play method");
    }

    public static void main(String[] args) {
        Main123 obj =new Main123();
        obj.play();
    }
}
