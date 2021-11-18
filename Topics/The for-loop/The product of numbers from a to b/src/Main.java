import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long sum = 1;
        for (long i = a; i < b; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
