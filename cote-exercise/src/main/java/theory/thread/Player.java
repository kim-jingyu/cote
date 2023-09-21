package theory.thread;

public class Player extends Thread {
    private String name;
    private MagicBox magicBox;

    public Player(String name, MagicBox magicBox) {
        this.name = name;
        this.magicBox = magicBox;
    }

    @Override
    public void run() {
        if ("kim".equals(name)) {
            magicBox.star();
        } else {
            System.out.println("nothing");
        }
    }
}
