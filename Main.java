public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int sum1 = a+b;
        int sum2 = c+d;
        System.out.println(sum1 < sum2);

        sum1 = sum1++;
        sum2 = sum2--;
        sum2 = sum2--;

        System.out.println(sum1 < sum2);

        System.out.println(sum1 % 2 == 0 || sum2 % 2 == 0);

    }
}
