public class reverseint {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;

        while (num != 0) { // number shouldnt be zero 122345 != 0
            rev = rev * 10 + num % 10; // num%10 gives the remainder thats 5
            num = num / 10; // 1234
        }
        System.out.println("Reverse number is::" + rev);
    }
}