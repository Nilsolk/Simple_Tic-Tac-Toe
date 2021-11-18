import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int unit= sc.nextShort();
        if (unit < 1){
            System.out.println("no army");
        }
        else if (0 < unit && unit  < 20){
            System.out.println("pack");
        }
        else if (20 <= unit && unit  < 250){
            System.out.println("throng");
        }
        else if (249 <= unit && unit  < 1000){
            System.out.println("zounds");
        }
        else{
            System.out.println("legion");
        }


    }
}