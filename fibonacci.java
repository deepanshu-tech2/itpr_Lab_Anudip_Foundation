
import java.util.Scanner;

 public class fibonacci{
    public static void main(String[] args) {
        int a = 0, b = 1;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i =1 ;i<=n;i++){
                System.out.println(a+"");
                int next = a+b;
                a=b;
                b= next;
            }
        }
       


    }
}