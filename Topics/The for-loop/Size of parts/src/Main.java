import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = 0;
        int c = 0;
        int b = 0;
        for (int i = 0; i < a; i++){
            int k = sc.nextInt();
            if (k == 0) {
                m++;
            }
            if (k == -1) {
                c++;
            }
            if(k == 1) {
                b++;
            }
        }
        System.out.println(m + " " + b + " " + c);
    }
}
