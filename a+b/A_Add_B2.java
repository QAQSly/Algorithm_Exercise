import java.util.Scanner;
public class A_Add_B2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (s.hasNext()) {
            while (n-- > 0) {
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println(a + b);
            }
        }
    }
}
