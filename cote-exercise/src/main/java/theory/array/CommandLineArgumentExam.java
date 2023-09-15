package theory.array;

public class CommandLineArgumentExam {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("args.length == 0");
            System.exit(0); // 프로그램 종료.
        }

        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
    }
}
