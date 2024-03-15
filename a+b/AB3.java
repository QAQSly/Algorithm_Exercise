import java.util.Scanner;
public class AB3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a == 0 && b == 0)
                break;
            System.out.println(a + b);
        }
    }
}
