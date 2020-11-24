    public class Bits {

    public static void printBin(int n) {
        System.out.println(Integer.toBinaryString(n));
    }

    public static int getBit(int n, int i) {
        return (n & (1 << i)) >> i;
    }

    public static int setTo1(int n, int i) {
        return n | (1 << i);
    }

    public static int setTo0(int n, int i) {
        return n & ~(1 << i);
    }

    public static void main(String[] args) {
        printBin(getBit(4, 1));
        printBin(setTo1(0b100111, 3));
    }

}
