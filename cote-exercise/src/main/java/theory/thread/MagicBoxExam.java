package theory.thread;

public class MagicBoxExam {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();

        Player p1 = new Player("kim", magicBox);
        Player p2 = new Player("kim", magicBox);

        p1.start();
        p2.start();
    }
}
