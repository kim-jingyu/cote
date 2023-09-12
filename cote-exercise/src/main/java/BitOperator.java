public class BitOperator {
    public static void main(String[] args) {
        int a = -4; // 1100
        System.out.println("Integer.toBinaryString(a) = " + Integer.toBinaryString(a));
        int b = a >> 1;
        System.out.println("Integer.toBinaryString(b) = " + Integer.toBinaryString(b));
        System.out.println("b = " + b);

        int c = a >>> 2;
        System.out.println("Integer.toBinaryString(c) = " + Integer.toBinaryString(c));
        System.out.println("c = " + c);
    }
}
