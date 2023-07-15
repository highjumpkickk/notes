public class Main {

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {

        boolean isATeen = false;

        if ((num1 >= 13) && (num1 <= 19)) {
            isATeen = true;
        }
        if ((num2 >= 13) && (num2 <= 19)) {
            isATeen = true;
        }
        if ((num3 >= 13) && (num3 <= 19)) {
            isATeen = true;
        }

        if (isATeen == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int num1) {

        if ((num1 >= 13) && (num1 <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}
