import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        for (int i = 0; i <= 1000 ; i++) { //Checks the range 0 - 1000
            if (a * i * i * i + b * i * i + c * i + d == 0) { //Equation for the cubic equation
                System.out.println(i);
            } else {
                System.out.print("");
                //else
            }
            
        }
        
        
           
    }
}
