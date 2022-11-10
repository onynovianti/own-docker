import java.util.Scanner;

public class Ucapan {
    public static void main(String[] args) {
        //System.out.println("Hello docker. :)");
	Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
	System.out.print("Masukkan Jenis Kelamin (L/P): ");
	char val = sc.next().charAt(0);
	System.out.print("Masukkan nama: ");
	String val1 = sc1.nextLine();
	ucapan(val, val1);
    }

    static void ucapan(char val, String val1) {
        if(val == 'L') System.out.printf("Selamat Malam %s yang ganteng", val1);
        else System.out.printf("Selamat Malam %s yang cantik", val1);
    }
}
