import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f,k,b,m,t;
        System.out.print("Fizik Notu: ");
        f = scanner.nextInt();
        if (f<0 || f>100){
            f = 0;
        }
        System.out.print("Kimya Notu: ");
        k = scanner.nextInt();
        if (k<0 || k>100){
            k = 0;
        }
        System.out.print("Biyoloji Notu: ");
        b = scanner.nextInt();
        if (b<0 || b>100){
            b = 0;
        }
        System.out.print("Matematik Notu: ");
        m = scanner.nextInt();
        if (m<0 || m>100){
            m = 0;
        }
        System.out.print("Tarih Notu: ");
        t = scanner.nextInt();
        if (t<0 || t>100){
            t = 0;
        }

        double ort = (f+k+b+m+t)/5;
        if (ort <=54){
            System.out.println("Kaldınız");
        }
        else {
            System.out.println("Geçtiniz");
        }
        System.out.println("Ortalamanız: "+ort);
    }
}