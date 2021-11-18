import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum5=0;
        int sum4=0;
        int sum3=0;
        int sum2=0;
        for(int i =0;i<a;i++){
            int k = sc.nextInt();
            switch (k) {
                case 5:
                    sum5++;
                    break;
                case 4:
                    sum4++;
                    break;
                case 3:
                    sum3++;
                    break;
                case 2:
                    sum2++;
                    break;
            }
        }
        System.out.println(sum2 + " " + sum3 + " " + sum4 + " " + sum5);

    }
}