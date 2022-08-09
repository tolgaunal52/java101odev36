import java.util.Scanner;

public class odev36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int a=input.nextInt();
        asalsayi(a,2);
    }
    static void asalsayi(int a,int i){
        if (i == a) {
            System.out.print(a + " asal sayıdır.");
            return;
        } else if (a%i == 0) {
            System.out.print(a + " asal sayı değildir.");
            return;
        }

        asalsayi(a, i + 1);

    }
}