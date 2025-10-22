
import java.util.Scanner;

public class belajarvariabel {
    public static void main(String[] args) {
        int nUmur;
        try (Scanner ns = new Scanner(System.in)) {
            System.out.println("masukkan umur");
            nUmur = ns.nextInt();
            System.out.println("umur anda adalah " + nUmur);
            ns.close();
        }
    
    }
}