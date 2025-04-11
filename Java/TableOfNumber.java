public class TableOfNumber {
    public static void main(String[ ] args) {
        int num = 9;
        int i = 1;

        System.out.println("Table of " + num + ":");
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i = i + 1;
        }
    }
}
