import java.util.Scanner;

public class forVar304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil, n;
        boolean berhenti = false;
        for (n = 0; !berhenti; n++) {
            System.out.println("Masukkan bilangan: ");
            bil = sc.nextInt();
            System.out.println("Bilangan yang Anda masukkan: " + bil);
            if (bil < n) {
                berhenti = true;
            }
        }
        System.out.println("Program berakhir");
    }
}